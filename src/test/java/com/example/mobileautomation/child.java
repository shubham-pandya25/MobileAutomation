package com.example.mobileautomation;

public class child extends parent{

    public void engine()
    {
        System.out.println("new engine");
    }
    public void color()
    {
        System.out.println(color);
    }
    public static void main(String[] args) {

 child cd = new child();
 cd.color();
 cd.Brakes();

    }
}
