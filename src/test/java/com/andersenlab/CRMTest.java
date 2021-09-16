package com.andersenlab;
// Generated by Selenium IDE

import com.andersenlab.crm.*;
import com.andersenlab.listener.BrowserConsoleEventListener;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static com.andersenlab.CRMConstants.*;

public class CRMTest {
    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new EventFiringWebDriver(new ChromeDriver())
                .register(new BrowserConsoleEventListener());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Project creation")
    @Description("Creation of a project with detailed information")
    public void testcase1() {
        new CRMLoginPage(driver)
                .open()
                .size()
                .enterAuthenticationValue(clickUserName, enterUserName)
                .enterAuthenticationValue(clickEnterPassword, enterPassword)
                .click(clickRemember)
                .click(clickLogin);

        new CRMHomePage(driver)
                .waitElementInvisible(By.id(waitHomePage))
                .haveElement(haveElementProjects)
                .mouseOver(haveElementProjects)
                .waitElementVisible(By.cssSelector(waitMyProject))
                .click(By.cssSelector(waitMyProject))
                .waitElementVisible(By.linkText(createProject))
                .click(By.linkText(createProject));

        new CRMCreateProject(driver)
                .waitClickElementVisible(By.cssSelector(waitNameElement))
                .click(By.cssSelector(waitNameElement))
                .sendKeys(waitNameElement, CRMCreateProject.generateName())
                .click(By.cssSelector(organization))
                .waitForElementPresent(nameOrganization)
                .click(By.cssSelector(nameOrganization))
                .waitClickElementVisible(By.xpath(waitOrganization))
                .click(By.xpath(clickContactPerson))
                .waitElementVisible(contactPerson)
                .click(By.cssSelector(contactPerson))
                .click(By.cssSelector(subdivision))
                .selectFromList(subdivision, clickSubdivision)
                .click(By.cssSelector(curatorProject))
                .selectFromList(curatorProject, clickCuratorProject)
                .click(By.cssSelector(projectManager))
                .selectFromList(projectManager, clickProjectManager)
                .click(By.cssSelector(projectAdministrator))
                .selectFromList(projectAdministrator, clickProjectAdministrator)
                .click(By.cssSelector(manager))
                .selectFromList(manager, clickManager);

        new CRMClose(driver)
                .click(clickSaveAndClose)
                .waitElementInvisible(waitSaveAndClose)
                .waitClickElementVisible(waitClickPersonalAccount)
                .click(waitClickPersonalAccount)
                .click(clickExit)
                .close();
    }

    @Test
    @DisplayName("Create a contact person")
    @Description("Provide all necessary information about the contact person")
    public void testcase2() {
        new CRMLoginPage(driver)
                .open()
                .size()
                .enterAuthenticationValue(clickUserName, enterUserName)
                .enterAuthenticationValue(clickEnterPassword, enterPassword)
                .click(clickRemember)
                .click(clickLogin);

        new CRMHomePage(driver)
                .waitElementInvisible(By.id(waitHomePage))
                .haveElement(haveElementContractors)
                .mouseOver(haveElementContractors)
                .click(By.cssSelector(clickContactFaces))
                .waitElementVisible(By.linkText(contactFaces))
                .click(By.linkText(contactFaces));

        new CRMCreateContactPerson(driver)
                .waitElementVisible(By.cssSelector(waitLastName))
                .click(waitLastName)
                .sendKeys(waitLastName, enterLastName)
                .click(clickFirstName)
                .sendKeys(clickFirstName, enterFirstName)
                .click(clickMiddleName)
                .sendKeys(clickMiddleName, enterMiddleName)
                .click(clickOrganizationField)
                .waitForElementPresent(By.cssSelector(elementPresent))
                .click(clickOrganization)
                .click(clickPosition)
                .sendKeys(clickPosition, position)
                .click(clickStatus)
                .selectFromList(clickStatus, status);

        new CRMClose(driver)
                .click(clickSaveAndClose)
                .waitElementInvisible(waitSaveAndClose)
                .waitClickElementVisible(waitClickPersonalAccount)
                .click(waitClickPersonalAccount)
                .click(clickExit)
                .close();
    }
}
