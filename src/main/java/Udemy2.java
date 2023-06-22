public class Udemy2 {

    public static void main(String[] args) {


//string is an object //String literal



// String s1 = "Rahul Shetty Academy";

        String s5 = "hello";





//new

        String s2 = new String("Welcome");

        String s3 = new String("Welcome");



        String s = "Mohammad Danish Ahmad";

       // String[] splittedString = s.split(" ");
        String[] splittedString = s.split("Danish");

        System.out.println(splittedString[0]);

        System.out.println(splittedString[1]);

        System.out.println(splittedString[1].trim());

        for(int i=0; i <s.length();i++)

        {



            System.out.println(s.charAt(i));

        }
        System.out.println("\n--------------------------------\n");
        for(int i =s.length()-1;i>=0;i--) {


            System.out.println(s.charAt(i));

        }



        System.out.println("\n\n_________________________________________\n\n");
        String nme= "Mohammad Danish Ahmad Mohummad Uwais Ahmed Mohd. Tabish Gouri ";
        System.out.println(nme);
        System.out.println(nme.length());
        System.out.println(nme.toUpperCase());
        System.out.println(nme.toLowerCase());




       // System.out.println("Simple "+nme.split(" "));
        String[] sn=nme.split(" ");
        System.out.println(sn[0]);
        System.out.println(sn[1]);
        System.out.println(sn[2].length());


        for (int x=0; x<sn.length;x++)
        {
            System.out.println(nme.charAt(x));
        }

        System.out.println("\n\n---------------------------\n");

        for (int y=sn.length-1; y>=0;y--)
        {
            System.out.println(nme.charAt(y));
        }
    }



}









