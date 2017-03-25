/*
 *CopyRight 2017-2050
 */
package javamon.utils;

import javamon.entities.Javamon;
import javamon.utils.enums.Element;

public class ElementUtil {

    public static boolean isFireJavamon(Javamon pjavamon){
        return Element.Fire.equals(pjavamon.getElement());
    }
    
    public static boolean isWaterJavamon(Javamon pjavamon){
        return Element.Water.equals(pjavamon.getElement());
    }
    
    public static boolean isEarthJavamon(Javamon pjavamon){
        return Element.Earth.equals(pjavamon.getElement());
    }
    
    public static boolean isAirJavamon(Javamon pjavamon){
        return Element.Air.equals(pjavamon.getElement());
    }
    
    public static boolean isAetherJavamon(Javamon pjavamon){
        return Element.Aether.equals(pjavamon.getElement());
    }
}
