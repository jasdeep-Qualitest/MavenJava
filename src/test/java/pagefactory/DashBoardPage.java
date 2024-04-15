package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver  driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "[aria-label='COURSES']" )
	WebElement coursesTabLabel;
	
	
	public void verifyThatUserIsLoggedIn() {
		
		coursesTabLabel.isDisplayed();

	}
}
