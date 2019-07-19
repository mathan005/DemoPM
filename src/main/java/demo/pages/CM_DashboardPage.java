package demo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_DashboardPage extends Annotations {
	
	public CM_DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//h1[contains(text(),'Dashboard')]") 
	WebElement eledbverify;
	
	@FindBy(how=How.XPATH, using="//button[text()='Dashboard']")
	WebElement eleclickdb;
	
	@FindBy(how=How.XPATH, using="//*[text()='Logout']")
	WebElement eleclicklogout;
	
	@FindBy(how=How.ID, using="launch_project_P18-001-5254")
	WebElement elelaunchproj;
	

	public CM_DashboardPage verifyLogin() {
		String dbname=getElementText(eledbverify);
		if (dbname.contains("Dashboard")){
			System.out.println("User is on the Dashboard page");
		}
		else System.out.println("User is not on the dashboard page");
		return this;	
	}
	
	public CM_LoginPage clickLogout() {
		click(eleclickdb);
		click(eleclicklogout);
	return new CM_LoginPage();
	}
	
	public CM_HomePage launchProject() {
		click(elelaunchproj);
		return new CM_HomePage();
		
	}
	
	
}
