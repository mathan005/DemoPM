package demo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.testng.api.base.Annotations;

import demo.pages.CM_LoginPage;

public class TC002Logout extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName="TC_002 Logout";
		testcaseDec="Perform logout function";
		author="FM";
		category="Smoke";
		excelFileName="Logout_TC002";
		
	}
	
	@Test(dataProvider="fetchData")
	public void performLogout(String uname, String pwd) {
		new CM_LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLoginbutton()
		.verifyLogin()
		.clickLogout()
		.verifyLogout();
	
		
		
		
	}
	

}
