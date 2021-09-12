package com.andersenlab;

public interface CRMConstants {
    String clickUserName = "prependedInput";
    String enterUserName = "Applanatest1";
    String clickEnterPassword = "prependedInput2";
    String enterPassword = "Student2020!";
    String openSite = "https://crm.geekbrains.space/user/login";
    String waitHomePage = "progressbar";
    String clickRemember = "remember_me";
    String clickLogin = "_submit";
    String haveElementProjects = "Проекты";
    String waitMyProject = ".dropdown:nth-child(3) > ul > li:nth-child(4)";
    String createProject = "Создать проект";
    String haveElementContractors = "Контрагенты";
    String contactFaces = "Создать контактное лицо";
    String clickContactFaces = ".first .last .title";

    String waitLastName = ".controls > input[data-ftid=crm_contact_lastName]";
    String enterLastName = "Иванов";
    String clickFirstName = ".controls > input[data-ftid=crm_contact_firstName]";
    String enterFirstName = "Иван";
    String clickMiddleName = ".controls > input[data-ftid=crm_contact_middleName]";
    String enterMiddleName = "Иваныч";
    String clickOrganizationField = ".select2-default > .select2-chosen ";
    String elementPresent = ".select2-with-searchbox > .select2-results > .select2-more-results";
    String clickOrganization = ".select2-highlighted";
    String clickPosition = ".controls > input[data-ftid=crm_contact_jobTitle]";
    String position = "водитель";
    String clickStatus = "select[data-ftid=crm_contact_status]";
    String status = "//option[. = 'Активный']";

    String waitNameElement = ".controls > input[data-ftid=crm_project_name]";
    String organization = ".select2-default > .select2-chosen";
    String nameOrganization = ".select2-results > li:nth-child(1) > .select2-result-label";
    String waitOrganization = "//select[@data-ftid='crm_project_contactMain']";
    String clickContactPerson = "//div[@class='controls']/div[@class='select2-container select2']/a[@class='select2-choice']/span[@class='select2-arrow']";
    String contactPerson = ".select2-highlighted";
    String NAME_PREFIX = "Name";
    String subdivision = "select[data-ftid=crm_project_businessUnit]";
    String clickSubdivision = "//option[. = 'Research & Development']";
    String curatorProject = "select[data-ftid=crm_project_curator]";
    String clickCuratorProject = "//option[. = 'Юзеров Юзер']";
    String projectManager = "select[data-ftid=crm_project_rp]";
    String clickProjectManager = "//option[. = 'Катков Александр']";
    String projectAdministrator = "select[data-ftid=crm_project_administrator]";
    String clickProjectAdministrator = "//option[. = 'Ямутина Вера']";
    String manager = "select[data-ftid=crm_project_manager]";
    String clickManager = "//option[. = 'Прохорова Екатерина']";

    String clickSaveAndClose = ".btn-group:nth-child(4) > .btn";
    String waitSaveAndClose = ".loader-overlay";
    String waitClickPersonalAccount = ".icon-sort-down";
    String clickExit = ".last > a";

    int BROWSER_WIDTH = 1552;
    int BROWSER_HEIGHT = 840;
    int WAIT_TIMEOUT_SECONDS = 30;
}
