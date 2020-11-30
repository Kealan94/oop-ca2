package com.dkit.oop;
//Kealan Crilly, SD2B, D00224427

import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Kealan Crilly
 * <p>
 * Your GitHub link:https://github.com/Kealan94/oop-ca2.git
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, "mains water");
        Property p2 = new Property(2, "John Smith", "A92AB11,", 255500, 120, "electricity");
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea()) + " : " +  p1.getFacilities());


        System.out.println("Q2 - tests");
        ArrayList<Property> props = new ArrayList<>();
        props.add(new Property(3, "Bill Smith", "A99AB15", 255044, 129, "electricity"));
        props.add(new Property(4, "James Murphy", "A99AB16", 250043, 130, "private access"));
        props.add(new Property(5, "Jane Malloy", "A99AB17", 27004, 144, "mains"));



        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

