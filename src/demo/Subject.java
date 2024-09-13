/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Insight
 */
public class Subject {
   private boolean bool;
   private int indexOfClass;
   private int indexOfdefence;
   private ArrayList<Observer> list = new ArrayList<>();
   public void addObserver(Observer ob){
       list.add(ob);
   }
   public void removeObserver(Observer ob){
       list.remove(ob);
   }
   public void clearAll(boolean select){
    for(Observer ob:list){
       ob.updateArea(select);}
    }
   public void enableOps(int value){
    for(Observer ob:list){
       ob.updateOperation(value);}
    }
   public void sendPrivate(boolean bool){
    this.bool=bool;
    
   }
   public int setSoldiersCount(){
       switch (indexOfdefence) {
           case 1:
               return list.get(0).getSoldiersCount();
           case 2:
               return list.get(1).getSoldiersCount();
           case 3:
               return list.get(2).getSoldiersCount();
           default:
               break;
       }
       return -1;
   }
   public int setAmmoCount(){
       switch (indexOfdefence) {
           case 1:
               return list.get(0).getAmmoCount();
           case 2:
               return list.get(1).getAmmoCount();
           default:
               return list.get(2).getAmmoCount();
       }
   }
   public void setIndexToDefence(int indexOfdefence){this.indexOfdefence=indexOfdefence;}
   public void setIndex(int indexOfClass){this.indexOfClass=indexOfClass;}
   public void sendAll(String msgToAll){
       
       if(bool==true){
       if(indexOfClass==0){list.get(0).sendToObserver(msgToAll);
       }
       if(indexOfClass==1){list.get(1).sendToObserver(msgToAll);}
       if(indexOfClass==2){list.get(2).sendToObserver(msgToAll);}
       }
       else{
        for(Observer ob:list){
            ob.sendToObserver(msgToAll);
            }
        }
    }
}
