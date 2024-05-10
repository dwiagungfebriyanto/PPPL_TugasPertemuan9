import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirefoxTest {
    @Test
    public void test() {
        // Initiate webdriver object
        WebDriver driver = new FirefoxDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the web page
        driver.get("https://sv.ugm.ac.id");

        // Get web title
        String title = driver.getTitle();
        // Get current URL
        String url = driver.getCurrentUrl();

        assertAll(
                () -> assertEquals("Sekolah Vokasi UGM – Sekolah Vokasi UGM", title),
                () -> assertEquals("https://sv.ugm.ac.id/", url)
        );

        driver.quit();
    }
}
