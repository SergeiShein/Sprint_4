import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class OrderTest {
    private WebDriver driver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testOrderPage1() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOrderUpperButton();
        orderPage.clickCookie();
        orderPage.typeName("Иван");
        orderPage.typeSurname("Силиванов");
        orderPage.typeAddress("г. Москва, Гаванская 5");
        orderPage.clickMetro();
        orderPage.selectRandomMetroStation();
        orderPage.typePhone("89213764563");
        orderPage.clickNextButton();
        orderPage.clickRentalDate();
        orderPage.clickInputRentalDate();
        orderPage.clickRentalPeriod();
        orderPage.clickInputRentalPeriod();
        orderPage.clickColor();
        orderPage.typeComment("Откроет консьерж");
        orderPage.clickOrder1Button();
        orderPage.clickYesButton();
        String finishOrderTitleText = orderPage.getFinishOrderTitleText();
        assertTrue(finishOrderTitleText.contains("Заказ оформлен"));
    }

    @Test
    public void testOrderPage2() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOrderLowerButton();
        orderPage.clickCookie();
        orderPage.typeName("Тимур");
        orderPage.typeSurname("Тимуров");
        orderPage.typeAddress("г. Москва, Переваловская 13 к1 кв 55");
        orderPage.clickMetro();
        orderPage.selectRandomMetroStation();
        orderPage.typePhone("89112745384");
        orderPage.clickNextButton();
        orderPage.clickRentalDate();
        orderPage.clickInputRentalDate();
        orderPage.clickRentalPeriod();
        orderPage.clickInputRentalPeriod();
        orderPage.clickColor();
        orderPage.typeComment("Звоните за час до доставки");
        orderPage.clickOrder1Button();
        orderPage.clickYesButton();
        String finishOrderTitleText = orderPage.getFinishOrderTitleText();
        assertTrue(finishOrderTitleText.contains("Заказ оформлен"));
    }

    @After
    public void tearDown() {
        // Закрыть браузер
        driver.quit();
    }
}
