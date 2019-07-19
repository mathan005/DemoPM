package demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_UsersPage extends Annotations {

	public CM_UsersPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.XPATH, using="//*[text()='New']/preceding-sibling::img") 
	WebElement eleclickNewmenu;
	@FindBy(how=How.XPATH, using="//span[text()='Add User']") 
	WebElement eleclickAddUser;
	@FindBy(how=How.XPATH, using="//*[contains(text(),'Pending')]") 
	WebElement eleclickPending;
	@FindBy(how=How.XPATH, using="(//div[text()='c902103+hgf1@gmail.com'])[1]") 
	WebElement eleverifyemail;
	@FindBy(how=How.XPATH, using="(//div[text()='c902103+pac2@gmail.com'])[1]") 
	WebElement eleselectuser;
	@FindBy(how=How.XPATH, using="//span[text()='Deactivate']") 
	WebElement eleclickdeactivate;
	
	
	

	
	

	public CM_NewUserInvitationPage clickAddUserstab() {
		click(eleclickAddUser);
		return new CM_NewUserInvitationPage();
	}


	public CM_UsersPage clickNewmenu() {
		click(eleclickNewmenu);
		return this;
	}
	
	public CM_UsersPage clickPendinguser() {
		click(eleclickPending);
		return this;
	}
	
	public CM_UsersPage verifyCreatedUser() {
		String email= getElementText(eleverifyemail);
		if(email.equals("c902103+hgf1@gmail.com")) 
			System.out.println("New User invited");
			else System.out.println("Unable to create a new user");
		
		return this;
		
	}
	
	public CM_UsersPage rightclickUser() {
		rightClick(eleselectuser);
		return this;
	}
	
	public CM_UsersPage deactivateUser() {
		click(eleclickdeactivate);
		return this;
	}
	
	


}
