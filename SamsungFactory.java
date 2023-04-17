/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracttFactoryPattern;

/**
 *
 * @author Yusif
 */
public class SamsungFactory implements Factory{
    @Override
    public Telephone createTelephone() {
        return new SamsungTele("Samsung S20 ", "Android", 3100.0);
    }

    @Override
    public Computer createComputer() {
        return new SamsungComp("mh3500", "Windows 11", 1500);
    }
}
