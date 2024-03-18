package CUCUMBER.StepDefinations;


import CUCUMBER.Helpers.BrowserSetup;
import CUCUMBER.Pages.HomePage;
import CUCUMBER.Pages.LoginPage;
import CUCUMBER.Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserSetup browserSetup = new BrowserSetup();
    final WebDriver driver=browserSetup.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    TakeScreenshots screenshots =new TakeScreenshots();
}
