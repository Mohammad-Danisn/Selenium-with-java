package Star_Pattern;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

      /*  int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);

        if ((i1 > i2) && (i1 > i3)) {
            System.out.println(i1);
        } else if ((i2 > i1) && (i2 > i3)) {
            System.out.println(i2);
        } else if ((i3 > i1) && (i3 > i2)) {
            System.out.println(i3);
        }

    }
}
*/

        int i=0,j=0;



        for(i=1;i<5;i++)
        {
           // System.out.println("value of i :- ");
            for (j=1;j<=i;j++)
            {
                System.out.print(""+j);
            }
            System.out.println();
        }

        System.out.println("\n**************************\n");

        for(i=5;i>=1;i--)
        {
            // System.out.println("value of i :- ");
            for (j=1;j<=i;j++)
            {
                System.out.print(""+j);
            }
            System.out.println();
        }

        //System.out.println("\r");
        System.out.println("\n\n*****************\n\n");



        int k=15;
        for(int a=1; a<=4; a++)
        {
            for(int b=k-1; b>=a; b--) {
                System.out.print(" ");
            }


            for (int c = 1; c <= a; c++) {
                System.out.print(""+c);
            }
            System.out.println();

        }


        System.out.println("\n\n*******************************\n\n");

        int n=15;
        for(int a=5; a>=1; a--)
        {
            for(int b=n-1; b>=a; b--) {
                System.out.print(" ");
            }


            for (int c = 1; c <= a; c++) {
                System.out.print(""+c);
            }
            System.out.println();

        }

        System.out.println("\n*******************************************************\n");

        int e,f,g,h=1;
        for(e=1;e<5;e++)
        {
            for(g=5;g>=e;g--)
            {
                System.out.print("  ");
            }
            //System.out.print(e+" ");
            for (f=1;f<=e;f++)
            {
                System.out.print(h+"   ");
                h++;
            }
            System.out.println();
        }


     //   System.out.println("\n");


       // System.out.println("\n*******************************************************\n");

        int e1,f1,g1,h1=6;
        for(e1=3;e1>=1;e1--)
        {
            for(g=5;g>=e1;g--)
            {
                System.out.print("  ");
            }
            //System.out.print(e+" ");
            for (f=1;f<=e1;f++)
            {
                System.out.print(h1+"   ");
                h1--;
            }
            System.out.println();
        }


        System.out.println("\n");


/*

        Scanner input=new Scanner(System.in);
        System.out.print("Input a number: ");
        int x=input.nextInt();
        if(x>=0)
            System.out.println(x+" is a positive number");
        else
            System.out.println(x+" is a negative number");
*/



        int x = 20, y = 10, z = 40;
        boolean value;
        if(value = (x > y) || (y < z))
            System.out.println("1"+value);

        if(value = (x > y) || (y > z))
            System.out.println("2"+value);

        if(value = (x < y) || (y < z))
            System.out.println("3"+value);

        if(value = (x < y) || (y > z))
            System.out.println("4"+value);





    }
}



