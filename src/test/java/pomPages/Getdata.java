package pomPages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getdata
{
	public static Object[][] getExceldata(String filepath) throws IOException
	{
		Object[][] data=null;
		 XSSFWorkbook wb=new XSSFWorkbook(filepath);
		  XSSFSheet ws=wb.getSheet("Sheet1");
		  int rows=ws.getPhysicalNumberOfRows();
		  
		  data=new Object[rows][2];
		  for(int i=0;i<rows;i++)
		  {
			  data[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
			  data[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
		  }
		return data;
	}
}


