package javapractice;

import java.io.FileInputStream;
import jxl.Workbook;
import jxl.Sheet;

public class Excel_Exzm {
public static void main(String[] args ) throws Exception  {
		FileInputStream file = new FileInputStream("‪H:\\Selenium web drivers\\Read_write.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("sheet1");
		String login_name = st.getCell(0, 1).getContents();
		String login_password = st.getCell(1, 1).getContents();
		System.out.println(login_name);
		System.out.println(login_password);
	}
}
