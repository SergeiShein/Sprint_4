package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QuestionsAboutImportant {
    private WebDriver driver;

    public QuestionsAboutImportant(WebDriver driver) {

        this.driver = driver;
    }

    private By cookie = By.id("rcc-confirm-button");
    private By list = By.className("Home_FAQ__3uVm4");
    private By arrowOne = By.xpath(".//div[@class = \"accordion\"]/div[1]");
    private By firstArrowText = By.xpath(".//div[@class = \"accordion\"]/div[1]/div[last()]/p");
    private By arrowTwo = By.xpath(".//div[@class = \"accordion\"]/div[2]");
    private By secondArrowText = By.xpath(".//div[@class = \"accordion\"]/div[2]/div[last()]/p");
    private By arrowThree = By.xpath(".//div[@class = \"accordion\"]/div[3]");
    private By thirdArrowText = By.xpath(".//div[@class = \"accordion\"]/div[3]/div[last()]/p");
    private By arrowFour = By.xpath(".//div[@class = \"accordion\"]/div[4]");
    private By fourthArrowText = By.xpath(".//div[@class = \"accordion\"]/div[4]/div[last()]/p");
    private By arrowFive = By.xpath(".//div[@class = \"accordion\"]/div[5]");
    private By fifthArrowText = By.xpath(".//div[@class = \"accordion\"]/div[5]/div[last()]/p");
    private By arrowSix = By.xpath(".//div[@class = \"accordion\"]/div[6]");
    private By sixthArrowText = By.xpath(".//div[@class = \"accordion\"]/div[6]/div[last()]/p");
    private By arrowSeven = By.xpath(".//div[@class = \"accordion\"]/div[7]");
    private By seventhArrowText = By.xpath(".//div[@class = \"accordion\"]/div[7]/div[last()]/p");
    private By arrowEight = By.xpath(".//div[@class = \"accordion\"]/div[8]");
    private By eighthArrowText = By.xpath(".//div[@class = \"accordion\"]/div[8]/div[last()]/p");

    public void scrollToList() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(list));
    }

    public void clickCookie() {
        driver.findElement(cookie).click();//кликаем, чтобы принять куки
    }

    public void clickArrowOne() {
        driver.findElement(arrowOne).click();//кликаем по первой стрелке для раскрытия
    }

    public String getFirstArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(firstArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowTwo() {
        driver.findElement(arrowTwo).click();//кликаем по второй стрелке для раскрытия
    }

    public String getSecondArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(secondArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowThree() {
        driver.findElement(arrowThree).click();//кликаем по третьей стрелке для раскрытия
    }

    public String getThirdArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(thirdArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowFour() {
        driver.findElement(arrowFour).click();//кликаем по четвертой стрелке для раскрытия
    }

    public String getFourthArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(fourthArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowFive() {
        driver.findElement(arrowFive).click();//кликаем по пятой стрелке для раскрытия
    }

    public String getFifthArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(fifthArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowSix() {
        driver.findElement(arrowSix).click();//кликаем по шестой стрелке для раскрытия
    }

    public String getSixthArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(sixthArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowSeven() {
        driver.findElement(arrowSeven).click();//кликаем по седьмой стрелке для раскрытия
    }

    public String getSeventhArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(seventhArrowText, 0)).get(0).getText();//возвращаем текст
    }

    public void clickArrowEight() {
        driver.findElement(arrowEight).click();//кликаем по восьмой стрелке для раскрытия
    }

    public String getEighthArrowText() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(eighthArrowText, 0)).get(0).getText();//возвращаем текст
    }


}
