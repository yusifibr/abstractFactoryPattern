/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracttFactoryPattern;

/**
 *
 * @author Yusif
 */
public class Main {
    public static void main(String[] args) {
        Factory iphone = new AppleFactory();
        Telephone t = iphone.createTelephone();
        
        System.out.println(t.toString());
    }
}
