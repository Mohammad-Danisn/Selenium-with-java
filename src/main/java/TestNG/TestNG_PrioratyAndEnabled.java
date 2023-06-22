package TestNG;

import org.testng.annotations.*;

public class TestNG_PrioratyAndEnabled {

    /*
    @BeforeMethod
    public void Abc()
    {
        System.out.println("ABC");
    }

     */
    @BeforeSuite
    public void Abc(){}
    @Test(priority = 1, enabled= true)
    public void BtestCase01() {
        System.out.println("I'm first test case");
    }

    @Test(priority = 2,enabled= true)
    public void AtestCase02() {
        System.out.println("I'm second test case");
    }

    @Test(priority = 3,enabled= true)
    public void DtestCase03() {
        System.out.println("I'm third test case");
    }

    @Test(priority = 4,enabled= true)
    public void CtestCase04() {
        System.out.println("I'm forth test case");
    }
    /*
    @AfterMethod
    public void Xyz()
    {
        System.out.println("XYZ");
    }

     */
    @AfterSuite
    public void Xyz(){}
}
