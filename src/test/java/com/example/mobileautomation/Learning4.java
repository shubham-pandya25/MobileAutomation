package com.example.mobileautomation;

public class Learning4 {
    public static void main(String[] args) {

        Learning4 learning4 = new Learning4();
        Methods methods = new Methods();
        String box = learning4.getData();
        String pen = methods.getUserData();
        String rubber = getData2();
        System.out.println(rubber);
        System.out.println(box);
        System.out.println(pen);
    }
    public String getData()
    {
        System.out.println("Hello Berlin");
        return "Shubham Pandya";
    }

    public static String getData2()
    {
        System.out.println("Hello Vadodara");
        return "Charmi Pandya";
    }
}
