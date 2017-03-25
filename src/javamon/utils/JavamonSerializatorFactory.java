/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils;

import javamon.entities.Javamon;
import javamon.utils.communication.JavamonSerializer;
import javamon.utils.enums.Consoles;

/**
 *
 * @author arser
 */
public class JavamonSerializatorFactory {
    public static JavamonSerializer createComponent(Consoles poutput, Javamon pjavamon){
        switch(poutput){
            case classic:
                return new JavamonXmlGenerator();
            case next:
                return new JavamonJsonGenerator();
        }
        return null;
    }
}
