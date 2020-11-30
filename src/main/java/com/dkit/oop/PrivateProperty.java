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
}