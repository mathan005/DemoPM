package demo.pages;

import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_SearchresultsPage extends Annotations { 
		
		public CM_SearchresultsPage() {
			PageFactory.initElements(driver, this);
		}

}
