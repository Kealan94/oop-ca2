package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private String facilities;

    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, String facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        this.facilities = facilities;
    }
    public Property(double sellingPrice){
        this.sellingPrice = 0.0;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

}
