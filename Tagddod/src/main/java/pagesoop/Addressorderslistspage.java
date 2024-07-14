package pagesoop;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Addressorderslistspage {
WebDriver driver;

    public Addressorderslistspage(WebDriver driver){

    this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void main(String[] args) {

    }

    //WEBELEMENTS

    @FindBy(id="ap_email")
    WebElement siginemail;

    @FindBy(id="ap_password")
    WebElement pwd;

    @FindBy(id="signInSubmit")
    WebElement signinbtn;

    @FindBy(id="createAccountSubmit")
    WebElement createAccountSubmit;

    @FindBy(id="ap_email_login")
    WebElement loginemail;

    @FindBy(id="my-lists-tab")
    WebElement liststab;

    @FindBy(id="friends-tab")
    WebElement frienndstab;

    @FindBy(id = "al-intro-benefit-1")
    WebElement savetime ;

    @FindBy(id = "al-intro-benefit-2")
    WebElement greatgifts ;

    @FindBy(id = "al-intro-benefit-3")
    WebElement pricechanges ;

    @FindBy(id = "wishlist-page")
    WebElement wishlist ;


    public WebElement Signinorcreateaccount()
    {
        WebElement Todaydeal=driver.findElement(By.xpath("//div[@id=\"claim-collection-container\"]//h1[@text=\"\n" +
                "        Sign in or create account\"]"));
        return Todaydeal;

    }

    public WebElement yourorders()
    {
        WebElement yourorders=driver.findElement(By.xpath("//a[@id=\"nav_prefetch_yourorders\"]"));
        return yourorders;
    }
    public WebElement youraddresses()
    {
        WebElement youraddresses=driver.findElement(By.xpath("//a[@id=\"nav_prefetch_youraddresses\"]"));

        return youraddresses;
    }

    public WebElement yourlists()
    {
        WebElement yourlists=driver.findElement(By.xpath("//div[@id=\"nav-al-your-account\"]//a[@href=\"/-/en/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_top_flyout_wishlist\"]"));

        return yourlists;
    }




    public void checkemailforsign()throws InterruptedException{

        siginemail.isDisplayed();

    }

    public void checkpwdforsignin()throws InterruptedException{

        pwd.isDisplayed();

    }

    public void checksubmitbtn()throws InterruptedException{

        signinbtn.isDisplayed();

    }

    public void checkcreatenewamazonaccount()throws InterruptedException{

        createAccountSubmit.isDisplayed();

    }

    public void goback()throws InterruptedException{

        driver.navigate().back();

    }

    public void checkloginemail()throws InterruptedException{

        loginemail.isDisplayed();

    }

    public void checkliststabdisplayed()throws InterruptedException{

        liststab.isDisplayed();

    }

    public void checkfriendstabdisplayed()throws InterruptedException{

        frienndstab.isDisplayed();

    }

    public void checksavetime()throws InterruptedException
    {
     savetime.isDisplayed();
    }

    public void checkgivegreatgifts()throws InterruptedException
    {
        greatgifts.isDisplayed();

    }

    public void checkpriceschanges()throws InterruptedException
    {
        pricechanges.isDisplayed();

    }

    public void checkwishlistpage()throws InterruptedException
    {
        wishlist.isDisplayed();

    }



}




