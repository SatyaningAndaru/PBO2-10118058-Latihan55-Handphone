/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan55.handphone;

/**
 *
 * @author user
 */
public class PBO210118058Latihan55Handphone {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung","Android","Grand",3000000);
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("Android KeyStore : " +a.getKeyStore());
        
        Blackberry b = new Blackberry("Black b","RIM","Curve",2000000);
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("PIN : "+b.getPinBB());
        
        WindowsPhone wp= new WindowsPhone("Nokia","Win8","Lumia",1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("WP Key Store : "+wp.getWpKeyStore());
    }
    
}
