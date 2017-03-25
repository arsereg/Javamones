/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils;

import javamon.entities.Javamon;
import javamon.utils.communication.JavamonSerializer;
import javamon.utils.enums.Output;

/**
 *
 * @author arser
 */
public class JavamonJsonGenerator implements JavamonSerializer{
    
    @Override
    public String Serialize(Javamon pjavamon){
        StringBuilder output = new StringBuilder();
        output.append("{");
        output.append("\"name\":");
        output.append("\"").append(pjavamon.getName()).append("\"");
        output.append("}");
        //TODO: Finish the json output
        return output.toString();
    }


    
}
