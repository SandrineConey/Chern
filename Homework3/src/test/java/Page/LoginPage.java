package Page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;



public class LoginPage {
public LoginPage open(){
    Selenide.open("/");
    return this;
}

    private By inputLogin = By.xpath("//div[@class='it_w']//input[@name='st.email']");
    private By inputPassword = By.xpath("//div[@class='it_w']//input[@name='st.password']");
    private By button = By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']");
    private By invalideAutorization = By.xpath("//div[@class='form_i form_i__error']//div[@class='input-e login_error']");

}

