package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.AutomationExercisePage;

public class LoginTest extends baseTest {
    
    @Test
    public void login() {
        navigateTo(baseUrl);

        AutomationExercisePage automationExercisePage = new AutomationExercisePage(driver);

        Assert.assertTrue(automationExercisePage.verifyPage(),"Page is not available");

        automationExercisePage.goToLogin();

    }
}
