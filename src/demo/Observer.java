/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Insight
 */
public interface Observer {
    public void updateArea(boolean select);
    public void updateOperation(int value);
    public void sendMsg(String msgToAll);
    public void sendToObserver(String msgPrivate );
    int getSoldiersCount();
    int getAmmoCount();
}

