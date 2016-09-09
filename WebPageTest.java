/*

automation challenge 2 (Navigation Menu class):
Write a class that will allow me to navigate the main pages on the site.

Go to https://www.skiutah.com

If you click on Stories, it goes to the Stories page.

Remember to make a VerifyNavigation method that will accept a string value of the menu I want to navigate to and
not something that is static in your code.  This function should work regardless of how many items are in the main
navigation menu and what the labels are for each page.

Listed below is the sample code stub for running this test.

*/

public class WebPageTest {

    @Test
    private void TestLauncher()
    {
        // Verify PageTitle and Navigation
        VerifyPageTitle(URL, Expected_Value);
        VerifyNavigation(Menu_Name);
    }
}
