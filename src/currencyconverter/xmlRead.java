/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package currencyconverter;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author Cthulu
 */
public class xmlRead {
    
    public void convertCurrency(XmlReader reader,JComboBox jComboBox1,JComboBox jComboBox2,JTextField txtResults, JTextField txtFromCurrency, JTextField txtToCurrency, JLabel jLabel6 )
    {
         try{
                    URL url = new URL("http://themoneyconverter.com/rss-feed/"+jComboBox1.getSelectedItem()+"/rss.xml");
                    reader=new XmlReader(url);
                    SyndFeed feed=new SyndFeedInput().build(reader);
                    for(Iterator i=feed.getEntries().iterator(); i.hasNext();)
                    {
                        SyndEntry entry = (SyndEntry) i.next();
                        String[] codes = entry.getTitle().split("/");
                        if(codes[0].equals(jComboBox2.getSelectedItem()))
                        {
                           System.out.println(entry.getTitle());
                           String[] exchange=entry.getDescription().getValue().split("=");
                           String[] conversionFrom=exchange[0].split(" ");
                           String[] conversionTo=exchange[1].split(" ");
                           txtResults.setText(conversionTo[1]);
                           double currencyFrom=Double.parseDouble(txtFromCurrency.getText());
                           double currencyExchange=Double.parseDouble(conversionTo[1]);
                           double result=currencyFrom * currencyExchange;
                           System.out.println(result);
                           txtToCurrency.setText(String.valueOf(result));  
                        }   
                    }   
         } 
               catch(MalformedURLException ex)
                {
                    System.out.println("Bad Url");
                }
                catch(FeedException ex)
                {
                    System.out.println("Feed exception");
                }
               catch(IOException ex)
                {
                    System.out.println("IO Exception");
                }
               catch (NumberFormatException ex)
                {
                  jLabel6.setText("Please Enter a Number");
                }
    }
}


