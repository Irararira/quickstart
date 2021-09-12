package com.andersenlab.diary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.DiaryConstants.WAIT_TIMEOUT_SECONDS;

public class DiaryClose {

    private final WebDriver driver;

    public DiaryClose(WebDriver driver) {
        this.driver = driver;
    }

    public DiaryClose waitForElementLocated(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

    public DiaryClose click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    public DiaryClose close() {
        driver.close();
        return this;
    }
}
