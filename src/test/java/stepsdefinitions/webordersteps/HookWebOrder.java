package stepsdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilis.DriverHelper;

import java.sql.Driver;

public class HookWebOrder {
    @Before
    public void beforeScenario(){
        System.out.println("it runs before each scenario");
    }
    @After
    public void afterScenario(){
       // DriverHelper.tearDown();
        System.out.println("it runs after each scenario");
    }



}
