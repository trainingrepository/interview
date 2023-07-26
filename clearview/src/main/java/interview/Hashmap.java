package interview;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hashmap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
	
		String path="D:\\selenium\\clearview\\data\\logincredentials.xlsx";
		
		FileInputStream fi= new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(rowcount).getLastCellNum();
		
		Map<String, String> login= new HashMap<String, String>(rowcount,cellcount);
		
		
		
		for (int i = 1; i <= rowcount; i++) {
		
			for (int j= 0; i <= cellcount; j++)
			{
		
				
			 String cellvalue=sheet.getRow(i).getCell(j).getStringCellValue();
			 login.put(, cellvalue)
			 
			 System.out.println(cellvalue);
			 for(Map.Entry entry: login.entrySet())
				{
					System.out.println(entry.getKey()+" " + entry.getValue());
				}
			 
			
			}
		}
		wb.close();
	}
}
			 
			/* login.put(key, value);
			 
		for(Map.Entry entry: login.entrySet())
		{
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
		}
			}
			
		}*/
	
		



