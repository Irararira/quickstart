package com.andersenlab.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.CRMConstants.WAIT_TIMEOUT_SECONDS;

public class CRMClose {

    private final WebDriver driver;

    public CRMClose(WebDriver driver) {
        this.driver = driver;
    }

    public CRMClose click(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
        return this;
    }

    public CRMClose waitClickElementVisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
        return this;
    }

    public CRMClose close() {
        driver.close();
        return this;
    }

    public CRMClose waitElementInvisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

}
