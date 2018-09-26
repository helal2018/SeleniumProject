import org.openqa.selenium.By;
import pageobject.AccountPage;
import pageobject.AddressBook;

import java.io.IOException;

public class SubBase extends Base {


//    public String loginLinkXPath = "/html/body/nav/div[2]/div[1]/a[2]";
//    public String userNameFieldXpath = "//*[@id=\"input-username\"]";
//    public String passwordFieldXpath = "//*[@id=\"input-password\"]";
//    public String loginaButtonXPath = "//*[@id=\"btn-sign-in\"]";
//    public String profilelogoXPath = "//*[@id=\"header-profile-image\"]";
//    public String logoutLinkXPath = "//*[@id=\"reactjs-dashboard-generic\"]/div/div[1]/div[3]/div[4]/div[11]/a";

    public String testDataPath= "C:\\Users\\falga\\Dropbox\\Amazon\\Buncee\\src\\test\\TestData\\test_data.xlsx";
    //Test Data
    public String userName = readFromExcel(testDataPath, "Sheet1", "B2" );
    public String userPassword = readFromExcel(testDataPath, "Sheet1", "C2" );

//    public String emailAddress = "xyz@gmail.com";
//    public String firstName = "Helal";
//    public String lastName = "Algahaim";

    public String emailAddress = readFromExcel(testDataPath, "Sheet2", "A2");
    public String firstName = readFromExcel(testDataPath, "Sheet2", "B2");
    public String lastName = readFromExcel(testDataPath, "Sheet2", "C2");

    public SubBase()throws IOException{}
    public void loginToAccount() throws InterruptedException{

        clickByXpath(AccountPage.loginLinkXPath);

        sendTestByXpath(AccountPage.userNameFieldXpath, userName);


        sendTestByXpath(AccountPage.passwordFieldXpath, userPassword);


        clickByXpath(AccountPage.loginaButtonXPath);


//        driver.findElement(By.xpath("//*[@id=\"header-profile-image\"]")).click();
//        Thread.sleep(3000);
    }

    public void logoutToAccount() throws InterruptedException {

        clickByXpath(AccountPage.profilelogoXPath);

        clickByXpath(AccountPage.logoutLinkXPath);

    }

    public void addToAddressBook() throws InterruptedException{
        loginToAccount();
    clickByXpath(AddressBook.profilelogoXPath);
    clickByXpath(AddressBook.addressBookXPath);
    sendTestByXpath(AddressBook.emailAddressXPath, emailAddress);
    sendTestByXpath(AddressBook.firstNameXPath, firstName);
    sendTestByXpath(AddressBook.lastNameXPath, lastName);
    clickByXpath(AddressBook.addAddressBookXPath);


    }

}
