package dock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestCase4a {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hub.docker.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement VerfiedClick = driver.findElement(By.cssSelector("#imageFilterList > div:nth-child(2) > div.checkbox.store.styles__input___k3LJ2 > input[type=checkbox]"));
        VerfiedClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement ArmCheckClick = driver.findElement(By.xpath("//input[@value='arm']"));
        ArmCheckClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//div[@data-testid='currentFilters']//div//*[name()='svg']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean ArmUncheck = driver.findElement(By.xpath("//input[@value='arm']")).isSelected();
        System.out.println("is Arm Checkbox selected: "+ ArmUncheck);


    }
}
