package pagesoop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class cartpages {
WebDriver driver;

    public cartpages(WebDriver driver){

    this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void main(String[] args) {

    }

    //WEBELEMENTS
    @FindBy(id="nav-hamburger-menu")
    WebElement Alltabs;

    @FindBy(id="hmenu-content")
    WebElement anzl;

    @FindBy(id="a-autoid-0")
    WebElement quantity;

    @FindBy(id="quantity_1")
    WebElement quantityno;

    @FindBy(id="add-to-cart-button")
    WebElement addtocart;

    @FindBy(id="sc-subtotal-label-activecart")
    WebElement subtotalquantity;





    public WebElement Todaydeal()
    {
        WebElement Todaydeal=driver.findElement(By.xpath("//div[@id=\"hmenu-content\"]//a[@href=\"/-/en/gp/goldbox/?ref_=nav_em_navm_deals_0_1_1_24\"]"));
        return Todaydeal;
    }
    public WebElement programs()
    {
        WebElement Todaydeal=driver.findElement(By.xpath("//div[@id=\"hmenu-content\"]//ul[@class=\"hmenu hmenu-visible\"]"));

        return Todaydeal;
    }
    public WebElement Artsandcrafts()
    {
        WebElement arts=driver.findElement(By.xpath("//div[@class=\"SingleSelectInput-module__options_BX566mbDVnYGXyVzej99\"]//div[@data-csa-c-element-id=\"filter-departments-Arts & Crafts\"]"));

        return arts;
    }

    public WebElement firstorder()
    {
        WebElement firstorder=driver.findElement(By.xpath("//div[@id=\"dealsGridLinkAnchor\"]//a[@href=\"https://www.amazon.eg/A5-sketchbook-drawing-old-map/dp/B0BLLNFK2C?ref=dlx_deals_dg_dcl_B0BLLNFK2C_dt_sl14_5f\"]"));

        return firstorder;
    }
    public WebElement returntoartsandfacts()
    {
        WebElement toartsandfacts=driver.findElement(By.xpath("//div[@id=\"wayfinding-breadcrumbs_feature_div\"]//a[@text=\"\n" +
                "                Arts & Crafts\n" +
                "            \"]"));

        return toartsandfacts;
    }

    public WebElement secondorder()
    {
        WebElement secondorder=driver.findElement(By.xpath("//div[@id=\"anonCarousel2\"]//img[@alt=\"A5 sketchbook for drawing, starry night\"]"));

        return secondorder;
    }

    public WebElement gotobasket()
    {
        WebElement gotobasket=driver.findElement(By.xpath("//span[@id=\"sw-gtc\"]//a[@href=\"/-/en/cart?ref_=sw_gtc\"]"));

        return gotobasket;
    }

    //METHODS

    public void clickAlltabs(){

        Alltabs.click();
    }

    public void anzltht()
    {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    anzl.click();
    }

    public void choosequantity(){

        quantity.click();
    }

    public void choosequantitynumbertwo(){

        quantityno.click();
    }

    public void Addtocart(){

        addtocart.click();
    }

    public void waitfortenseconds() throws InterruptedException {

        Thread.sleep(5000);
        Thread.sleep(5000);
    }

    public void scrolltoitems() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
    }



    public void Assertnameiscorrect(){

        String expectedresults="A5 sketchbook for drawing, starry night";
        String actualresults=driver.findElement(By.xpath("//form[@id=\"activeCartViewForm\"]//span[@class=\"a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title\"]")).getText();
        Assert.assertEquals(actualresults,expectedresults);
        //Assert.assertTrue(actualresults.contains(expectedresults), "Expected text is not present in the page source!");
        //WebElement element = driver.findElement(By.xpath("//a[@href=\"/-/en/gp/product/B0BLLL6V18/ref=ox_sc_act_title_1?smid=A1ZVRGNO5AYLOV&psc=1\"]//span[@text=\"A5 sketchbook for drawing, starry night\"]"));
        //Assert.assertTrue(element.isDisplayed(), "The element is not displayed");
    }

    public void priceiscorrect(){

        String expectedresults="EGP 93.00";
        String actualresults=driver.findElement(By.xpath("//form[@id=\"activeCartViewForm\"]//div[@class=\"sc-item-price-block\"]")).getText();
        Assert.assertEquals(actualresults,expectedresults);
        //Assert.assertTrue(actualresults.contains(expectedresults), "Expected text is not present in the page source!");
        //WebElement element = driver.findElement(By.xpath("//a[@href=\"/-/en/gp/product/B0BLLL6V18/ref=ox_sc_act_title_1?smid=A1ZVRGNO5AYLOV&psc=1\"]//span[@text=\"A5 sketchbook for drawing, starry night\"]"));
        //Assert.assertTrue(element.isDisplayed(), "The element is not displayed");
    }

    public void subtotalquantity(){

        String expectedresults="Subtotal (2 items):";
        String actualresults=subtotalquantity.getText();
        Assert.assertEquals(actualresults,expectedresults);
        //Assert.assertTrue(actualresults.contains(expectedresults), "Expected text is not present in the page source!");
        //WebElement element = driver.findElement(By.xpath("//a[@href=\"/-/en/gp/product/B0BLLL6V18/ref=ox_sc_act_title_1?smid=A1ZVRGNO5AYLOV&psc=1\"]//span[@text=\"A5 sketchbook for drawing, starry night\"]"));
        //Assert.assertTrue(element.isDisplayed(), "The element is not displayed");
    }
    public void subtotalprice(){

        String expectedresults="EGP 186.00";
        String actualresults=driver.findElement(By.xpath("//span[@id=\"sc-subtotal-amount-activecart\"]//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap\"]")).getText();
        Assert.assertEquals(actualresults,expectedresults);
        //Assert.assertTrue(actualresults.contains(expectedresults), "Expected text is not present in the page source!");
        //WebElement element = driver.findElement(By.xpath("//a[@href=\"/-/en/gp/product/B0BLLL6V18/ref=ox_sc_act_title_1?smid=A1ZVRGNO5AYLOV&psc=1\"]//span[@text=\"A5 sketchbook for drawing, starry night\"]"));
        //Assert.assertTrue(element.isDisplayed(), "The element is not displayed");
    }
    public void Quantityorderd(){

        String expectedresults="2";
        String actualresults=driver.findElement(By.xpath("//span[@id=\"a-autoid-0-announce\"]//span[@class=\"a-dropdown-prompt\"]")).getText();
        Assert.assertEquals(actualresults,expectedresults);
        //Assert.assertTrue(actualresults.contains(expectedresults), "Expected text is not present in the page source!");
        //WebElement element = driver.findElement(By.xpath("//a[@href=\"/-/en/gp/product/B0BLLL6V18/ref=ox_sc_act_title_1?smid=A1ZVRGNO5AYLOV&psc=1\"]//span[@text=\"A5 sketchbook for drawing, starry night\"]"));
        //Assert.assertTrue(element.isDisplayed(), "The element is not displayed");
    }




}




