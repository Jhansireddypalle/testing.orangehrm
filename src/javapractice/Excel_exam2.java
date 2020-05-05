package javapractice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class Excel_exam2 {

	
	public static void main(String[] args) throws Exception{
	

	FileInputStream fis = new FileInputStream("H:\\Selenium web drivers\\Read_write_11.xlsx");
	XSSFWorkbook workbook =  new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");

	 System.out.println(sheet.getSheetName());
	 System.out.println(sheet.getLastRowNum());  
	 System.out.println("Before updating Cell Data "+sheet.getRow(1).getCell(1));
	 // Write the data to excel file
	 XSSFCell cell =  sheet.getRow(1).getCell(1);   
	 cell.setCellValue("Test123"); 
	 fis.close(); 
	 FileOutputStream fileOut=new FileOutputStream("H:\\Selenium web drivers\\Read_write_11.xlsx");
	 workbook.write(fileOut);
	 System.out.println("Updated data after write is done " + cell.getStringCellValue());  
	 fileOut.close();     
}
}
