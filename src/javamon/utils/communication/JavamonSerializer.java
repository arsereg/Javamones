/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.communication;

import javamon.entities.Javamon;
import javamon.utils.enums.Output;

/**
 *
 * @author arser
 */
public interface JavamonSerializer {
    public String Serialize(Javamon pjavamon);
}
