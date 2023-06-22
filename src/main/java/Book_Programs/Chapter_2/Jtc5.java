package Book_Programs.Chapter_2;
class ABC extends XYZ
{
    void Abc3(){
        System.out.println("Danish");
        int j=0;
        for (;j<10;)
        {
            System.out.println(j);
            j++;
        }
    }
    void Abc4(){
        System.out.println("Uwais Class ABC");
    }
}

class ABC1{
    void ABC6(){
        System.out.println("dgfjvmgjhg");
    }
}
class XYZ extends ABC1
{

    void Abc(){
        System.out.println("Danish1");
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
    void Abc1(){
        System.out.println("Uwais Class XYZ");
    }
}

public class Jtc5 extends ABC {

    void Abc2() {
        System.out.println("Uwais");
    }

    public static void main(String[] args) {


        Jtc5 A = new Jtc5();
        A.Abc();
        Jtc5 B = new Jtc5();
        A.Abc1();
        //Jtc5 B = new Jtc5();
        A.Abc2();
        B.Abc3();
        A.Abc4();
        A.ABC6();

        System.out.println("Class Jtc5");
//********************


// ************************

        //******

        //*****
       /* int k=0;
        for (System.out.println(k);System.out.println("ABC");k++)
        {
            System.out.println(k);
        }*/
        //********
        /*int l=0;
        for (System.out.println(l);;l++)
        {
            if (l<10) {
                System.out.println(l);
            }
        }*/
        //***********



            /*for (int x = 0; x < 20; x++) {
                System.out.println("IN FOR : " + x);
                {

                    if (x == 3) {
                        break;
                        //System.out.println("After Loop ");
                    }

                }
            }*/

        Jtc5 Sobj = new Jtc5();
        int z = Sobj.sum(20, 10, 50);

        System.out.println("\n***************************\n*" + "  Sum of a , b & c is :- " + z + "  *\n***************************\n");




        Jtc5 CallByValue = new Jtc5();
        int ss = 80;
        int yy = CallByValue.change(ss);

        System.out.println("Value of ss after passing:- "+ss);
        System.out.println("Value of yy after modifying:- "+yy);


    }

    int sum(int a, int b, int c) {
        int s = a + b + c ;
        return s;
    }

    int change(int yy){
        ++yy;
        return yy;
    }

}
