package dock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestCase3a {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement VeriClick = driver.findElement(By.cssSelector("#imageFilterList > div:nth-child(2) > div.checkbox.store.styles__input___k3LJ2 > input[type=checkbox]"));
        VeriClick.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        boolean PublisherTag = driver.findElement(By.xpath("//*[@id='mainContainer']/div/div/div/div[2]/div[1]/div[1]/div[2]/div")).isDisplayed();
        System.out.println(PublisherTag);

        WebElement ArmClick = driver.findElement(By.xpath("//input[@value='arm']"));
        ArmClick.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        boolean ArmTag = driver.findElement(By.xpath("//*[@id='mainContainer']/div/div/div/div[2]/div[1]/div[1]/div[2]/div[1]")).isDisplayed();
        System.out.println(ArmTag);

        WebElement Arm64Click = driver.findElement(By.xpath("//input[@value='arm64']"));
        Arm64Click.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        boolean Arm64Tag = driver.findElement(By.xpath("//*[@id='mainContainer']/div/div/div/div[2]/div[1]/div[1]/div[2]/div[2]")).isDisplayed();
        System.out.println(Arm64Tag);

        driver.quit();

    }
}
