package pagesoop;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
WebDriver driver;

    public login(WebDriver driver){

    this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void main(String[] args) {

    }

    @FindBy(id="icp-save-button")
    WebElement save;

    @FindBy(id = "icp-language-translation-hint")
    WebElement submitpf ;

    @FindBy(id="icp-nav-flyout")
    WebElement changelang;

    @FindBy(id="nav-link-accountList")
    WebElement hellosignin;

    @FindBy(id="ap_email_login")
    WebElement Emailtxtbox;

    @FindBy(id="continue")
    WebElement continuebtn;

    @FindBy(id="intent-confirmation-container")
    WebElement Confrimationpopup;

    @FindBy(id="ap_customer_name")
    WebElement username;

    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id="ap_password_check")
    WebElement reenterpassword;


    public WebElement searchbox()
    {
        WebElement searchfield= driver.findElement(By.id("twotabsearchtextbox"));
        return searchfield;

    }
    public WebElement engl()
    {
        WebElement eng=driver.findElement(By.xpath("//div[@id=\"icp-language-settings\"]//span[@text=\"" +
                "\n" +
                "        English -\n" +
                "        \"]"));
        return eng;
    }

    public WebElement checkthatyoyarenewtoamazon(){

        WebElement newtoamazon= driver.findElement(By.xpath("//li[@id=\"intent-confirmation-container\"]//h1[@text=\"\n" +
                "      Let's create an account using your mobile number\n" +
                "    \"]"));
        return newtoamazon;

    }
    public WebElement proceedtocreateanaccount(){

        WebElement createanaccount= driver.findElement(By.xpath("//span[@id=\"intention-submit-button\"]//input[@type=\"submit\"]"));
        return createanaccount;

    }

    public WebElement checkletscreateaccount(){

        WebElement letscreateaccount= driver.findElement(By.xpath("//div[@id=\"intent-confirmation-container\"]//h1[@text=\"\n" +
                "        Looks like you're new to Amazon\n" +
                "      \"]"));
        return letscreateaccount;
    }

    public WebElement createaccount(){

        WebElement createaccount= driver.findElement(By.xpath("//form[@id=\"ap_register_form\"]//h1[@class=\"a-spacing-small moa_desktop_signup\"]"));
        return createaccount;
    }


    public void enteremail(String email){

        Emailtxtbox.sendKeys(email);
    }

    public void checkcreateaccountattributes(){

        username.isDisplayed();
        password.isDisplayed();
        reenterpassword.isDisplayed();
    }
    public void enterwebsite() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
        Thread.sleep(5000);
        Thread.sleep(5000);

    }

    public void checkthatyourmailnotregisterd(){

        Confrimationpopup.isDisplayed();
        checkletscreateaccount().isDisplayed();
        checkthatyoyarenewtoamazon().isDisplayed();


    }
    public void clickchangelanguage()throws InterruptedException{

        //AMAZON
        changelang.click();
        submitpf.click();
        save.click();
        Thread.sleep(5000);
        Thread.sleep(5000);

    }
    public void clickhellosignin()throws InterruptedException{

        hellosignin.click();

    }

    public void viewhellosignin()throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(hellosignin).perform();

    }
    public void eneteryouremail(String email)throws InterruptedException{

        enteremail(email);
    }

    public void presscontinue()throws InterruptedException{

        continuebtn.click();
    }


}




