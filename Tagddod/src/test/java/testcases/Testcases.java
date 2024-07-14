package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesoop.Addressorderslistspage;
import pagesoop.login;
import pagesoop.cartpages;
public class Testcases {
    // lazem eb2a barah we b3d kda bdelo value zay line 21 fe awl method fl class
    WebDriver driver = null;
    //pages page = new pages();
    public static void main(String[] args) throws InterruptedException {
    }

    @BeforeTest
    public void open() throws InterruptedException {
        driver = new ChromeDriver();
        login page = new login(driver);
        page.enterwebsite();
        page.clickchangelanguage();
    }

    @AfterTest
    public void close() throws InterruptedException {
        driver = new ChromeDriver();
        driver.close();
        driver.quit();
    }

    @Test
    public void VerifythatItemsareaddedtocartcorrectly() throws InterruptedException {
        cartpages cart = new cartpages(driver);
        cart.clickAlltabs();
        cart.waitfortenseconds();
        cart.waitfortenseconds();
        cart.Todaydeal().click();
        cart.waitfortenseconds();
        cart.Artsandcrafts().click();
        cart.waitfortenseconds();
        cart.firstorder().click();
        cart.scrolltoitems();
        cart.waitfortenseconds();
        cart.secondorder().click();
        cart.choosequantity();
        cart.choosequantitynumbertwo();
        cart.Addtocart();
        cart.gotobasket().click();
        cart.waitfortenseconds();
        cart.Assertnameiscorrect();
        cart.priceiscorrect();
        cart.subtotalquantity();
        cart.subtotalprice();
        cart.Quantityorderd();

    }
    @Test
    public void loginwithvalidemailbutnotregisted() throws InterruptedException {
        login page = new login(driver);
        cartpages cart = new cartpages(driver);
        page.clickhellosignin();
        page.enteremail("karimshehata777@gmail.com");
        page.presscontinue();
        cart.waitfortenseconds();
        //this for img "tagdod1"
        //page.checkthatyoyarenewtoamazon();
        //page.proceedtocreateanaccount();

        //this for img "tagdod2"
        page.createaccount().isDisplayed();
        page.checkcreateaccountattributes();
    }
    @Test
    public void usercannotseeOrdersandAddressesbutcanseehislists() throws InterruptedException {
        login page = new login(driver);
        cartpages cart = new cartpages(driver);
        Addressorderslistspage attr=new Addressorderslistspage(driver);
        cart.waitfortenseconds();
        page.viewhellosignin();
        cart.waitfortenseconds();
        attr.yourorders().click();
        attr.checkemailforsign();
        attr.checkpwdforsignin();
        attr.checksubmitbtn();
        attr.checkcreatenewamazonaccount();
        attr.goback();
        cart.waitfortenseconds();
        page.viewhellosignin();
        cart.waitfortenseconds();
        attr.youraddresses().click();
        cart.waitfortenseconds();
        //attr.Signinorcreateaccount().isDisplayed();
        //attr.checkloginemail();
        attr.goback();
        cart.waitfortenseconds();
        page.viewhellosignin();
        cart.waitfortenseconds();
        attr.yourlists().click();
        cart.waitfortenseconds();
        attr.checkliststabdisplayed();
        attr.checkfriendstabdisplayed();
        attr.checksavetime();
        attr.checkpriceschanges();
        attr.checkgivegreatgifts();
        attr.checkwishlistpage();


    }


}


