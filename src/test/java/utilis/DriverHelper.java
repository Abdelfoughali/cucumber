package utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHelper {
    // private variable
    private static WebDriver driver;
    // private  constructor to make sure they can not creat an object
    private DriverHelper(){}
//    public static WebDriver getDriver() {
//        String browser = "chrome";
//
//        if (driver == null) {// i am checking driver whether it is null or not
//            // if driver is null i am going to create new one
//            // if not it is not to create a new driver it will use the existing one
//
//            switch (browser) {
//                case "chrome":
//
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//
//                    // this implicity wait will wait for the elment untol 10 seconds to be loaded
//                    break;
//                case "firefox":
//
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//
//                    // this implicity wait will wait for the elment untol 10 seconds to be loaded
//                    break;
//                default:
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//                    break;
//                // this implicity wait will wait for the elment untol 10 seconds to be loaded
//
//            }
//            return driver;
//        }
//        public static void tearDown () {
//            driver.quit();
//            driver = null;
//        }
//    }}

    public static WebDriver getDriver(){

        if(driver==null){//I am checking driver whether it is null or not.
            //if driver is null I am going to create a new one
            //if not,It is not going to create a new Driver.It will use the existing(current) one.
            switch (ConfiReader.readProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();//for fresh start(testing)
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        }
        return driver;
    }
    public static void tearDown(){
        driver.quit();
        driver=null;
    }}


