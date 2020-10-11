import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import static org.testng.Assert.assertEquals;

public class AddRemoveElementTest extends BaseTest {
    @Test
    public void addRemoveElementTest(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addRem = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addRem.click();
        addRem.click();
        List<WebElement> delete = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int k = delete.size();
        assertEquals(k,2);
        System.out.println(k);
        delete.get(1).click();
        delete = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        k = delete.size();
        assertEquals(k,1);
        System.out.println(k);

    }

}
