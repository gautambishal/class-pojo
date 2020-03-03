package com.untitled.pojo;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serialVersionUID=1L;

    private int id;
    private String v_name;
    private Engine engine;
    private double price;

    public Vehicle() {
    }

    public Vehicle(int id, String v_name, Engine engine, double price) {
        this.id = id;
        this.v_name = v_name;
        this.engine = engine;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", v_name='" + v_name + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }
}
