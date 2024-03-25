package SELENIUM.Tests;

import SELENIUM.Pages.*;
import SELENIUM.Reausable;
import SELENIUM.Utils.BrowserFactory;
import SELENIUM.Utils.ReadFromExcel;
import SELENIUM.Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chRoMe", "https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    CheckOutInformationPage checkoutInformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);
    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);
    TakeScreenshots takeScreenshots = new TakeScreenshots();
    Reausable reausable= new Reausable();

  ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}