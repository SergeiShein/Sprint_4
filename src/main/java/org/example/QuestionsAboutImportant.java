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

    public void clickArrow(int arrowNumber){
        if (arrowNumber == 1){
            driver.findElement(arrowOne).click();
        } else if (arrowNumber == 2) {
            driver.findElement(arrowTwo).click();
        } else if (arrowNumber == 3) {
            driver.findElement(arrowThree).click();
        } else if (arrowNumber == 4) {
            driver.findElement(arrowFour).click();
        } else if (arrowNumber == 5){
            driver.findElement(arrowFive).click();
        } else if (arrowNumber == 6) {
            driver.findElement(arrowSix).click();
        } else if (arrowNumber == 7) {
            driver.findElement(arrowSeven).click();
        } else if (arrowNumber == 8) {
            driver.findElement(arrowEight).click();
        }
    }
    public String getArrowText(int arrowTextNumber){
        if (arrowTextNumber == 1){
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(firstArrowText, 0)).get(0).getText();
        } else if (arrowTextNumber == 2){
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(secondArrowText, 0)).get(0).getText();
        } else if (arrowTextNumber == 3) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(thirdArrowText, 0)).get(0).getText();
        } else if (arrowTextNumber == 4) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(fourthArrowText, 0)).get(0).getText();//возвращаем текст
        } else if (arrowTextNumber == 5) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(fifthArrowText, 0)).get(0).getText();//возвращаем текст
        } else if (arrowTextNumber == 6) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(sixthArrowText, 0)).get(0).getText();//возвращаем текст
        } else if (arrowTextNumber == 7) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(seventhArrowText, 0)).get(0).getText();//возвращаем текст
        } else if (arrowTextNumber == 8) {
            return new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(eighthArrowText, 0)).get(0).getText();//возвращаем текст
        }
        return "";
    }
    public void scrollToList() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(list));
    }
    public void clickCookie() {
        driver.findElement(cookie).click();//кликаем, чтобы принять куки
    }
}
