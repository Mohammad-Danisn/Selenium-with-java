package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("I am Danish");

        System.out.println("----------------------");

        int num = 10;
        String website = "Java T Point";
        char letter = 'z';
        double dec = 15.45;
        boolean myCard = true;

        System.out.println(num+" is the value stored in the Number variable");
        System.out.println(website);

        System.out.println("__________________________");

//Arrays -
        int[] arr = new int[5];// 5, 10  ,15
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0; i< arr.length; i++) //4
        {

            System.out.println(i+"   "+arr[i]);
        }

        System.out.println("------------------------");

        int[] arr1 =new int[3];
        arr1[0] = 3;
        arr1[1] = 5;
        arr1[2] = 7;

        for (int x = 0; x<arr1.length; x++)
        {
            System.out.println(x+"  "+arr1[x]);
        }

        System.out.println("--------------------------");

        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr2[0]);

        System.out.println("-----------------");

//for loop arr.length - 5
        for(int i = 0; i< arr.length; i++) //4
        {

            System.out.println(arr[i]);
        }

        System.out.println("--------------------");

        for (int i =0;i<arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }

        System.out.println("------------------------------");

        String[] name = {"Mohammad", "Danish", "Selenium"};

        for(int i =0; i<name.length;i++)
        {
            System.out.println(name[i]);
        }

        System.out.println("-------------------");

        for( String s: name)
        {
            System.out.println(s);
        }


    }
}