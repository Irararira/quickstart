package com.andersenlab;
// Generated by Selenium IDE

import com.andersenlab.diary.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.andersenlab.DiaryConstants.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaryTest {
    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void authorization() {
        new DiaryLoginPage(driver)
                .open()
                .size()
                .click(By.linkText(clickLogin))
                .mouseOver(By.linkText(clickLogin))
                .mouseOver(By.tagName(positionMouseCursor))
                .sendKeys(clickUserName, enterUserName)
                .sendKeys(clickPassword, enterPassword)
                .remember()
                .click(By.cssSelector(checkBox))
                .frame()
                .click(By.id(authorization));

        new DiaryHomePage(driver)
                .waitForElementLocated(enterUserName)
                .click(By.linkText(enterUserName));

        new DiaryClose(driver)
                .waitForElementLocated(itemLoading)
                .click(By.id(myMenu))
                .click(By.linkText(exit))
                .close();
    }

    @Test
    public void newentry() {
        new DiaryLoginPage(driver)
                .open()
                .addCookies()
                .size()
                .click(By.linkText(clickLogin));

        new DiaryNewEntry(driver)
                .waitForElementLocated(By.cssSelector(newEntry))
                .click(By.cssSelector(newEntry))
                .click(By.id(title))
                .sendKeys(By.id(title), enterTitle)
                .click(By.id(title))
                .switchToFrame()
                .waitForElementLocated(By.xpath(fieldText))
                .sendKeys(By.xpath(fieldText), textInput)
                .switchToDefault();

        new DiaryHomePage(driver)
                .click(By.linkText(enterUserName))
                .click(By.id(myMenu));

        new DiaryDrafts(driver)
                .click(By.linkText(clickDrafts))
                .click(By.cssSelector(seeDrafts))
                .close();
    }

    @Test
    public void negative() {
        new DiaryLoginPage(driver)
                .open()
                .addCookies()
                .size()
                .click(By.linkText(clickLogin));

        new DiaryNewLink(driver)
                .waitForElementLocated(By.cssSelector(newEntry))
                .click(By.cssSelector(clickMenu))
                .click(By.linkText(clickLink))
                .waitForElementLocated(By.linkText(add))
                .click(By.linkText(add))
                .waitForElementLocated(By.cssSelector(waitAdd))
                .click(By.id(sortIndex))
                .sendKeys(By.id(sortIndex), enterSoftIndex)
                .click(By.id(linkName))
                .sendKeys(By.id(linkName), enterLinkName)
                .click(By.id(introduceLink))
                .sendKeys(By.id(introduceLink), enterNegativeLink)
                .click(By.id(description))
                .sendKeys(By.id(description), enterDescription)
                .click(By.id(rememberLink))
                .waitForElementLocated(By.cssSelector(errorLink))
                .click(By.cssSelector(errorElement))
                .click(By.cssSelector(closeElement));

        new DiaryClose(driver)
                .close();
    }


    @Test
    public void newlink() {
        new DiaryLoginPage(driver)
                .open()
                .addCookies()
                .size()
                .click(By.linkText(clickLogin));

        new DiaryNewLink(driver)
                .waitForElementLocated(By.cssSelector(newEntry))
                .click(By.cssSelector(clickMenu))
                .click(By.linkText(clickLink))
                .waitForElementLocated(By.linkText(add))
                .click(By.linkText(add))
                .waitForElementLocated(By.cssSelector(waitAdd))
                .click(By.id(sortIndex))
                .sendKeys(By.id(sortIndex), enterSoftIndex)
                .click(By.id(linkName))
                .sendKeys(By.id(linkName), enterLinkName)
                .click(By.id(introduceLink))
                .sendKeys(By.id(introduceLink), enterIntroduceLink)
                .click(By.id(description))
                .sendKeys(By.id(description), enterDescription)
                .click(By.id(rememberLink))
                .waitForElementLocated(By.cssSelector(waitNewLink));

        new DiaryClose(driver)
                .close();
    }
}
