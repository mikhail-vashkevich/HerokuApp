import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest extends BaseTest {
    @Test
    public void checkNotifications(){
        driver.get("http://the-internet.herokuapp.com/notification_message");
        WebElement link = driver.findElement(By.linkText("Click here"));
        link.click();
        WebElement notification = driver.findElement(By.id("flash"));
        String text = notification.getText();
        assertEquals(text,"Action successful\n" +
                "×");
    }
}
