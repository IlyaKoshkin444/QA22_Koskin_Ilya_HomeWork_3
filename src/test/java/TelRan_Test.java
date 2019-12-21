import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TelRan_Test extends TestBase {

    @Test
    public void TelRanNavigateMenuTest() throws InterruptedException {
        openSite("https://www.tel-ran.com/");


        pause(5000);
        for(int i = 2;i<=7;i++) {
            String menuTitle = getMenuTitle(i);

            clickMenuTitle(i);
            pause(5000);
            String pageTitle = getPageTitle();

            Assert.assertEquals(pageTitle, menuTitle);
            System.out.println("menuTitle: " + menuTitle + "; pageTitle: " + pageTitle);
            backStep();
        }
    }

}
