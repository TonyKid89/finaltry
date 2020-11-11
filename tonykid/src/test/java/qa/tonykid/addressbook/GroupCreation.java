package qa.tonykid.addressbook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreation {
    WebDriver wd;

    @BeforeMethod
   public void setup() {
        wd = new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   }
@Test
        public void Test1() {
        wd.get("http://localhost/addressbook/group.php");



}

}
