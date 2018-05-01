package com.kaminski;

import java.util.Random;

public class Ball extends MaterialPoint {

    private int radius;

    public Ball() {
        super();
        Random random = new Random(System.currentTimeMillis());
        this.radius = random.nextInt(1000);
    }

    public Ball(int mass, int radius) {
        super(mass);
        this.radius = radius;
    }

    @Override
    public double calculateMainMomentOfInertia() {
        return (2.0 / 5) * mass * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive or zero.");
        }
    }

    @Override
    public String getInfo() {
        return "Ball\nRadius:\t" + radius + "\nMass:\t" + super.mass;
    }
}
