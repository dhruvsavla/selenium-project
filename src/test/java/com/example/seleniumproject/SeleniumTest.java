package com.example.seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class SeleniumTest {

    public static Logger logger;

    public static void main(String arge[]) throws InterruptedException {
        logger = LogManager.getLogger(SeleniumTest.class);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        logger.info("Get the website ");
        driver.get("https://www.insure.com/");

        Thread.sleep(3000);

        logger.info(" 1 ");
        driver.findElement(By.id("hp_bnrcard_auto")).click();

        Thread.sleep(3000);

        logger.info(" 2 ");
        driver.findElement(By.id("banner-auto-zip-input")).clear();

        Thread.sleep(3000);

        logger.info(" 3 ");
        driver.findElement(By.id("banner-auto-zip-input")).sendKeys("95125");

        Thread.sleep(3000);

        logger.info(" 4 ");
        driver.findElement(By.id("auto")).click();

        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();
        Iterator it = handles.iterator();
        String parentId = (String) it.next();
        String childId = (String) it.next();
        System.out.println("childId = " + childId + "paretId = " + parentId);
        logger.info(" switching ");
        driver.switchTo().window(childId);

        logger.info(" 5 ");
        driver.findElement(By.id("dohavemultipledrivers-no")).click();

        Thread.sleep(3000);

        logger.info(" 6 ");
        driver.findElement(By.id("ownhome-no")).click();

        Thread.sleep(3000);

        logger.info(" 7 ");
        driver.findElement(By.id("maritalstatus-no")).click();

        Thread.sleep(3000);

        logger.info(" 8 ");
        driver.findElement(By.id("dohavemultiplevehicles-no")).click();

        Thread.sleep(3000);

        logger.info(" 9 10 11 ");
        driver.findElement(By.id("BirthMonth")).sendKeys("05");
        driver.findElement(By.id("BirthDay")).sendKeys("04");
        driver.findElement(By.id("BirthYear")).sendKeys("1999");

        Thread.sleep(3000);

        logger.info(" 12 ");
        driver.findElement(By.id("birthmonth_next")).click();

        Thread.sleep(3000);

        logger.info(" 13 ");
        driver.findElement(By.xpath("/html/body/div[1]/article/form/div[10]/div/ul/li[7]")).click();

        Thread.sleep(3000);

        logger.info(" 14 ");
        driver.findElement(By.id("button_5_insuredtimeframe")).click();

        Thread.sleep(3000);

        logger.info(" 15 ");
        driver.findElement(By.id("button_2_safedrivingproducts")).click();

        Thread.sleep(3000);

        logger.info(" 16 ");
        driver.findElement(By.id("interstitialClose")).click();

        Thread.sleep(3000);

        logger.info(" 17 ");
        driver.findElement(By.xpath("/html/body/div[1]/article/form/div[14]/div/ul/li[5]")).click();

        Thread.sleep(3000);

        logger.info(" 18 ");
        driver.findElement(By.xpath("/html/body/div[1]/article/form/div[15]/div/ul/li[14]")).click();

        Thread.sleep(3000);

        logger.info(" 19 ");
        driver.findElement(By.xpath("/html/body/div[1]/article/form/div[16]/div/ul/li[5]")).click();

        Thread.sleep(3000);

        logger.info(" 20 ");
        driver.findElement(By.id("button_2_licensestatus_test")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("button_1_anyrecentincidents")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("button_2_military_status")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("button_2_gender")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("licensestatus_test_next")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("FirstName")).sendKeys("Dhruv");
        driver.findElement(By.id("LastName")).sendKeys("Savla");
        driver.findElement(By.id("EmailAddress")).sendKeys("dsavla0405@gmail.com");

        Thread.sleep(3000);
        driver.findElement(By.id("firstname_next")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("Address")).sendKeys("1257 Babb Ct");
        Thread.sleep(3000);

        driver.findElement(By.id("PhoneNumber")).sendKeys("5627879723");
        Thread.sleep(3000);

        driver.findElement(By.id("address_next")).click();

        Thread.sleep(10000);

        driver.quit();
    }
}
