/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.communication.components;

import javamon.utils.communication.components.NintengoClassic;

/**
 *
 * @author arser
 */
public class NintengoNext extends NintengoClassic implements ICommunication{

    
    @Override
    public void sendJavamon(String output){
        System.out.println("Opening connection...");
        System.out.println(output);
        System.out.println("Javamon received...");
        System.out.println("Connection closed.");
    }
    
}
