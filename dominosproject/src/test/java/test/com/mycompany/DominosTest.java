/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.dominosproject.SigninPage1;
import com.mycompany.dominosproject.SigninPage2;
import com.mycompany.dominosproject.SigninPage3;
import com.mycompany.dominosproject.SigninPage4;
import com.mycompany.dominosproject.SigninPage5;
import com.mycompany.dominosproject.SignoutPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class DominosTest {
     private static WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    public DominosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         js = (JavascriptExecutor) driver;
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
       
    @Test
    public void executeSigninPageModule() throws Exception {
        SigninPage1 signinpage1 = PageFactory.initElements(driver, SigninPage1.class);
        signinpage1.signinToFlighApplication();

    }

    @Test
    public void executeSignoutPage() throws Exception {
        SignoutPage signout = PageFactory.initElements(driver, SignoutPage.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/div/button")));
        signout.signoutPage();
        Thread.sleep(2000);
        driver.close();
        
    }

    @Test
    public void executeSigninPage2Module() throws Exception {
        SigninPage2 signinpage2 = PageFactory.initElements(driver, SigninPage2.class);
        signinpage2.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage3Module() throws Exception {
        SigninPage3 signinpage3 = PageFactory.initElements(driver, SigninPage3.class);
        signinpage3.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage4Module() throws Exception {
        SigninPage4 signinpage4 = PageFactory.initElements(driver, SigninPage4.class);
        signinpage4.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage5Module() throws Exception {
        SigninPage5 signinpage5 = PageFactory.initElements(driver, SigninPage5.class);
        signinpage5.signinToFlighApplication();
    }
    
  
  @Test
    public void executekeepmesignedInModule() throws Exception {
        SigninPage1 signinpage1 = PageFactory.initElements(driver, SigninPage1.class);
        signinpage1.signinToFlighApplication();
    }
         @Test
  public void TestMenuone() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.manage().window().maximize();    
    driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[1]/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/div/div[2]/a")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js.executeScript("window.scrollTo(0, 250)");
    driver.findElement(By.xpath("//*[@id=\"js-categoryArea\"]/section/div/div[12]/div/a/img")).click(); //prb line
    driver.findElement(By.xpath("//*[@id=\"Carryout\"]")).click();   
    driver.findElement(By.id("City")).click();   
    driver.findElement(By.id("City")).clear();
    driver.findElement(By.id("City")).sendKeys("Streamwood");
    driver.findElement(By.id("Region")).click();
    new Select(driver.findElement(By.id("Region"))).selectByVisibleText("IL");
    driver.findElement(By.xpath(" //*[@id=\"PostalCode\"]")).clear();
    driver.findElement(By.className("css-14js2j3")).click();
    driver.findElement(By.xpath("//*[@id=\"locationsResultsPage\"]/div/div[2]/div[1]/div[3]/div/div[2]/div[1]/a/span[1]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"pageModal\"]/div/section/div/div/ol/div/div/button[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"js-myOrderPage\"]/a")).click(); 
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genericOverlay\"]/section/div/div[2]/div/a")));
    driver.findElement(By.xpath("//*[@id=\"genericOverlay\"]/section/div/div[2]/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"js-checkoutColumns\"]/aside/div[4]/div[1]/a")).click();  
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_dpz\"]/div[1]/section/div/div/div[2]/button")));
    driver.findElement(By.xpath("//*[@id=\"_dpz\"]/div[1]/section/div/div/div[2]/button")).click();
    
  }
  
    
}
