package com.andersenlab.diary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.DiaryConstants.WAIT_TIMEOUT_SECONDS;

public class DiaryNewEntry {

    private final WebDriver driver;

    public DiaryNewEntry(WebDriver driver) {
        this.driver = driver;
    }

    public DiaryNewEntry waitForElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public DiaryNewEntry click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    public DiaryNewEntry sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
        return this;
    }

    public DiaryNewEntry switchToFrame() {
        driver.switchTo().frame(2);
        return this;
    }

    public DiaryNewEntry switchToDefault() {
        driver.switchTo().defaultContent();
        return this;
    }
}
