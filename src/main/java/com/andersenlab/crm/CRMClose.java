package com.andersenlab.crm;

import io.qameta.allure.Step;
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

    @Step("Click on element with CSS selector {cssSelector}")
    public CRMClose click(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
        return this;
    }

    @Step("Wait element to be clickable by CSS selector {cssSelector}")
    public CRMClose waitClickElementVisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
        return this;
    }

    @Step("Close site")
    public CRMClose close() {
        driver.close();
        return this;
    }

    @Step("Wait element invisible by CSS selector {cssSelector}")
    public CRMClose waitElementInvisible(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

}
