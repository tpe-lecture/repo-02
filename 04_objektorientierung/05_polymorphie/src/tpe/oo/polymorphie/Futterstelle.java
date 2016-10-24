package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert den Affen.
     * 
     * @param affe Affe, der gefüttert werden soll. 
     */
    public void gibFutter(ZooTier vieh) {
        vieh.fuettern();
    }

}