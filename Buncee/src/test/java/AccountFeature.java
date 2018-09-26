import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {
    public AccountFeature() throws IOException {
    }

    @Test(priority = 1, enabled = true)
    public void login() throws Exception {
        try {
            loginToAccount();
            //Assert.assertEquals("Dashboard", "Dashboard");
            //Assert.assertEquals(driver.getTitle(), "Dashboard");
            //Assert.assertEquals(driver.getCurrentUrl(), "https://app.edu.buncee.com/dashboard");
            //takeTheScreenshot("test");

        } catch (Exception e) {
            takeTheScreenshot(new Object().getClass().getEnclosingMethod().getName());

        } finally {

        }

    }

//@Test (priority = 2, enabled = false)
//    public void logout() throws InterruptedException {
//    loginToAccount();
//    logoutToAccount();
//}
//
//    @Test (priority = 3, enabled = false)
//    public void addAddress() throws InterruptedException {
//
//    addToAddressBook();
//    }
}


//
//@Test
//public void changeName() throws InterruptedException{
//
//}















