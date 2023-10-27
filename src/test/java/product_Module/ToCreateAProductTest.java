package product_Module;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic_Utility.A_BaseClass;


public class ToCreateAProductTest extends A_BaseClass  {

 @Test
 public void toCreateAProductWithVendorInformation() throws EncryptedDocumentException, IOException {
 String vendorName=eUtils.fetchStringDataFromExcelSheet("Product",1,0);
 //String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEETNAME, 1, 0);
 String productName=eUtils.fetchStringDataFromExcelSheet("Product", 1,1);
 System.out.println(vendorName); 
 System.out.println(productName);
 System.out.println("xyd");
// Assert.fail();
// String salesStartDate=eUtils.featchDateDataFromExcelSheet("Product", 1, 2);
// String salesEndDate=eUtils.featchDateDataFromExcelSheet("Product",1,3);
// System.out.println(salesStartDate);
// System.out.println(salesEndDate);


 }
  
}
