package com.answer.step_definitions;

import com.answer.pages.HomePage;
import com.answer.pages.KeyPressPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class KeyPressStepDefs {
    HomePage homePage = new HomePage();
    KeyPressPage keyPressPage = new KeyPressPage();


    @When("the user clicks on any {string}")
    public void the_user_clicks_on_any(String key) throws InterruptedException {
        keyPressPage.keyInputBox.sendKeys(key);
        Thread.sleep(5000);// I put this wait to see what we send,normally we do not need it
    }

    @Then("the user can see the {string} text on web page")
    public void the_user_can_see_the_text_on_web_page(String expectedKey) {
        String[] splited = keyPressPage.textElement.getText().split(":");
        String actualKey = splited[1].trim();
        System.out.println(actualKey);
        Assert.assertTrue(expectedKey.equalsIgnoreCase(actualKey));
    }


}
