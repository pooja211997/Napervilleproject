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
public class ContactUs {
    private WebDriver driver;
    
    public ContactUs() {
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
  public void testContactUsTestCase() throws Exception {
    driver.get("https://napervillemarketplace.com/contact-us/");
    //driver.findElement(By.id("wpforms-101-field_0")).click();
    driver.findElement(By.id("wpforms-101-field_0")).clear();
    driver.findElement(By.id("wpforms-101-field_0")).sendKeys("Amy");
    //driver.findElement(By.id("wpforms-101-field_0-last")).click();
    driver.findElement(By.id("wpforms-101-field_0-last")).clear();
    driver.findElement(By.id("wpforms-101-field_0-last")).sendKeys("patel");
    //driver.findElement(By.id("wpforms-101-field_3")).click();
    driver.findElement(By.id("wpforms-101-field_3")).clear();
    driver.findElement(By.id("wpforms-101-field_3")).sendKeys("1234567890");
    //driver.findElement(By.id("wpforms-101-field_1")).click();
    driver.findElement(By.id("wpforms-101-field_1")).clear();
    driver.findElement(By.id("wpforms-101-field_1")).sendKeys("amypatel1997@gmail.com");
    //driver.findElement(By.id("wpforms-101-field_2")).click();
    driver.findElement(By.id("wpforms-101-field_2")).clear();
    driver.findElement(By.id("wpforms-101-field_2")).sendKeys("hi");
    WebDriverWait wait1=new WebDriverWait(driver, 20);  //60 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpforms-submit-101")));
    driver.findElement(By.id("wpforms-submit-101")).click();
  }
}
