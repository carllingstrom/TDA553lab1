import java.awt.*;

public class Saab95 extends Car {
    public boolean turboOn;
    public Saab95() {
        super(2, Color.red, 125, "Saab95", 1, 1);
        turboOn = false;
    }
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
    public void setTurboOn() {
        turboOn = true;
    }
    public void setTurboOff() {
        turboOn = false;
    }
}
