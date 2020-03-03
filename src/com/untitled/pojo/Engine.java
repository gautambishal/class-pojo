package com.untitled.pojo;

import java.io.Serializable;
import java.util.Date;

public class Engine implements Serializable {
    private static final long serialVersionUID=1L;

    private String engineName;
    private String type;
    private double price;
    private Date mfgDate;

    public Engine() {
    }

    public Engine(String engineName, String type, double price, Date mfgDate) {
        this.engineName = engineName;
        this.type = type;
        this.price = price;
        this.mfgDate = mfgDate;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineName='" + engineName + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", mfgDate=" + mfgDate +
                '}';
    }
}
