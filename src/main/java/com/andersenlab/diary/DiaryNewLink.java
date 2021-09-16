package com.andersenlab.diary;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.andersenlab.DiaryConstants.WAIT_TIMEOUT_SECONDS;

public class DiaryNewLink {

    private final WebDriver driver;

    public DiaryNewLink(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Wait for element located with Locator {locator}")
    public DiaryNewLink waitForElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    @Step("Click on element with Locator {locator}")
    public DiaryNewLink click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    @Step("Send keys with Locator {locator} to Value {value}")
    public DiaryNewLink sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
        return this;
    }
}
