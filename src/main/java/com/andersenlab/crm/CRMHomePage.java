package com.andersenlab.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.andersenlab.CRMConstants.WAIT_TIMEOUT_SECONDS;

public class CRMHomePage {

    private final WebDriver driver;

    public CRMHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CRMHomePage waitElementInvisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return this;
    }

    public CRMHomePage waitElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public CRMHomePage haveElement(String linkText) {
        List<WebElement> elements = driver.findElements(By.linkText(linkText));
        assert (elements.size() > 0);
        return this;
    }

    public CRMHomePage mouseOver(String linkText) {
        WebElement element = driver.findElement(By.linkText(linkText));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        return this;
    }

    public CRMHomePage click(By locator) {
        driver.findElement(locator).click();
        return this;
    }


}
