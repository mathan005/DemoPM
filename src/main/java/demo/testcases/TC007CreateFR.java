package demo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.testng.api.base.Annotations;

import demo.pages.CM_LoginPage;

	public class TC007CreateFR extends Annotations{
		@BeforeTest
		public void setData() {
			testcaseName="TC_007 Create a Fr ";
			testcaseDec="Create a new Fileroom";
			author="FM";
			category="Smoke";
			excelFileName="Logout_TC002";
		}
		
		@Test(dataProvider="fetchData")
		public void addNewUser(String uname, String pwd, String FRTitle) {
			new CM_LoginPage()
			.enterUsername(uname)
			.enterPassword(pwd)
			.clickLoginbutton()
			.launchProject()
			.clickDocumentstab()
			.clickNew()
			.clickFileroom()
			.enterFRTitle(FRTitle)
			.enterFRDes()
			.enableUdfs()
			.clickSave()
			.getTotalresults();
	}

}


