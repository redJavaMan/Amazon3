import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        WebElement todaysDealDetails = driver.findElement(By.xpath("//h2[contains(.,'Today’s Deals')]/following-sibling::a"));
        todaysDealDetails.click();
        WebElement oppo = driver.findElement(By.xpath("//div[text()='OPPO phones starting Rs. 9441 (Including Bank offers)']"));
        oppo.click();
        WebElement oppoA31 = driver.findElement(By.xpath("//a[contains(.,'OPPO A31 (Fantasy White, 6GB RAM, 128GB Storage) ')]"));
        oppoA31.click();
        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCart.click();
        Thread.sleep(5000);
        WebElement cart = driver.findElement(By.xpath("(//span[@id='attach-sidesheet-view-cart-button']/child::span/child::input)[1]"));
        cart.click();
        Select qty = new Select(driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")));
        qty.selectByIndex(3);
        WebElement qty3 = driver.findElement(By.xpath("//a[@id='quantity_3']"));
        qty3.click();
        driver.navigate().to("https://www.amazon.in/deal/0dce86e0?showVariations=true&ref=dlx_deals_gd_dcl_tlt_0_0dce86e0_dt_sl15_9f");
        WebElement oppoA54 = driver.findElement(By.xpath("//a[contains(.,'Oppo A54 (Starry Blue, 4GB RAM, 64GB Storage)')]"));
        oppoA54.click();
        WebElement addToCartA54 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCartA54.click();
        Thread.sleep(3000);
        WebElement cartA54 = driver.findElement(By.xpath("(//span[@id='attach-sidesheet-view-cart-button']/child::span/child::input)[1]"));
        cartA54.click();
        driver.quit();





    }
}
