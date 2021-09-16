package com.andersenlab.diary;

import io.qameta.allure.Step;
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

    @Step("Wait for element located with CSS selector {cssSelector}")
    public DiaryClose waitForElementLocated(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        return this;
    }

    @Step("Click on element with Locator {locator}")
    public DiaryClose click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    @Step("Close site")
    public DiaryClose close() {
        driver.close();
        return this;
    }
}
