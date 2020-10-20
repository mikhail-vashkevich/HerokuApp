import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest {
    @Test
    public void dropDownCheck() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> dropDown = select.getOptions();
        assertEquals(dropDown.get(0).getText(), "Please select an option");
        assertEquals(dropDown.get(1).getText(), "Option 1");
        assertEquals(dropDown.get(2).getText(), "Option 2");
        select.selectByVisibleText("Option 1");
        assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
        select.selectByVisibleText("Option 2");
        assertEquals(select.getFirstSelectedOption().getText(), "Option 2");
        System.out.println(dropDown.size());
    }
}
