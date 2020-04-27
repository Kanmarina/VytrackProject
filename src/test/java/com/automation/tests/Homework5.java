package com.automation.tests;
import com.automation.pages.LoginPage;
import com.automation.pages.activities.CalendarEventsPage;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework5 extends AbstractTestBase {
    LoginPage loginPage = new LoginPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
     /*
    Test Case #1 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Hover on three dots “...” for “Testers meeting” calendar event
    5.Verify that “view”, “edit” and “delete” options are available
     */
     public WebDriver driver = Driver.getDriver();

 @Test
    public void test1(){
    test = report.createTest("Verify that “view”, “edit” and “delete” options");
     LoginPage loginPage = new LoginPage();
     loginPage.login();

     CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
     calendarEventsPage.navigateTo("Activities", "Calendar Events");
     calendarEventsPage.hoverOverTreeDots();

     Assert.assertTrue(calendarEventsPage.view.isDisplayed());
     Assert.assertTrue(calendarEventsPage.edit.isDisplayed());
     Assert.assertTrue(calendarEventsPage.delete.isDisplayed());

  test.pass("view, edit and delete verified");

 }


    /*
    Test Case #2 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Click on “Grid Options” button
    5.Deselect all options except “Title”
    6.Verify that “Title” column still displayed
     */
      @Test
    public void test2(){
          test = report.createTest("Verify that “Title” column still displayed");
          LoginPage loginPage = new LoginPage();
          loginPage.login();

          CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
          calendarEventsPage.navigateTo("Activities", "Calendar Events");

          calendarEventsPage.gridIcon.click();

}


}

