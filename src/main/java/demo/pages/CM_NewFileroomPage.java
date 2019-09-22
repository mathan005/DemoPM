package demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CM_NewFileroomPage extends Annotations {
	
	public CM_NewFileroomPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="fileroomTitle")
	WebElement eleenterFRTitle;
	
	@FindBy(how = How.NAME, using="description")
	WebElement eleenterFRDescription;
	
	@FindBy(how = How.XPATH, using="(//div[@class='x-grid3-hd-checker'])[2]")
	WebElement eleclickudf;
	
	@FindBy(how = How.XPATH, using="(//button[@type='button'][text()='Save'])[3]")
	WebElement eleclicksave;
	
	@FindBy(how = How.XPATH, using="//*[text()='Results per page:']/following::div[3]")
	WebElement elegetTotalresults;
	
	@FindBy(how = How.XPATH, using="((//div[@class='x-grid3-cell-inner x-grid3-col-titlecolumn x-unselectable'])[\"+totalresults+\"])")
	WebElement elegetFRTitle;
	

	public CM_NewFileroomPage enterFRDes() {
		clearAndType(eleenterFRDescription, "Test");
		return this;}
	
	public CM_NewFileroomPage enableUdfs() {
		click(eleclickudf);
		return this;}
	
	public CM_NewFileroomPage clickSave() {
	click(eleclicksave);
		return this;}
	
	public CM_NewFileroomPage getTotalresults() {
		getTotalpageresults(elegetTotalresults);
		return this;}
	
}
