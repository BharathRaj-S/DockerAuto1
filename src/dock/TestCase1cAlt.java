package dock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestCase1cAlt {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement ArmCheckBox = driver.findElement(By.xpath("//input[@value='arm']"));
        ArmCheckBox.click();
        if (ArmCheckBox.isSelected()){
            System.out.println("'ARM Checkbox' is present");
        }

        WebElement Arm64CheckBox = driver.findElement(By.xpath("//input[@value='arm64']"));
        Arm64CheckBox.click();
        if (Arm64CheckBox.isSelected()){
            System.out.println("'ARM 64 Checkbox' is present");
        }

        WebElement IBMPowerCheckBox = driver.findElement(By.xpath("//input[@value='ppc']"));
        IBMPowerCheckBox.click();
        if (IBMPowerCheckBox.isSelected()){
            System.out.println("'IBM Power Checkbox' is present");
        }

        driver.quit();
    }


}
