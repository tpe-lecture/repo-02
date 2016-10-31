package tpe.oo.interfaces.impl;

import java.awt.Point;
import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController  {
    
    private double x = 0;
    private double y = 0;

    /**
     * @see tpe.oo.interfaces.api.AnalogController#up()
     */
    @Override
    public void up(double percentage) {
        y -= percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#down()
     */
    @Override
    public void down(double percentage) {
        y += percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#left()
     */
    @Override
    public void left(double percentage) {
        x -= percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#right()
     */
    @Override
    public void right(double percentage) {
        x += percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#getPosition()
     */
    @Override
    public Point getPosition() {
        return new Point((int) x, (int) y);
    }
}
