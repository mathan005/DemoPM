package demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_NewUserInvitationPage extends Annotations {

	public CM_NewUserInvitationPage() {

		PageFactory.initElements(driver, this);}
	@FindBy(how=How.ID, using="newUserTeam") 
	WebElement eleclickTeam;
	@FindBy(how=How.XPATH, using="//div[text()='Managers (Manager)']") 
	WebElement eleclickManagers;
	@FindBy(how=How.ID, using="newUserRole") 
	WebElement eleclickSecurityrole;
	@FindBy(how=How.XPATH, using="//div[text()='Full Managers (Manager)']") 
	WebElement eleclickFM;
	@FindBy(how=How.ID, using="newUserEmail") 
	WebElement eleEnterEmailid;
	@FindBy(how=How.XPATH, using="//button[text()='Send']") 
	WebElement eleclickSend; 
	
	

	public CM_NewUserInvitationPage selectRole() {
		click(eleclickSecurityrole);
		click(eleclickFM);
		return this;
	} 
	public CM_NewUserInvitationPage enterEmailid() {
		clearAndType(eleEnterEmailid, "c902103+hgf2@gmail.com");;
		return this;}

	public CM_UsersPage clickSend() {
		click(eleclickSend);
		return new CM_UsersPage();

	}

	public CM_NewUserInvitationPage selectTeam() {
		click(eleclickTeam);
		click(eleclickManagers);
		return this;
	} 
}
