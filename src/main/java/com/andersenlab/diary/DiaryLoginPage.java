package com.andersenlab.diary;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static com.andersenlab.DiaryConstants.*;


public class DiaryLoginPage {

    private final WebDriver driver;

    public DiaryLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public DiaryLoginPage open() {
        driver.get(openSite);
        return this;
    }

    public DiaryLoginPage addCookies() {
        Cookie _csrf = new Cookie(nameCookie_1, value_1);
        Cookie _session = new Cookie(nameCookie_2, value_2);
        Cookie _identity = new Cookie(nameCookie_3, value_3);
        driver.manage().addCookie(_csrf);
        driver.manage().addCookie(_session);
        driver.manage().addCookie(_identity);
        return this;
    }

    public DiaryLoginPage size() {
        driver.manage().window().setSize(new Dimension(BROWSER_WIDTH, BROWSER_HEIGHT));
        return this;
    }

    public DiaryLoginPage click(By locator) {
        driver.findElement(locator).click();
        return this;
    }

    public DiaryLoginPage mouseOver(By locator) {
        WebElement element = driver.findElement(locator);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        return this;
    }

    public DiaryLoginPage sendKeys(String id, String value) {
        driver.findElement(By.id(id)).sendKeys(value);
        return this;
    }

    public DiaryLoginPage remember() {
        driver.switchTo().frame(0);
        return this;
    }

    public DiaryLoginPage frame() {
        driver.switchTo().defaultContent();
        return this;
    }

}
