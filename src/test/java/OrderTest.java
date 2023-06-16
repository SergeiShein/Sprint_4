import constants.TestConstants;
import org.example.OrderPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderTest extends BaseTest {

    @Test
    public void testOrderPageWithTheTopButton() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOrderUpperButton();
        orderPage.clickCookie();
        orderPage.typeName(TestConstants.TOP_BUTTON_ORDER_NAME);
        orderPage.typeSurname(TestConstants.TOP_BUTTON_ORDER_SURNAME);
        orderPage.typeAddress(TestConstants.TOP_BUTTON_ORDER_ADDRESS);
        orderPage.clickMetro();
        orderPage.selectRandomMetroStation();
        orderPage.typePhone(TestConstants.TOP_BUTTON_ORDER_NUMBER);
        orderPage.clickNextButton();
        orderPage.clickRentalDate();
        orderPage.clickInputRentalDate();
        orderPage.clickRentalPeriod();
        orderPage.clickInputRentalPeriod();
        orderPage.clickColor();
        orderPage.typeComment(TestConstants.TOP_BUTTON_ORDER_COMMENT);
        orderPage.clickOrder1Button();
        orderPage.clickYesButton();
        String finishOrderTitleText = orderPage.getFinishOrderTitleText();
        assertTrue(finishOrderTitleText.contains(TestConstants.ORDER_FINISH_TITLE_TEXT));
    }

    @Test
    public void testOrderPageWithTheBottomButton() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOrderLowerButton();
        orderPage.clickCookie();
        orderPage.typeName(TestConstants.BOTTOM_BUTTON_ORDER_NAME);
        orderPage.typeSurname(TestConstants.BOTTOM_BUTTON_ORDER_SURNAME);
        orderPage.typeAddress(TestConstants.BOTTOM_BUTTON_ORDER_ADDRESS);
        orderPage.clickMetro();
        orderPage.selectRandomMetroStation();
        orderPage.typePhone(TestConstants.BOTTOM_BUTTON_ORDER_NUMBER);
        orderPage.clickNextButton();
        orderPage.clickRentalDate();
        orderPage.clickInputRentalDate();
        orderPage.clickRentalPeriod();
        orderPage.clickInputRentalPeriod();
        orderPage.clickColor();
        orderPage.typeComment(TestConstants.BOTTOM_BUTTON_ORDER_COMMENT);
        orderPage.clickOrder1Button();
        orderPage.clickYesButton();
        String finishOrderTitleText = orderPage.getFinishOrderTitleText();
        assertTrue(finishOrderTitleText.contains(TestConstants.ORDER_FINISH_TITLE_TEXT));
    }


}
