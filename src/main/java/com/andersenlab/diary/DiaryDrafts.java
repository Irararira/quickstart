package com.andersenlab.diary;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiaryDrafts {

    private final WebDriver driver;

    public DiaryDrafts(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click on element with Locator {locator}")
    public DiaryDrafts click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    @Step("Close site")
    public DiaryDrafts close() {
        driver.close();
        return this;
    }
}
