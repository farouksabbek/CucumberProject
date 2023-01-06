package stepDefinition;

import com.coinHouse.base.Base;
import com.coinHouse.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class LoginSteps extends Base {

    LoginPage loginPage = new LoginPage();

    @Given("I go to the app")
    public void openSite() {
        System.out.println("Test Start");
    }
    @When("I add text")
    public void addText() {
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("qsdqsdqsd");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
    }
    @When("click on search")
    public void clicKSearch() {
    //    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//*[@value='Recherche Google'  and @name='btnK'])[2]")).click();
    }
    @Then("results are displayed")
    public void resultsDisplayed() {

        driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
        driver.quit();

    }

    @When("I add text  {string} and {string}")
    public void iAddTextAnd(String arg0, String arg1) throws InterruptedException {
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(arg0);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(arg1);
        Thread.sleep(3000);

    }

    @When("I add {string} and {string}")
    public void iAddAnd(String email, String password) {
/*        driver.findElement(By.id("customer_email")).sendKeys(email);
        driver.findElement(By.id("customer_password")).sendKeys(password);*/
        loginPage.connectToTheApp(email,password);
    }

    @When("I add credentials")
    public void connectToTheAppWithProp(){
        loginPage.connectToTheAppWithProp();
    }
    @And("click on login")
    public void clickOnLogin() {
  /*      driver.findElement(By.id("email-login")).click();
        driver.findElement(By.id("v2_customers_two_factor_verify_otp_form_otp")).sendKeys("000000");
        driver.findElement(By.id("verify-otp")).click();*/
        loginPage.verifyAccount();
    }

    @Given("I open the site")
    public void iOpenTheSite() {
        driver.get("https://www.google.com/");
    }
}
