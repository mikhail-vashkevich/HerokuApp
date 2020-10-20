import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class TyposTest extends BaseTest {
    @Test
    public void typosCheck(){
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement typo = driver.findElement(By.xpath("//p[contains(text(),'Sometimes you')]"));
        assertEquals(typo.getText(), "Sometimes you'll see a typo, other times you won't.");
    }

}
