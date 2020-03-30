import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private WebDriver driver;
    private By imgLogin = By.className("V64Sp");
    public String login;
    private By loginInput = By.name("username");
    private By passInput = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public void setLogin(String login){
        driver.findElement(loginInput).sendKeys(login);
    }

    public void setPassword(){
        driver.findElement(passInput).sendKeys("111");
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();

    }
}