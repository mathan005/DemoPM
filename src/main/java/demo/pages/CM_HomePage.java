package demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_HomePage extends Annotations {
	
	public CM_HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//*[text()='Documents']") 
	WebElement eleclickDoctab;
	@FindBy(how=How.XPATH, using="//span[text()='Users']") 
	WebElement eleclickUserstab;
	
	public CM_DocumentsPage clickDocumentstab() {
		click(eleclickDoctab);
		return new CM_DocumentsPage();
	}
	
	public CM_UsersPage clickUserstab() {
		click(eleclickUserstab);
		return new CM_UsersPage();
	}
	 
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
}
