package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien alien, alien2, alien3;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Alien initialisieren
        alien = new Alien(this, new Point(400, 50 + new Random().nextInt(100)));
        alien2 = new Alien(this, new Point(420, 100 + new Random().nextInt(100)));
        alien3 = new Alien(this, new Point(440, 150 + new Random().nextInt(100)));

        // Alien soll auf Maus-Klicks reagieren
        addMouseListener(alien);
        addMouseListener(alien2);
        addMouseListener(alien3);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
        alien2.draw(g, this);
        alien3.draw(g, this);
    }
    
    public void drawGameOver(Graphics g){
        centerText(g,"GG EZ");
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        alien2.move();
        alien3.move();
        return alien.isVisible() || alien2.isVisible() || alien3.isVisible();
    }
}
