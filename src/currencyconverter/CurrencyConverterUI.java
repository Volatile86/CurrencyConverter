/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package currencyconverter;

import java.net.URL;
import java.util.Iterator;
import java.net.MalformedURLException; 
//import com.sun.syndication.feed.synd.SyndEntry;
//import com.sun.syndication.feed.synd.SyndFeed;
//import com.sun.syndication.io.SyndFeedInput;
//import com.sun.syndication.io.XmlReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Cthulu
 */
public class CurrencyConverterUI extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyConverterUI
     */
    public CurrencyConverterUI() {
        initComponents();
        JSONParser parser = new JSONParser();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
       try
       {
       //Was giving me trouble when I was trying to read from a file. It was saying that there was a '`' character at position 0
       Object obj = parser.parse("{\"units\":[{\"CountryCurrency\":\"United Arab Emirates Dirham\",\"Units\":\"AED\"},{\"CountryCurrency\":\"Argentine Peso\",\"Units\":\"ARS\"},{\"CountryCurrency\":\"Australian Dollar\",\"Units\":\"AUD\"},{\"CountryCurrency\":\"Aruban Florin\",\"Units\":\"AWG\"},{\"CountryCurrency\":\"Bosnia and Herzegovina convertible mark\",\"Units\":\"BAM\"},{\"CountryCurrency\":\"Barbadian Dollar\",\"Units\":\"BBD\"},{\"CountryCurrency\":\"Bangladeshi Taka\",\"Units\":\"BDT\"},{\"CountryCurrency\":\" Bulgarian Lev\",\"Units\":\"BGN\"},{\"CountryCurrency\":\"Bahraini Dinar\",\"Units\":\"BHD\"},{\"CountryCurrency\":\" Bermudian Dollar\",\"Units\":\"BMD\"},{\"CountryCurrency\":\"Bolivian Boliviano\",\"Units\":\"BOB\"},{\"CountryCurrency\":\"Brazilian Real\",\"Units\":\"BRL\"},{\"CountryCurrency\":\"Bahamian Dollar\",\"Units\":\"BSD\"},{\"CountryCurrency\":\"Canadian Dollar\",\"Units\":\"CAD\"},{\"CountryCurrency\":\"Swiss Franc\",\"Units\":\"CHF\"},{\"CountryCurrency\":\"Chilean Peso\",\"Units\":\"CLP\"},{\"CountryCurrency\":\"Chinese Yuan\",\"Units\":\"CNY\"},{\"CountryCurrency\":\"Colombian Peso\",\"Units\":\"COP\"},{\"CountryCurrency\":\"Czech Koruna\",\"Units\":\"CZK\"},{\"CountryCurrency\":\"Danish Krone\",\"Units\":\"DKK\"},{\"CountryCurrency\":\"Dominican Peso\",\"Units\":\"DOP\"},{\"CountryCurrency\":\"Egyptian Pound\",\"Units\":\"EGP\"},{\"CountryCurrency\":\" Euro\",\"Units\":\"EUR\"},{\"CountryCurrency\":\"Fijian Dollar\",\"Units\":\"FJD\"},{\"CountryCurrency\":\"British Pound Sterling\",\"Units\":\"GBP\"},{\"CountryCurrency\":\"Ghana Cedi\",\"Units\":\"GHS\"},{\"CountryCurrency\":\"Gambian Dalasi\",\"Units\":\"GMD\"},{\"CountryCurrency\":\"Guatemalan Quetzal\",\"Units\":\"GTQ\"},{\"CountryCurrency\":\"Hong Kong Dollar\",\"Units\":\"HKD\"},{\"CountryCurrency\":\"Croatian Kuna\",\"Units\":\"HRK\"},{\"CountryCurrency\":\"Hungarian Forint\",\"Units\":\"HUF\"},{\"CountryCurrency\":\"Indonesian Rupiah\",\"Units\":\"IDR\"},{\"CountryCurrency\":\"Israeli Sheqel\",\"Units\":\"ILS\"},{\"CountryCurrency\":\"Indian Rupee\",\"Units\":\"INR\"},{\"CountryCurrency\":\"Icelandic Krona\",\"Units\":\"ISK\"},{\"CountryCurrency\":\"Jamaican Dollar\",\"Units\":\"JMD\"},{\"CountryCurrency\":\"Jordanian Dinar\",\"Units\":\"JOD\"},{\"CountryCurrency\":\"Japanese Yen\",\"Units\":\"JPY\"},{\"CountryCurrency\":\"Kenyan Shilling\",\"Units\":\"KES\"},{\"CountryCurrency\":\"Cambodian Riel\",\"Units\":\"KHR\"},{\"CountryCurrency\":\"South Korean Won\",\"Units\":\"KRW\"},{\"CountryCurrency\":\"Kuwaiti Dinar\",\"Units\":\"KWD\"},{\"CountryCurrency\":\"Lao Kip\",\"Units\":\"LAK\"},{\"CountryCurrency\":\"Lebanese Pound\",\"Units\":\"LBP\"},{\"CountryCurrency\":\"Sri Lankan Rupee\",\"Units\":\"LKR\"},{\"CountryCurrency\":\"Lithuanian Litas\",\"Units\":\"LTL\"},{\"CountryCurrency\":\"Moroccan Dirham\",\"Units\":\"MAD\"},{\"CountryCurrency\":\"Moldovan Leu\",\"Units\":\"MDL\"},{\"CountryCurrency\":\"Malagasy Ariary\",\"Units\":\"MGA\"},{\"CountryCurrency\":\" Macedonian Denar\",\"Units\":\"MKD\"},{\"CountryCurrency\":\"Mauritian Rupee\",\"Units\":\"MUR\"},{\"CountryCurrency\":\"Maldivian Rufiyaa\",\"Units\":\"MVR\"},{\"CountryCurrency\":\"Mexican Peso\",\"Units\":\"MXN\"},{\"CountryCurrency\":\"Malaysian Ringgit\",\"Units\":\"MYR\"},{\"CountryCurrency\":\"Namibian Dollar\",\"Units\":\"NAD\"},{\"CountryCurrency\":\"Nigerian Naira\",\"Units\":\"NGN\"},{\"CountryCurrency\":\" Norwegian Krone\",\"Units\":\"NOK\"},{\"CountryCurrency\":\"Nepalese Rupee\",\"Units\":\"NPR\"},{\"CountryCurrency\":\"New Zealand Dollar\",\"Units\":\"NZD\"},{\"CountryCurrency\":\"Omani Rial\",\"Units\":\"OMR\"},{\"CountryCurrency\":\"Panamanian Balboa\",\"Units\":\"PAB\"},{\"CountryCurrency\":\"Peruvian Sol\",\"Units\":\"PEN\"},{\"CountryCurrency\":\"Philippine Peso\",\"Units\":\"PHP\"},{\"CountryCurrency\":\"Pakistani Rupee\",\"Units\":\"PKR\"},{\"CountryCurrency\":\"Polish Zloty\",\"Units\":\"PLN\"},{\"CountryCurrency\":\"Paraguayan Guaraní\",\"Units\":\"PYG\"},{\"CountryCurrency\":\"Qatari Riyal\",\"Units\":\"QAR\"},{\"CountryCurrency\":\"Romanian Leu\",\"Units\":\"RON\"},{\"CountryCurrency\":\"Serbian Dinar\",\"Units\":\"RSD\"},{\"CountryCurrency\":\"Russian Rouble\",\"Units\":\"RUB\"},{\"CountryCurrency\":\"Saudi Riyal\",\"Units\":\"SAR\"},{\"CountryCurrency\":\"Seychellois Rupee\",\"Units\":\"SCR\"},{\"CountryCurrency\":\"Swedish Krona\",\"Units\":\"SEK\"},{\"CountryCurrency\":\"Singapore Dollar\",\"Units\":\"SGD\"},{\"CountryCurrency\":\"Syrian Pound\",\"Units\":\"SYP\"},{\"CountryCurrency\":\"Thai Baht\",\"Units\":\"THB\"},{\"CountryCurrency\":\"Tunisian Dinar\",\"Units\":\"TND\"},{\"CountryCurrency\":\"Turkish Lira\",\"Units\":\"TRY\"},{\"CountryCurrency\":\"Taiwanese Dollar\",\"Units\":\"TWD\"},{\"CountryCurrency\":\"Ukraine Hryvnia\",\"Units\":\"UAH\"},{\"CountryCurrency\":\"Ugandan Shilling\",\"Units\":\"UGX\"},{\"CountryCurrency\":\"United States Dollar\",\"Units\":\"USD\"},{\"CountryCurrency\":\"Uruguayan Peso\",\"Units\":\"UYU\"},{\"CountryCurrency\":\"Venezuelan Bolívar\",\"Units\":\"VEF\"},{\"CountryCurrency\":\"Vietnamese Dong\",\"Units\":\"VND\"},{\"CountryCurrency\":\"Central African Franc\",\"Units\":\"XAF\"},{\"CountryCurrency\":\"East Caribbean Dollar\",\"Units\":\"XCD\"},{\"CountryCurrency\":\"West African Franc\",\"Units\":\"XOF\"},{\"CountryCurrency\":\"CFP Franc\",\"Units\":\"XPF\"},{\"CountryCurrency\":\"South African Rand\",\"Units\":\"ZAR\"}]}");
       JSONObject jsonObject = (JSONObject) obj;
       JSONArray units = (JSONArray) jsonObject.get("units");
       for(int i=0; i<units.size();i++)
       {
           JSONObject currency=(JSONObject) units.get(i);
           
           jComboBox1.addItem(currency.get("Units")); 
           jComboBox2.addItem(currency.get("Units")); 
       }
        }  catch (ParseException e) {
		e.printStackTrace();
	}
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Currency Converter 2000");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField2.setText("jTextField2");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("To");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Result:");

        jTextField3.setText("jTextField3");

        jButton1.setText("Convert");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Update");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(jTextField1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 88, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jComboBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverterUI().setVisible(true);
            }
        });
         
//        try
//        {
//           URL conversionURL = new URL("http://themoneyconverter.com/rss-feed/AED/rss.xml");
//        }
//        catch(MalformedURLException e)
//         {
//             System.out.print(e);
//         }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
   
}
