package Simple_Java_Project;
import java.util.*;
class Welcome
        //extends Thread
{
    Scanner scan=new Scanner(System.in);
    int choice,flag=1,amt=0,sum=0;
    String name,mobile,email,city,username,password,confirmpassword,usr,pswd,nm,em,mob,cit;

    public void fordet()
    {
        System.out.print("TELL ME YOUR NAME : ");
        nm=scan.next();
        System.out.println();
        System.out.print("TELL ME YOUR MOBILE : ");
        em=scan.next();
        System.out.println();
        System.out.print("TELL ME YOUR Email : ");
        mob=scan.next();
        System.out.println();
        System.out.print("TELL ME YOUR CITY : ");
        cit=scan.next();
        if((name.equals(nm)  && email.equals(em)  &&  mobile.equals(mob)  &&  city.equals(cit)))
        {
            flag=2;
        }
        else
        {
            flag=0;
        }
        if(flag==0)
        {
            System.out.println();
            System.out.println("			-YOUR DETAILS DOESN'T MATCH TO OUR SYSTEM RECORDS-");
            System.out.println();
            sleeps();
            System.out.println("			-DO YOU WANT TO RETRY TO FORGOT-" );
            System.out.println();
            System.out.println("			-PRESS 1 FOR YES-				-PRESS 2 FOR NO-");
            System.out.println();
            System.out.println("ENTER YOUR CHOICE : ");
            choice=scan.nextInt();
            if(choice==1)
            {
                flag=1;
                fordet();
            }
            else if(choice==2)
            {
                flag=1;
                display();
            }
            else
            {
                System.out.println("-PLEASE ENTER THE CORRECT CHOICE-");
                flag=0;
            }
        }
        else if(flag==2)
        {
            System.out.println("");
            sleeps();
            System.out.println("			-YOUR ACCOUNT HAS BEING VARIEFIED-");
            System.out.println("");
            System.out.println("YOUR USERNAME IS : "+username);
            System.out.println("");
            System.out.println("YOUR PASSWORD IS : "+password);
        }
    }
    public void forgot()
    {
        System.out.println();
        sleeps();
        System.out.println();
        System.out.println("                   -DO YOU WANT TO FORGOT YOUR YOUR USERNAME AND PASSWORD-");
        System.out.println();
        System.out.println("         -PRESS 1 FOR YES-                                            -PRESS 2 FOR NO-");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE : ");
        choice=scan.nextInt();
        if(choice==1)
        {
            System.out.println();
            sleeps();
            System.out.println();
            System.out.println("			  -I WILL ASK YOU SOMETHING ABOUT YOUR ACCOUNT-");
            System.out.println();
            sleeps();
            System.out.println("SO....");
            System.out.println();
            sleeps();
            fordet();
        }
        else if(choice==2)
        {
            display();
        }
        else
        {
            System.out.println("-PLEASE ENTER THE CORRECT CHOICE-");
            forgot();
        }
    }
    public void sleeps()
    {
        try
        {
            Thread.sleep(700);
        }
        catch(Exception ex)
        {

        }
    }
    public void run()
    {
        sleeps();
        System.out.println("*Press 1 for Deposit money");
        sleeps();
        System.out.println("*Press 2 for Withdraw money");
        sleeps();
        System.out.println("*Press 3 for Check balance");
        sleeps();
        System.out.println("*Press 0 for logout");
        sleeps();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("ENTER YOUR CHOICE : ");
        choice=scan.nextInt();
        System.out.println();
        sleeps();
        if(choice==1)
        {
            System.out.print("ENTER AMOUNT : ");
            amt=scan.nextInt();
            sum=sum+amt;
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.println("                    ****YOUR TRANSACTION IS SUCCESSFUL****");
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.println("TOTAL AMOUNT IS : "+sum+" Rs");
            sleeps();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            run();
            System.out.println("");
            System.out.println("");
        }
        else if(choice==2)
        {
            System.out.print("ENTER AMOUNT : ");
            amt=scan.nextInt();
            sum=sum-amt;
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.println("                 ****YOUR TRANSACTION IS SUCCESSFUL****");
            sleeps();
            System.out.println("");
            System.out.println("");
            System.out.println("TOTAL AMOUNT IS : "+sum+" Rs");
            System.out.println("");
            sleeps();
            System.out.println("");
            System.out.println("");
            run();
            System.out.println("");
            System.out.println("");
        }
        else if(choice==3)
        {
            System.out.println("YOUR AMOUNT IS : "+sum+" Rs");
            System.out.println("");
            System.out.println("");
            sleeps();
            run();
            System.out.println("");
            System.out.println("");
        }
        else if(choice==0)
        {
            display();
        }
        else
        {
            System.out.println("Please Enter The Correct Choice");
            run();
        }
    }
    public void regist()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("                    ****CONGRATULATIONS, YOUR REGISTRATION IS SUCCESSFUL**** ");
        System.out.println("");
        System.out.println("");
        sleeps();
    }
    public void Welcomebank()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                        **** WELCOME TO BANKING ****");
        System.out.println("");
        System.out.println("");
        sleeps();
        sleeps();
    }
    public void welcomeaccount()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                        **** WELCOME TO YOUR ACCOUNT "+name+" ****");
        System.out.println("");
        System.out.println("");
    }
    public void login()
    {
        System.out.println("");
        System.out.print("ENTER USERNAME  :  ");
        usr=scan.next();
        System.out.println("");
        System.out.print("ENTER PASSWORD  :  ");
        pswd=scan.next();
        if(usr.equals(username) && pswd.equals(password))
        {
            welcomeaccount();
            run();
        }
        else
        {
            System.out.println("PLEASE ENTER VALID USERNAME AND PASSWORD ");
            sleeps();
            forgot();
        }
    }
    public void display()
    {
        do
        {
            sleeps();
            System.out.println("           -NEW USER PRESS 1-");
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.println("           -EXISTING USER PRESS 2-");
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.println("           -FOR EXIT PRESS 0-");
            System.out.println("");
            System.out.println("");
            sleeps();
            System.out.print(" Enter your option : ");
            choice=scan.nextInt();
            if(choice==1)
            {
                do
                {
                    System.out.println("");
                    System.out.println("");
                    System.out.print("NAME  :  ");
                    name=scan.next();
                    if(!name.matches("[a-zA-Z_]+"))
                    {
                        System.out.println("");
                        System.out.println("NAME MUST BE ALPHABET  " );
                        System.out.println("");
                        flag=0;
                    }
                    else
                    {
                        flag=1;
                    }
                }while(flag!=1);
                do
                {
                    System.out.println("");
                    System.out.print("E-MAIL  :  ");
                    email=scan.next();
                    if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$+"))
                    {
                        System.out.println("");
                        System.out.println("Email MUST BE ALPHABET & LowerCase ");
                        System.out.println("");
                        flag=0;
                    }
                    else
                    {
                        flag=1;
                    }
                    System.out.println("");
                }while(flag!=1);
                do
                {
                    System.out.print("MOBILE  :  ");
                    mobile=scan.next();
                    if(!mobile.matches("[0-9]+"))
                    {
                        System.out.println("");
                        System.out.println("NUMBER MUST BE NUMERIC");
                        System.out.println("");
                        flag=0;
                    }
                    else if(!(mobile.length()==10))
                    {
                        System.out.println("");
                        System.out.println("NUMBER MUST HAVE 10 DIGITS");
                        System.out.println("");
                        flag=2;
                    }
                    else
                    {
                        flag=1;
                    }
                }while(flag!=1);
                do
                {
                    int upp=0,low=0;
                    System.out.println("");
                    System.out.print("CITY  :  ");
                    city=scan.next();
                    if(!city.matches("[a-zA-Z_]+"))
                    {
                        System.out.println("");
                        System.out.println("CITY MUST BE ALPHABET  " );
                        System.out.println("");
                        flag=0;
                    }
                    else
                    {
                        flag=1;
                    }
                }while(flag!=1);
                do
                {
                    int islet=0,ischar=0,isnum=0;
                    System.out.println("");
                    System.out.print("USERNAME  :  ");
                    username=scan.next();
                    for(int i=0;i<username.length();i++)
                    {
                        if((Character.isLowerCase(username.charAt(i))))
                        {
                            islet=1;
                        }
                        else  if(Character.isUpperCase(username.charAt(i)))
                        {
                            ischar=1;
                        }
                        else if((Character.isDigit(username.charAt(i))))
                        {
                            isnum=1;
                        }
                    }
                    if(!(isnum==1 && ischar==1 && islet==1))
                    {
                        System.out.println("");
                        System.out.println("USERNAME MUST BE UPPERCASE LOWERCASE AND NUMBERS ");
                        flag=0;
                        System.out.println("");
                    }
                    else if(!(Character.isUpperCase(username.charAt(0))))
                    {
                        System.out.println("");
                        System.out.println("USERNAME FIRST LETTER MUST BE ALPHABET ");
                        System.out.println("");
                        flag=2;
                    }
                    else if(username.length()<8)
                    {
                        System.out.println("");
                        System.out.println("USERNAME MUST BE 8 CHARACTERS ");
                        System.out.println("");
                        flag=3;
                    }
                    else
                    {
                        flag=1;
                    }
                }while(flag!=1);
                do
                {
                    System.out.println("");
                    System.out.print("PASSWORD  :  ");
                    password=scan.next();
                    System.out.println("");
                    System.out.print("CONFIRM PASSWORD  :  ");
                    confirmpassword=scan.next();
                    if(!(password.equals(confirmpassword)))
                    {
                        System.out.println("PASSWORD DOESN'T MATCH TO CONFIRM PASSWORD");
                    }
                }while(!(password.equals(confirmpassword)));
                System.out.println("");
                System.out.println("");
                System.out.println("");
                regist();
            }
            else if(choice==2)
            {
                login();
            }
            else if(choice==0)
            {
                return;
            }
            else
            {
                System.out.println("Please Enter The Correct Choice");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
        while(choice!=0);
    }
}
class MyBankProject
{
    public static void main(String[]args)
    {
        Welcome wl=new Welcome();
        wl.Welcomebank();
            wl.display();
    }
}



