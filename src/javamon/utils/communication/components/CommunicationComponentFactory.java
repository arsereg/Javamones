/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.communication.components;

import javamon.utils.enums.Consoles;

/**
 *
 * @author arser
 */
public class CommunicationComponentFactory {
    public static ICommunication CreateComponent(Consoles pconsole){
        ICommunication resultado = null;
        switch(pconsole){
            case next:
                resultado = new NintengoNext();
                break;
            case classic:
                resultado = new NintengoClassic();
                break;
        }
        return resultado;
    }
}
