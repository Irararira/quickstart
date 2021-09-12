package com.andersenlab.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.CRMConstants.WAIT_TIMEOUT_SECONDS;

public class CRMCreateContactPerson {

    private final WebDriver driver;

    public CRMCreateContactPerson(WebDriver driver) {
        this.driver = driver;
    }

    public CRMCreateContactPerson waitElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public CRMCreateContactPerson waitForElementPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }

    public CRMCreateContactPerson click(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
        return this;
    }

    public CRMCreateContactPerson selectFromList(String cssSelector, String xpath) {
        WebElement dropdown = driver.findElement(By.cssSelector(cssSelector));
        dropdown.findElement(By.xpath(xpath)).click();
        return this;
    }

    public CRMCreateContactPerson sendKeys(String cssSelector, String value) {
        driver.findElement(By.cssSelector(cssSelector))
                .sendKeys(value);
        return this;
    }
}
