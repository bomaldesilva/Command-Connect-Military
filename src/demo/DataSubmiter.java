/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo;

/**
 *
 * @author Insight
 */
public interface DataSubmiter {
    void submitData(String msg);
    void sendEnergyValue(String warningMsg);
    void sendOxygenValue(String oxygenMsg);
    void sendFuelAmount(int i,int value);
}
