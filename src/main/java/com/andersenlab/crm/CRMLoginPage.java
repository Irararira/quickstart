package com.andersenlab.crm;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static com.andersenlab.CRMConstants.*;

public class CRMLoginPage {

    private final WebDriver driver;

    public CRMLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open site")
    public CRMLoginPage open() {
        driver.get(openSite);
        return this;
    }

    @Step("Enlarge the browser window")
    public CRMLoginPage size() {
        driver.manage().window().setSize(new Dimension(BROWSER_WIDTH, BROWSER_HEIGHT));
        return this;
    }

    @Step("Authentication with Id {id} to Keys {keys}")
    public CRMLoginPage enterAuthenticationValue(String id, String keys) {
        driver.findElement(By.id(id)).sendKeys(keys);
        return this;
    }

    @Step("Click on element with Id {id}")
    public CRMLoginPage click(String id) {
        driver.findElement(By.id(id)).click();
        return this;
    }


}
