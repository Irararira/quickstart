package com.andersenlab.diary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiaryDrafts {

    private final WebDriver driver;

    public DiaryDrafts(WebDriver driver) {
        this.driver = driver;
    }

    public DiaryDrafts click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    public DiaryDrafts close() {
        driver.close();
        return this;
    }
}
