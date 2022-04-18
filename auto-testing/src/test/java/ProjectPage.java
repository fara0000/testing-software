import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div[1]/button")
    private WebElement buttonWriteReview;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div/div[1]/div[1]/input[1]")
    private WebElement yourNameField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div/div[1]/div[1]/input[2]")
    private WebElement yourEmailField;





    ProjectPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickReviewButton() {
        buttonWriteReview.click();
    }

    public void writeToName(String name) {
        yourNameField.sendKeys(name);
    }

    public void writeToEmail(String email) {
        yourEmailField.sendKeys(email);
    }

}
