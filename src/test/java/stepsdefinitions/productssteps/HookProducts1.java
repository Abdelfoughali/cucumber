package stepsdefinitions.productssteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilis.ConfiReader;
import utilis.DriverHelper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HookProducts1 {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void beforeScenario(){
        driver.navigate().to(ConfiReader.readProperty("producturl"));
    }
    @After
    public void afterScenario(Scenario scenario){
        Date currentDate= new Date();
        String secreenShotFileName=currentDate.toString().replace(" ","-")
                .replace(":","-");
        if (scenario.isFailed()){
            File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShotFile,new File("src/test/java/screenshot/"+secreenShotFileName +".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       // DriverHelper.tearDown();
    }
}


