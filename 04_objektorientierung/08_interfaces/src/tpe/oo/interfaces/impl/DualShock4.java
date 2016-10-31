package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {
    private AnalogController ANAL = new AnalogControllerImpl();
    private DigitalController DIGGI = new DigitalControllerImpl();

    @Override
    public void up(double percentage) {
        ANAL.up(percentage);
    }

    @Override
    public void down(double percentage) {
        ANAL.down(percentage);
    }

    @Override
    public void left(double percentage) {
        ANAL.left(percentage);
    }

    @Override
    public void right(double percentage) {
        ANAL.right(percentage);
    }

    @Override
    public void up() {
        DIGGI.up();
    }

    @Override
    public void down() {
        DIGGI.down();
    }

    @Override
    public void left() {
        DIGGI.left();
    }

    @Override
    public void right() {
        DIGGI.right();
    }

    @Override
    public Point getPosition() {
        return new Point((int) (ANAL.getPosition().getX() + DIGGI.getPosition().getX()),
                (int) (ANAL.getPosition().getY() + DIGGI.getPosition().getY()));
    }
}
