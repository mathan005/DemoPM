package demo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.testng.api.base.Annotations;

import demo.pages.CM_LoginPage;

public class TC001Login extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_Login";
		testcaseDec = "Login validation";
		author = "Full Manager";
		category = "smoke";
		excelFileName = "Login_TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String uname, String pwd) {
		new CM_LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLoginbutton()
		.verifyLogin();		
	}

}
