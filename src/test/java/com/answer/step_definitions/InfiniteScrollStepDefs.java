package com.answer.step_definitions;

import com.answer.pages.InfinitScrollPage;
import com.answer.utilities.BrowserUtils;
import com.answer.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class InfiniteScrollStepDefs {

    InfinitScrollPage infinitScrollPage = new InfinitScrollPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();



    @When("the user scroll to the bottom of the pape twice")
    public void the_user_scroll_to_the_bottom_of_the_pape_twice() {
        for (int i = 0; i < 2; i++) {    //two times will scroll down
            BrowserUtils.waitFor(1);      // to see very well put wait otherwise you do not need it
            jse.executeScript("window.scrollBy(0,500)");
            BrowserUtils.waitFor(1);
        }
    }

    @Then("the user shouldn't see the Infinite Scroll title")
    public void the_user_shouldn_t_see_the_Infinite_Scroll_title() {
        Assert.assertFalse(infinitScrollPage.isTitleVisibleInViewport());

    }

    @Then("the user scrolls back to top of the page")
    public void the_user_scrolls_back_to_top_of_the_page() {
        for (int i = 0; i < 2; i++) {    //it will scroll up
            BrowserUtils.waitFor(2);      // to see very well put wait otherwise you do not need it
            jse.executeScript("window.scrollBy(0,-500)");
        }

    }

    @Then("the user can see Infinite Scroll title")
    public void the_user_can_see_Infinite_Scroll_title() {
        Assert.assertTrue(infinitScrollPage.infintScrollTitle.isDisplayed());

    }

}
