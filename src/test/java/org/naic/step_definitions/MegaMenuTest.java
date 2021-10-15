package org.naic.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.naic.pages.MegaMenuPage;
import org.naic.utilities.ConfigurationReader;
import org.naic.utilities.Driver;
import org.openqa.selenium.WebElement;

public class MegaMenuTest {
    MegaMenuPage megaMenuPage = new MegaMenuPage();
    @Given("User go to the NAIC main page")
    public void user_go_to_the_NAIC_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User validate mega menu id is {string}")
    public void user_validate_mega_menu_id_is(String value) {
        megaMenuPage.menuBar.getAttribute("id").equals(value);
    }

    @When("User validate mega menu has seven links")
    public void user_validate_mega_menu_has_links() {
        Assert.assertEquals(7, megaMenuPage.megaMenuLinks.size());
    }

    @When("User validate those seven menu have {string} class")
    public void user_validate_those_menu_have_class(String value) {
        for (WebElement link : megaMenuPage.megaMenuLinks) {
            link.getAttribute("class").contains(value);
        }
    }

}
