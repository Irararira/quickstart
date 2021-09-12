package com.andersenlab.diary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.DiaryConstants.WAIT_TIMEOUT_SECONDS;

public class DiaryHomePage {

    private final WebDriver driver;

    public DiaryHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DiaryHomePage waitForElementLocated(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
        return this;
    }

    public DiaryHomePage click(By locator) {
        driver.findElement(locator).click();
        return this;
    }
}
