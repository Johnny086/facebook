	package generic_Utility;
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	/**
	* @author PRASHANT
	*/
	public class D_ExcellUtility {
	/**
	* This method fetches String data from ExcelSheet
	* @param sheetName
	* @param rowNo
    * @param cellNo
	* @param i 
    * @return
    * @throws EncryptedDocumentException
	* @throws IOException
	*/
	public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
	throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("E:\\FrameWork October\\VTIGER!\\src\\test\\resources\\VtgerTestData.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
	/**
	* @Prashant sheetName
	* @param rowNo
	* @param cellNo
	* @return
	* @throws EncryptedDocumentException
	* @throws IOException
	*/
	public long fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
	throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("E:\\FrameWork October\\VTIGER!\\src\\test\\resources\\VtgerTestData.xlsx");
    return (long)WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();

	}
	/**
	* @param sheetName
	* @param rowNo
	* @param cellNo
	* @return
	* @throws EncryptedDocumentException
	* @throws IOException
	*/
	public boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
	throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("E:\\Automation Framework 2023\\Vtiger\\src\\test\\resources\\VtgerTestData.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	}
	
	public String featchDateDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
	throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("E:\\Automation Framework 2023\\Vtiger\\src\\test\\resources\\VtgerTestData.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue().toString().substring(0, 10);

	}

}

