package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ByProductPages {
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id ="password")
    WebElement password;

}
