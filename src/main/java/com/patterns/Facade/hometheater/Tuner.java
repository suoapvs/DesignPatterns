package com.patterns.Facade.hometheater;

public final class Tuner {

    private final String description;
    private final Amplifier amplifier;
    private double frequency;

    public Tuner(final String description, final Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(this.description + " on");
    }

    public void off() {
        System.out.println(this.description + " off");
    }

    public void setFrequency(double frequency) {
        System.out.println(this.description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(this.description + " setting AM mode");
    }

    public void setFm() {
        System.out.println(this.description + " setting FM mode");
    }

    @Override
    public String toString() {
        return this.description;
    }
}
