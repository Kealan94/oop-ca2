package com.dkit.oop;
//Kealan Crilly, SD2B, D00224427

import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Kealan Crilly
 * <p>
 * Your GitHub link:https://github.com/Kealan94/oop-ca2.git
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, "mains water");
        Property p2 = new Property(2, "John Smith", "A92AB11,", 255501, 120, "electricity");
        System.out.println("Property p1 details:");
       // System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea()) + ":" + p1.getFacilities();

        System.out.println("Q2 - tests");
        ArrayList<Property> props = new ArrayList<>();
        props.add(new Property(3, "Bill Smith", "A99AB15", 255044, 129, "electricity"));
        props.add(new Property(4, "James Murphy", "A99AB16", 250043, 130, "private access"));
        props.add(new Property(5, "Jane Malloy", "A99AB17", 27004, 144, "mains"));


        props.add(new PrivateProperty(6, "Sarah Smtih", "A22B344", 277700, 150, "mains", 2, "Apartment"));
        props.add(new PrivateProperty(7, "Eamon Dunn", "AH4491", 27991, 166, "private access", 3, "Semi detached"));
        props.add(new PrivateProperty(8, "Tom Brown", "AL92665", 30002, 170, "mains", 4, "Apartment"));
        displayProperties(props);
        displayallProperties(props);
        getPropertiesPriceAbove(props);
    }



public static void displayProperties(ArrayList<Property>props) {
    for (Property properties : props) {
        System.out.println(properties + " " +  properties.getArea() + " " + properties.getFacilities() + " "
                + properties.getOwner() + " " + properties.getPostcode() + " " + properties.getSellingPrice() +
                " " + properties.getPropertyID() + "" + properties);
    }
}

public static void getPropertiesPriceAbove(ArrayList<Property>props) {
    int boundary = 29000;
    for (Property properties : props) {
        if (properties.getSellingPrice() > boundary) {
            System.out.println();
        }


    }
    System.out.println("Q3 - tests");


    System.out.println("Q4 - tests");
}

    public static void displayallProperties(ArrayList<Property>props) {
        for (Property property :props)
        {
            System.out.println(property + " " +  "PrivateProperty" + property.getFacilities());
    }

    }
}

