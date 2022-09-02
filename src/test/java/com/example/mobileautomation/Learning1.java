package com.example.mobileautomation;

public class Learning1 {

    public static void main(String[] args) {

        int myNum = 5;
        String website = "Shubham learning Java";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard= true;

        System.out.println(myNum + " is the value stored in the myNum variable");

        System.out.println(website);

        // Array - to store the multiple value

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int [] arr1 = {1,2,3,4,7,9};

        System.out.println(arr1[1]);

       // for (int i = 0; i < arr.length; i++)
       // {
         //   System.out.println(arr[i]);
        //}

        String[] name = {"rahul", "shetty", "selenium", "shubham", "pandya"};

      //  for (int i = 0; i < name.length; i++)
        //{
           // System.out.println(name[i]);
        //}

        for(String s: name)
        {
            System.out.println(s);
        }

    }

}
