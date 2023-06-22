import org.testng.annotations.*;

public class TestNGExample {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I will execute Before Suite Start the Program executes");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I will execute After Suite End the Program executes");
    }
    @BeforeTest
    public void openDBConnection(){
        System.out.println("I will execute Before any Test method/case executes");
    }

    @AfterTest
    public void CloseDBConnection(){
        System.out.println("I will execute After all Test method/case executes");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This annotation method will execute before the first test method in the current class is invoked.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This annotation method will execute after all the test methods in the current class have been executed.");
    }
    @BeforeMethod
    public void openBrowser(){
        System.out.println("I will be executed before Each Test Method");
    }
    @AfterMethod
    public void CloseBrowser(){
        System.out.println("I will be executed After Each Test Method");
    }
    @Test
    public void testCase01(){
        System.out.println("I'm first test case");
    }
    @Test
    public void testCase02(){
        System.out.println("I'm second test case");
    }
    @Test
    public void testCase03(){
        System.out.println("I'm third test case");
    }
    @Test
    public void testCase04(){
        System.out.println("I'm third test case");
    }

    @Test(dataProvider="getData")
    public void setData(String username, String password)
    {
        System.out.println("you have provided username as::"+username);
        System.out.println("you have provided password as::"+password);
    }
    @DataProvider
    public Object[][] getData()
    {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.
        Object[][] data = new Object[3][2];

        // 1st row
        data[0][0] ="sampleuser1";
        data[0][1] = "abcdef";

        // 2nd row
        data[1][0] ="testuser2";
        data[1][1] = "zxcvb";

        // 3rd row
        data[2][0] ="guestuser3";
        data[2][1] = "pass123";

        return data;
    }
}
