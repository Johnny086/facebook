package leads_Module;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_Utility.A_BaseClass;
import generic_Utility.IPathConstant;
import pom_Repository.B_HomePage;
import pom_Repository.C_LeadPage;
import pom_Repository.D_CreatingNewLeadPage;
import pom_Repository.E_LeadInforamationPage;


    @Listeners(generic_Utility.ListnersImplementationClass.class)
	public class ToCreatLeadTest extends A_BaseClass {
			
	@Test (retryAnalyzer=generic_Utility.RetryImpementationClass.class)
	public void toCreateALeadAndToVerifyTheLeadInformation() throws EncryptedDocumentException, IOException {
	
	//Test Data
	String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 0);
	String leadFirstName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 1);
	String leadLastName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 2);
	String leadCompanyName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 3);
	String leadIndustry = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 4);
	
	//Assert.fail(); // It is only used for ScreenShot purpose 
	//Page Object
	B_HomePage home = new B_HomePage(driver);
	C_LeadPage lead = new C_LeadPage(driver);
	D_CreatingNewLeadPage creatLead = new D_CreatingNewLeadPage(driver);
	E_LeadInforamationPage leadInfo = new E_LeadInforamationPage(driver);
				
	// Script
	// Clicking on the lead module
    //Assert.fail();// Here We Use Assert to take Screen shot
	home.clickOnLeadModule();			
	// Clicking on the lead plus button
	lead.clickOnLeadButton();		
	// Creating a Lead
	creatLead.leadNameSalutatioknDropdown(leadSalutation);
	creatLead.enterFirstName(leadFirstName);
	creatLead.enterLastName(leadLastName);
	creatLead.enterCompanyName(leadCompanyName);
	creatLead.passLeadIndustryInIndustryDropdown(leadIndustry);
	creatLead.clickOnSaveButton();
				
	//Fetching the lead info
	String actualLeadLastName = leadInfo.verifyLeadInformation(leadLastName);
				
	//Verification
	Assert.assertTrue(actualLeadLastName.contains(leadLastName));
	System.out.println("The Lead information has been verified");
				
	}
	
    /**@Test
	public void demo1() {
		System.out.println("Demo1 method is running");
		Assert.fail();
	}
	@Test 
	public void demo2() {
		System.out.println("Demo2 method is running");
		Assert.fail();
	}
	@Test
	public void demo3() {
		System.out.println("Demo3 method is running");
		Assert.fail();
	}*/
	
	
}


