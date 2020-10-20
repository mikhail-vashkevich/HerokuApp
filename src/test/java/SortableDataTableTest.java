import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTableTest extends BaseTest {
    @Test
    public void tableTest() {
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement tableData = driver.findElement(By.xpath("//table//tr[1]//td[1]"));
        assertEquals(tableData.getText(), "Smith");
        tableData = driver.findElement(By.xpath("//table//tr[2]//td[2]"));
        assertEquals(tableData.getText(), "Frank");
        tableData = driver.findElement(By.xpath("//table//tr[2]//td[3]"));
        assertEquals(tableData.getText(), "fbach@yahoo.com");
    }

}
