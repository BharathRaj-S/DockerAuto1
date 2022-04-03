package dock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestCase2a {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement VeriClick = driver.findElement(By.cssSelector("#imageFilterList > div:nth-child(2) > div.checkbox.store.styles__input___k3LJ2 > input[type=checkbox]"));
        VeriClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        boolean PublisherContTag = driver.findElement(By.xpath("//*[@id='mainContainer']/div/div/div/div[2]/div[1]/div[1]/div[2]/div")).isDisplayed();
        System.out.println(PublisherContTag);
    }
}
