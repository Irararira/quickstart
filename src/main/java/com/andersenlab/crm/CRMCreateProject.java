package com.andersenlab.crm;

import io.qameta.allure.Step;
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

    @Step("Generated name")
    public static String generateName() {
        return NAME_PREFIX + random.ints(0, 999999999).findFirst().getAsInt();
    }

    @Step("Wait element visible with CSS selector {cssSelector}")
    public CRMCreateProject waitElementVisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

    @Step("Wait click element visible with Locator {locator}")
    public CRMCreateProject waitClickElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return this;
    }

    @Step("Click on element with Locator {locator}")
    public CRMCreateProject click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    @Step("Select from list with CSS selector {cssSelector} to Xpath {xpath}")
    public CRMCreateProject selectFromList(String cssSelector, String xpath) {
        WebElement dropdown = driver.findElement(By.cssSelector(cssSelector));
        dropdown.findElement(By.xpath(xpath)).click();
        return this;
    }

    @Step("Send keys with CSS selector {cssSelector} to Value {value}")
    public CRMCreateProject sendKeys(String cssSelector, String value) {
        driver.findElement(By.cssSelector(cssSelector))
                .sendKeys(value);
        return this;
    }

    @Step("Wait for element present with CSS selector {cssSelector}")
    public CRMCreateProject waitForElementPresent(String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
        return this;
    }


}