package demo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class CM_LoginPage extends Annotations {
	
	public CM_LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(how=How.ID, using="loginUsername")  WebElement eleuname;
	@FindBy(how=How.ID, using="loginPassword")  WebElement elepwd;
	@FindBy(how=How.CLASS_NAME, using="loginSubmitButtons") WebElement eleclicklogin;
	
	public CM_LoginPage enterUsername(String uname) {
		eleuname.sendKeys(uname);
		return this;	}
	public CM_LoginPage enterPassword(String pwd) {
		elepwd.sendKeys(pwd);
		return this;}
	
	public CM_DashboardPage clickLoginbutton() {
		eleclicklogin.click();
		return new CM_DashboardPage();
	}
	
	public CM_LoginPage verifyLogout() {
		verifyExactText(eleclicklogin, "Login");
		return this;
	}

}
