import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.QuestionsAboutImportant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class QuestionTest {
    private WebDriver driver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testQuestionsAboutImportant1() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowOne();
        String firstArrowText = questionsAboutImportant.getFirstArrowText();
        assertTrue(firstArrowText.contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    @Test
    public void testQuestionsAboutImportant2() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowTwo();
        String secondArrowText = questionsAboutImportant.getSecondArrowText();
        assertTrue(secondArrowText.contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    @Test
    public void testQuestionsAboutImportant3() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowThree();
        String thirdArrowText = questionsAboutImportant.getThirdArrowText();
        assertTrue(thirdArrowText.contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    @Test
    public void testQuestionsAboutImportant4() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowFour();
        String fourthArrowText = questionsAboutImportant.getFourthArrowText();
        assertTrue(fourthArrowText.contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    @Test
    public void testQuestionsAboutImportant5() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowFive();
        String fifthArrowText = questionsAboutImportant.getFifthArrowText();
        assertTrue(fifthArrowText.contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    @Test
    public void testQuestionsAboutImportant6() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowSix();
        String sixthArrowText = questionsAboutImportant.getSixthArrowText();
        assertTrue(sixthArrowText.contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    @Test
    public void testQuestionsAboutImportant7() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowSeven();
        String seventhArrowText = questionsAboutImportant.getSeventhArrowText();
        assertTrue(seventhArrowText.contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    @Test
    public void testQuestionsAboutImportant8() {
        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.scrollToList();
        questionsAboutImportant.clickCookie();
        questionsAboutImportant.clickArrowEight();
        String eighthArrowText = questionsAboutImportant.getEighthArrowText();
        assertTrue(eighthArrowText.contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    @After
    public void tearDown() {
        // Закрыть браузер
        driver.quit();
    }
}
