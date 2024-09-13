/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Insight
 */
public class Start {
    public static void main(String[] args){
    MainController mainController=new MainController();
    Tank tank=new Tank();
    Submarine submarine=new Submarine();
    Helicopter helicopter=new Helicopter();
    tank.setDataSubmiter(mainController);
    helicopter.setDataSubmiter(mainController);
    submarine.setDataSubmiter(mainController);
    Subject ob=new Subject();
    ob.addObserver(helicopter);
    ob.addObserver(submarine);
    ob.addObserver(tank);
    mainController.setSubject(ob);}
}
