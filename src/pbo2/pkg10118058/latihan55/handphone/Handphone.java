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
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("\nManufaktur\t: " + manufacture);
        System.out.println("OS\t\t: " + operatingSystem);
        System.out.println("Model\t\t: " + model);
        System.out.println("Harga\t\t: " + harga); 
    }
    
}
