package demo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.testng.api.base.Annotations;

import demo.pages.CM_LoginPage;

public class TC004DeactivateUser extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName="TC004 DeactivateUser";
		testcaseDec="Deactivate an existing User";
		author="FM";
		category="Smoke";
		excelFileName="Logout_TC002";
	}
	@Test(dataProvider="fetchData")
	public void addNewUser(String uname, String pwd) {
		new CM_LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLoginbutton()
		.launchProject()
		.clickUserstab()
		.rightclickUser()
		.deactivateUser();
		
}

}
