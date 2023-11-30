package by.itacademy.akachenok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private String buttonCloseBannerAdvertisement = "//button[@data-test-type='close']";
    private String linkPizza = "//a[@href='/pizza']";
    private String buttonOrderMargarita = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[30]/div/div[6]/div[2]/button/span/span[2]/span";
    private String linkCart = "//span[@class='cart-button__button-text']";
    private String textMargaritaCart = "//div[text()='Маргарита']";
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCloseBannerAdvertisement() {
        driver.findElement(By.xpath(buttonCloseBannerAdvertisement)).click();
    }

    public void clickLinkPizza() {
        driver.findElement(By.xpath(linkPizza)).click();
    }

    public void clickButtonOrderMargarita() {
        driver.findElement(By.xpath(buttonOrderMargarita)).click();
    }

    public void clickLinkCart() {
        driver.findElement(By.xpath(linkCart)).click();
    }

    public String getTextMargaritaCart() {
        return driver.findElement(By.xpath(textMargaritaCart)).getText();
    }

}
