package co.uk.automation.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import co.uk.automation.Pages.BasePage;

public class BaseTest {

    @BeforeClass
    public static void testInitialize()
    {

    }

    @AfterTest
    public static void cleanDriver()
    {
        BasePage.closeBrowser();
    }
}
