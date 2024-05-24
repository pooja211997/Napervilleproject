/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
public class MemberRegistration {
    private WebDriver driver;
    
    public MemberRegistration() {
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
    public void testMemberRegistrationTestCase() throws Exception {
      driver.get("https://napervillemarketplace.com/register/");
      WebDriverWait wait=new WebDriverWait(driver, 60);  //60 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login-195")));
      //driver.findElement(By.id("user_login-195")).click();
      driver.findElement(By.id("user_login-195")).clear();
      driver.findElement(By.id("user_login-195")).sendKeys("amy3");
      //driver.findElement(By.id("first_name-195")).click();
      driver.findElement(By.id("first_name-195")).clear();
      driver.findElement(By.id("first_name-195")).sendKeys("amy");
      //driver.findElement(By.id("last_name-195")).click();
      driver.findElement(By.id("last_name-195")).clear();
      driver.findElement(By.id("last_name-195")).sendKeys("patel");
      //driver.findElement(By.id("user_email-195")).click();
      driver.findElement(By.id("user_email-195")).clear();
      driver.findElement(By.id("user_email-195")).sendKeys("amy3patel1997@gmail.com");
      //driver.findElement(By.id("user_password-195")).click();
      driver.findElement(By.id("user_password-195")).clear();
      driver.findElement(By.id("user_password-195")).sendKeys("Amy@1997");
      //driver.findElement(By.id("confirm_user_password-195")).click();
      driver.findElement(By.id("confirm_user_password-195")).clear();
      driver.findElement(By.id("confirm_user_password-195")).sendKeys("Amy@1997");
      driver.findElement(By.id("um-submit-btn")).click();
      Thread.sleep(2000);
    }
}
