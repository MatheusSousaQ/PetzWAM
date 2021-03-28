package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {

    private Base base;

    public Hooks (Base base){
        super(base.driver);
        this.base = base;
    }

    @Before
    public void setup(){
        System.setProperty("webdriver.driver.chrome", "drivers/chrome/89/chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDown(){
        base.driver.quit();
    }
}
