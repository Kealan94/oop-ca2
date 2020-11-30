package com.dkit.oop;

import java.util.Objects;

public class PrivateProperty extends Property {
    private int numBeds;
    private String propertyType;


    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, String facilities, int numBeds, String propertyType) {
        super(propertyID, owner, postcode, sellingPrice, area, facilities);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "PrivateProperty{" +
                "numBeds=" + numBeds +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }
    //The equals and hashcode based on owner and the PropertyID
    // should deal with if the two objects are equal.

}