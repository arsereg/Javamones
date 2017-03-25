/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.communication;

import javamon.entities.Javamon;
import javamon.utils.JavamonSerializatorFactory;
import javamon.utils.communication.components.CommunicationComponentFactory;
import javamon.utils.communication.components.ICommunication;
import javamon.utils.enums.Consoles;

/**
 *
 * @author Mario
 */
public class CommunicationManager {
    
    public void SendJavamonToTargetConsole(Javamon pjavamon, Consoles pconsola){
        ICommunication communicationComponent = CommunicationComponentFactory.CreateComponent(pconsola);
        JavamonSerializer serializator = JavamonSerializatorFactory.createComponent(pconsola, pjavamon);
        communicationComponent.sendJavamon(serializator.Serialize(pjavamon));
        
    }
}

