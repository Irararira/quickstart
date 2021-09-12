package com.andersenlab.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static com.andersenlab.CRMConstants.NAME_PREFIX;
import static com.andersenlab.CRMConstants.WAIT_TIMEOUT_SECONDS;

public class CRMCreateProject {

    private static final Random random = new Random(0L);
    private final WebDriver driver;

    public CRMCreateProject(WebDriver driver) {
        this.driver = driver;
    }

    public static String generateName() {
        return NAME_PREFIX + random.ints(0, 999999999).findFirst().getAsInt();
    }

    public CRMCreateProject waitElementVisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

    public CRMCreateProject waitClickElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return this;
    }

    public CRMCreateProject click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    public CRMCreateProject selectFromList(String cssSelector, String xpath) {
        WebElement dropdown = driver.findElement(By.cssSelector(cssSelector));
        dropdown.findElement(By.xpath(xpath)).click();
        return this;
    }

    public CRMCreateProject sendKeys(String cssSelector, String value) {
        driver.findElement(By.cssSelector(cssSelector))
                .sendKeys(value);
        return this;
    }

    public CRMCreateProject waitForElementPresent(String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
        return this;
    }


}