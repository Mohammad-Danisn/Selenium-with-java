package all_string_method;

public class String_charAt_Method {
    public static void main(String[] args) {

        String a1="jtc";
        String s2 ="jtcindia";
        String s3 = "noida";
        String s4 = "india";
        String s5= "jtc";
        String s9= "jtc"+"noida";
        System.out.println(a1==s2);
        System.out.println(a1==s5);
        System.out.println(s3==s4);
        System.out.println(a1+s3==s9);
        String b1=a1+s4;
        System.out.print("b1.equals(a1+s4)==s2.equals(b1) is equals to ");
        System.out.println(b1.equals(a1+s4)==s2.equals(b1));
        System.out.println(s3.contains("noi"));



        //charAt()
        System.out.println("charAt() Method");
        String myStr1 = "Hello";
        char result = myStr1.charAt(4);
        System.out.println(result);

        System.out.println("-----------------");
        //concat()
        System.out.println("concat() Method");
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));


        System.out.println("-----------------");

        //contains()
        System.out.println("contains() Method");
        String myStr2 = "Hello";
        System.out.println(myStr2.contains("Hel"));   // true
        System.out.println(myStr2.contains("e"));     // true
        System.out.println(myStr2.contains("Hi"));    // false

        System.out.println("-------------------");

        //endWith
        System.out.println("endWith Method");
        String myStr = "Hello";
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true

        System.out.println("------------------");

        //equals()
        System.out.println("equals() Method");
        String myStr3 = "Hello";
        String myStr4 = "Hello";
        String myStr5 = "Another String";
        System.out.println(myStr3.equals(myStr4)); // Returns true because they are equal
        System.out.println(myStr3.equals(myStr5)); // false

        System.out.println("---------------------");

        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase() Method");
        String myStr6 = "Hello";
        String myStr7 = "HELLO";
        String myStr8 = "Another String";
        System.out.println(myStr6.equalsIgnoreCase(myStr7)); // true
        System.out.println(myStr6.equalsIgnoreCase(myStr8)); // false

        System.out.println("--------------------");

        //////
        //hashCode()
        System.out.println("hashCode() Method");
        String mySt9 = "Hello";
        System.out.println(mySt9.hashCode());

        System.out.println("--------------------");


        //////
        //indexOf()
        System.out.println("indexOf() Method");
        String myStr10 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr10.indexOf("earth"));
        System.out.println(myStr10.indexOf("planet", 6));


        System.out.println("-----------------------");

        //isEmpty()
        System.out.println("isEmpty() method");
        String myStr11 = "Hello";
        String myStr12 = "";
        System.out.println(myStr11.isEmpty());
        System.out.println(myStr12.isEmpty());

        System.out.println("---------------------");

        //lastIndexOf()
        System.out.println("lastIndexOf() method");
        String myStr13 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr13.lastIndexOf("planet"));
        System.out.println(myStr13.lastIndexOf("planet", 7));

        System.out.println("-----------------------");

        //length()
        System.out.println("length() method");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        System.out.println("----------------------");

        System.out.println("---------------------");

        //matches()
        System.out.println("matches() method");
        String txt11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt11.matches("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));   //true
        System.out.println(txt11.matches("ABCDEFGHIJKLMNOPQRSTUVWXYZabc")); //false

        System.out.println("----------------------");

        //replace()
        System.out.println("replace() method");
        String myStr14 = "Hello";
        System.out.println(myStr14.replace('l', 'p'));

        System.out.println("-----------------------");

        System.out.println("------------------------");

        //replaceFirst()
        System.out.println("replaceFirst() method");
        String myStr17 = "Hello";
        System.out.println(myStr17.replaceFirst("H","D"));


        System.out.println("------------------------");

        //replaceAll()
        System.out.println("replaceAll() method");
        String myStr18 = "Hello";
        System.out.println(myStr18.replaceAll("Hello","Danish"));

        System.out.println("-------------------------");

        //split()
        System.out.println("split() method");
        String s = "Mohammad Danish Ahmad";

         String[] splittedString = s.split(" ");
        //String[] splittedString = s.split("Danish");

        System.out.println(splittedString[0]);

        System.out.println(splittedString[1]);

        System.out.println(splittedString[1].trim());

        for(int i=0; i <s.length();i++)

        {
            System.out.println(s.charAt(i));
        }

        System.out.println("\n--------------------------------\n");

        for(int i =s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }

        System.out.println("-------------------------");

        //startsWith
        System.out.println("startsWith method");
        String myStr15 = "Hello";
        System.out.println(myStr15.startsWith("Hel"));   // true
        System.out.println(myStr15.startsWith("llo"));   // false
        System.out.println(myStr15.startsWith("o"));     // false

        System.out.println("------------------------");

        //substring()
        System.out.println("substring() method");
        String name= "Danish";
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println("------------------------");

        //toCharArray()
        System.out.println("toCharArray() method");
        String s1 = "GeeksforGeeks";
        char[] gfg = s1.toCharArray();
        for (int i = 0; i < gfg.length; i++) {
            System.out.println(gfg[i]);
        }

        System.out.println("-----------------------");

        //toUpperCase()
        //toLowerCase()
        System.out.println("toUpperCase() & toLowerCase() method");
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        System.out.println("---------------------");

        //toString()
        System.out.println("toString() method");
        System.out.println("---------------------");

        //trim()
        System.out.println("trim() method");
        String myStr16 = "       Hello World!       ";
        System.out.println(myStr16);
        System.out.println(myStr16.trim());

        System.out.println("--------------------");

        //valueOf()


        /*


        System.out.println("=============================");

        String name = "Danish";
         System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Danish      ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('a', 'e'));
        System.out.println(name.replace("a", "il"));

        System.out.println(name.startsWith("Dan"));
        System.out.println(name.endsWith("esh"));

        System.out.println(name.charAt(4));

        String modifiedName = "Danishishish";
        System.out.println(modifiedName.indexOf("ish"));
        System.out.println(modifiedName.indexOf("ish", 4));
        System.out.println(modifiedName.lastIndexOf("ish", 7));

        System.out.println(name.equals("Danish"));
        System.out.println(name.equalsIgnoreCase("DanIsH"));

        System.out.println("I am escape sequence\tdouble quote");

*/

    }
}
