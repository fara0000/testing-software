import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class FirefoxTest {
    FirefoxDriver driver;
    MainPage mainPage;
    AuthorizationPage authorizationPage;
    ProjectPage projectPage;

    @Test
    public void reviewTest() {
        System.setProperty("webdriver.gecko.driver", ConfigReader.getProperty("driverFF"));
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        projectPage = new ProjectPage(driver);

        driver.get(ConfigReader.getProperty("url"));

        mainPage.clickToReview();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        projectPage.clickReviewButton();
        projectPage.writeToName("Test");
        projectPage.writeToEmail("test@test.ru");
        assertEquals("", "");
    }


    @Test
    public void registrationTest() {
        System.setProperty("webdriver.gecko.driver", ConfigReader.getProperty("driverFF"));
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        authorizationPage = new AuthorizationPage(driver);

        driver.get(ConfigReader.getProperty("url"));

        mainPage.clickToReferralProgram();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        authorizationPage.clickSignUpButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        authorizationPage.writeToEmail("test@test.ru");
        authorizationPage.writeToName("test");
        authorizationPage.writeToPassword("123456");
        authorizationPage.writeToCheckPassword("123456");
        authorizationPage.acceptCoockie();
        authorizationPage.clickSubmit();
        assertEquals("", "");
    }
}
