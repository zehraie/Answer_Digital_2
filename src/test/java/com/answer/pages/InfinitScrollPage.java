package com.answer.pages;

import com.answer.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfinitScrollPage extends HomePage {

    @FindBy(xpath = "//h3")
    public WebElement infintScrollTitle;


    public static Boolean isTitleVisibleInViewport() {
        WebElement element = Driver.get().findElement(By.tagName("h3"));
        WebDriver driver = ((RemoteWebElement)element).getWrappedDriver();

        /**
         * I got method below from this web-page
         https://stackoverflow.com/questions/45243992/verification-of-element-in-viewport-in-selenium#:~:text=The%20best%20way%20to%20determine,a%20descendant%20if%20it%20is.

         The best way to determine if an element is visible in the viewport is to get the element at the supposed location
         with document.elementFromPoint. It returns null if it's not within the viewport and your element or a descendant if it is.
         */


        return (Boolean)((JavascriptExecutor)driver).executeScript(
                "var elem = arguments[0],                 " +
                        "  box = elem.getBoundingClientRect(),    " +
                        "  cx = box.left + box.width / 2,         " +
                        "  cy = box.top + box.height / 2,         " +
                        "  e = document.elementFromPoint(cx, cy); " +
                        "for (; e; e = e.parentElement) {         " +
                        "  if (e === elem)                        " +
                        "    return true;                         " +
                        "}                                        " +
                        "return false;                            "
                , element);
    }




}
