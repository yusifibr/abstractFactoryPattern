/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracttFactoryPattern;

/**
 *
 * @author Yusif
 */
public class SamsungComp implements Computer{
    
    
    private String marka;
    private String os;
    private double price;
    private String cpu;

    public SamsungComp(String marka, String os, double price) {
        this.marka = marka;
        this.os = os;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SamsungComp{" + "marka=" + marka + ", os=" + os + ", price=" + price + ", cpu=" + cpu + '}';
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

    @Override
    public String getCPU() {
        return cpu;
    }
    
}
