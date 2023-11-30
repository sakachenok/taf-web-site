package by.itacademy.akachenok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest{

    @BeforeEach
    public void start() {
        driver.get("https://www.dominos.by/");
    }

    @Test
    public void testOrderMargaritaInCart() throws InterruptedException {
        DominosPage dominosPage = new DominosPage(driver);
        Thread.sleep(2000);
        dominosPage.clickButtonCloseBannerAdvertisement();
        dominosPage.clickLinkPizza();
        dominosPage.clickButtonOrderMargarita();
        dominosPage.clickLinkCart();
        dominosPage.getTextMargaritaCart();
    }

}
