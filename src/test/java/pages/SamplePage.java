package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * Page object model is my favorite way to access WebElements :)
 */

public class SamplePage {

    public SamplePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="sample-button")
    public WebElement sampleButton;

}
