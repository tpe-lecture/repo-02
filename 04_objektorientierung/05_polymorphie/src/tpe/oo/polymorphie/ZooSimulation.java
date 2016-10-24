package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     * 
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();

        ZooTier[] Viecher = new ZooTier[3];

        
        Viecher[0] = new Affe("Charlie");
        Viecher[1] = new Gorilla("Buck");
        Viecher[2] = new Giraffe("Debbie");

          for(ZooTier tier : Viecher){
                System.out.println(tier);

                System.out.println("Fütterung...");

                futterstelle.gibFutter(tier);

                System.out.println(tier);
        }
    }
}
