/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracttFactoryPattern;

/**
 *
 * @author Yusif
 */
public class HuaweiTele implements Telephone{
    
    private String marka;
    private String os;
    private double price;

    public HuaweiTele(String marka, String os, double price) {
        this.marka = marka;
        this.os = os;
        this.price = price;
    }

    @Override
    public String toString() {
        return "HuaweiTele{" + "marka=" + marka + ", os=" + os + ", price=" + price + '}';
    }
    
    
    

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public String getOS() {
        return os;
    }

    @Override
    public double getPrice() {
        return price;
    }


    
}