package dock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestCase1b {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean VerifiedPubButton = driver.findElement(By.xpath("//span[normalize-space()='Verified Publisher']")).isDisplayed();
        boolean OfficialImages = driver.findElement(By.xpath("//span[normalize-space()='Official Images']")).isDisplayed();

        System.out.println("Is 'Verified Publisher' present: " + VerifiedPubButton);
        System.out.println("Is 'Official Images' present: " + OfficialImages);

        driver.quit();
        }


    }

