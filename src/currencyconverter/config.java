/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package currencyconverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Cthulu
 */
public class config {
    
   ArrayList<String> currencyNames=new ArrayList<String>();
    
    
    public void getJSON(JComboBox jComboBox1, JComboBox jComboBox2)
    {
        JSONParser parser = new JSONParser();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        Path path=Paths.get("currency.json");
        try
        {
            byte[] fileArray=Files.readAllBytes(path);
            String config=new String(fileArray);
            Object obj=parser.parse(config);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray units = (JSONArray) jsonObject.get("units");
            for(int i=0; i<units.size();i++)
            {
                JSONObject currency=(JSONObject) units.get(i);
                currencyNames.add((String)currency.get("CountryCurrency"));
                jComboBox1.addItem(currency.get("Units")); 
                jComboBox2.addItem(currency.get("Units")); 
            }
        }catch(IOException e) {
            System.out.println(e);
        }catch (ParseException e) {
            e.printStackTrace();
	}
    } 

    
}
