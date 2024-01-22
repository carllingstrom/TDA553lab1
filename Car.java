import java.awt.*;
public class Car implements Movable {
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public Car(int nrDoors, Color color, double enginePower, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopEngine();
    }
    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public double speedFactor() {
        return enginePower * 0.01;
    }

    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount) {
        if(amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }else{
            System.out.println("Input must be between 0 and 1");
            }}


    public void brake(double amount) {
        if(amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
        else{
            System.out.println("Input must be between 0 and 1");
        }}

    private double x;
    private double y;
    private int direction;

    public static final int UP = 90;
    public static final int DOWN = 270;
    public static final int RIGHT = 0;
    public static final int LEFT = 180;


    public void move() {
        double distance = getCurrentSpeed();
        x += distance*Math.cos(direction);
        y += distance*Math.sin(direction);
        System.out.println("car is moving in x:" + x + "and y:" + y);
    }

    public void turnLeft() {
        if (direction == UP) {
            direction = LEFT;
        } else if (direction == LEFT) {
            direction = DOWN;
        } else if (direction == DOWN) {
            direction = RIGHT;
        } else if (direction == RIGHT) {
            direction = UP;
        }
    }
    public void turnRight() {
        if (direction == UP) {
            direction = RIGHT;
        } else if (direction == LEFT) {
            direction = UP;
        } else if (direction == DOWN) {
            direction = LEFT;
        } else if (direction == RIGHT) {
            direction = DOWN;
        }
    }}

    interface Movable {
        void move();
    
        void turnLeft();
    
        void turnRight();
    
    }
