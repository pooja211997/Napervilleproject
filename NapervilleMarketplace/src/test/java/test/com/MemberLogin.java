/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author phalk
 */
public class MemberLogin {
    private WebDriver driver;
    
    public MemberLogin() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    @Test
  public void testMemberLoginTestCase() throws Exception {
    driver.get("https://napervillemarketplace.com/login/");
    WebDriverWait wait=new WebDriverWait(driver, 60);  //60 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username-196")));
    //driver.findElement(By.linkText("Login")).click();
    //driver.findElement(By.id("username-196")).click();
    driver.findElement(By.id("username-196")).clear();
    driver.findElement(By.id("username-196")).sendKeys("amy");
    //driver.findElement(By.id("user_password-196")).click();
    driver.findElement(By.id("user_password-196")).clear();
    driver.findElement(By.id("user_password-196")).sendKeys("Amy@1997");
    WebDriverWait wait1=new WebDriverWait(driver, 20);  //60 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"um-submit-btn\"]")));
    //driver.findElement(By.xpath("//*[@id=\"um-submit-btn\"]")).click();
    Thread.sleep(3000);
    
  }
}
