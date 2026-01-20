package com.example.autowire.type.name;


public class Specification {
    private String make;
    private String mode;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }
}
