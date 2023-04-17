/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracttFactoryPattern;

/**
 *
 * @author Yusif
 */
public class HuaweiFactory implements Factory{
    @Override
    public Telephone createTelephone() {
        return new HuaweiTele("Huawei made pro", "Android", 3200.0);
    }

    @Override
    public Computer createComputer() {
        return new HuaweiComp("Huawei made ultra", "Windows 11", 7500);
    }
}
