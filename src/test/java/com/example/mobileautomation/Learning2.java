package com.example.mobileautomation;

import java.util.ArrayList;

public class Learning2 {
    public static void main(String[] args) {

        int[]  arr3 = {1,2,4,5,6,7,8,9,122,10};

        for (int i=0;i<arr3.length;i++)
        {
            if (arr3[i] % 2 == 0)
            {
                System.out.println(arr3[i]);
                break;
            }
            else
            {
                System.out.println(arr3[i] + " is not multiple of 2");
            }
        }

        ArrayList <String>a = new ArrayList<String >();
        a.add("rahul");
        a.add("shetty");
        a.add("selenium");
        System.out.println(a.get(2));    

    }
}

//Array list is the class
//If you want access any methods in the class, we need to create object of the class
// create object of the class object.method
