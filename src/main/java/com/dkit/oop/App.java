package com.dkit.oop;
//Kealan Crilly, SD2B, D00224427
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
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());


        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

