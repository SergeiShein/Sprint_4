package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }

    private By orderUpperButton = By.className("Button_Button__ra12g");
    private By orderLowerButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private By cookie = By.id("rcc-confirm-button");
    private By nameInput = By.xpath(".//input[@placeholder = \"* Имя\"]");
    private By surnameInput = By.xpath(".//input[@placeholder = \"* Фамилия\"]");
    private By addressInput = By.xpath(".//input[@placeholder = \"* Адрес: куда привезти заказ\"]");
    private By metroClick = By.xpath(".//input[@placeholder = \"* Станция метро\"]");
    private By metroListInput = By.className("Order_SelectOption__82bhS");
    private By phoneNumberInput = By.xpath(".//input[@placeholder = \"* Телефон: на него позвонит курьер\"]");
    private By signNextButtonClick = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By rentalDateClick = By.xpath(".//input[@placeholder = \"* Когда привезти самокат\"]");
    private By rentalDateInput = By.xpath(".//div[@aria-label = \"Choose четверг, 22-е июня 2023 г.\"]");
    private By rentalPeriodClick = By.className("Dropdown-placeholder");
    private By rentalPeriodInput = By.xpath(".//div[@class = \"Dropdown-menu\"]/div[3]");
    private By colorClick = By.id("black");
    private By commentInput = By.xpath(".//input[@placeholder = \"Комментарий для курьера\"]");
    private By order1ButtonClick = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By signYesButton = By.xpath(".//button[text() = \"Да\"]");
    private By finishOrderTitle = By.xpath(".//div[@class = \"Order_ModalHeader__3FDaJ\"]");

    public void clickOrderUpperButton() {
        driver.findElement(orderUpperButton).click(); //кликаем на элемент Заказать вверху страницы
    }

    public void clickOrderLowerButton() {
        driver.findElement(orderLowerButton).click(); //кликаем на элемент Заказать внизу страницы
    }

    public void clickCookie() {
        driver.findElement(cookie).click();//кликаем, чтобы принять куки
    }

    public void typeName(String name) {
        driver.findElement(nameInput).sendKeys(name);//заполняем имя
    }

    public void typeSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);//заполняем фамилию
    }

    public void typeAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);//заполняем адрес
    }

    public void clickMetro() {
        driver.findElement(metroClick).click();//кликаем для выбора метро
    }

    public void selectRandomMetroStation() {
        List<WebElement> metroButtons = new WebDriverWait(driver, 7)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(metroListInput, 0));
        int randomMetroNumber = new Random().nextInt(metroButtons.size());
        metroButtons.get(randomMetroNumber).click();
    }

    public void typePhone(String phone) {
        driver.findElement(phoneNumberInput).sendKeys(phone); //заполняем номер телефона
    }

    public void clickNextButton() {
        driver.findElement(signNextButtonClick).click(); //кликаем на кнопку далее
    }

    public void clickRentalDate() {
        driver.findElement(rentalDateClick).click();//кликаем для открытия меню выбора даты
    }

    public void clickInputRentalDate() {
        driver.findElement(rentalDateInput).click();//выбираем дату аренды
    }

    public void clickRentalPeriod() {
        driver.findElement(rentalPeriodClick).click();//кликаем для открытия окна выбора периода
    }

    public void clickInputRentalPeriod() {
        driver.findElement(rentalPeriodInput).click();//выбираем на сколько арендуем
    }

    public void clickColor() {
        driver.findElement(colorClick).click();//кликаем для выбора цвета
    }

    public void typeComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment); //заполняем комментарий для курьера
    }

    public void clickOrder1Button() {
        driver.findElement(order1ButtonClick).click();//кликаем по кнопке "Заказать"
    }

    public void clickYesButton() {
        driver.findElement(signYesButton).click();//кликаем по кнопке "Да"
    }

    public String getFinishOrderTitleText() {
        return new WebDriverWait(driver, 3)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(finishOrderTitle, 0)).get(0).getText();
    }


}
