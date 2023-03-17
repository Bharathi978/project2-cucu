package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClasscucum {
	
	public static WebDriver driver;
	
	public static void browserlunch() {
		WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
	}
	
	public static void launchurl(String url) {
		driver.get(url);

	}
	
	
	public static void closetap() {
	driver.close();
	}


	public static void quit() {
	driver.quit();

	}
	
	public void refreshBase() {
		driver.navigate().refresh();
	}
	
	
	
	
	public static void currentpageurl() {
		String url =driver.getCurrentUrl();
      System.out.println(url);
	}
	public static void currentpagetitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void passtext(WebElement ele,String object) {
		ele.sendKeys(object);
	}
	
	public static void clickwebelement(WebElement btnelement) {
      btnelement.click();
	}
	
	public static void max() {
		driver.manage().window().maximize();

	}
	public static void getAttributetxt(WebElement a) {
		String attribute = a.getAttribute("value");
		System.out.println(attribute);
	}
	
	// screen shot
	public static  void getscreenshot(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File  img =ts.getScreenshotAs(OutputType.FILE);
		File desk =new File("C:\\Users\\Bharathi\\eclipse-workspace\\MavenSample\\target\\"+imgname+".png");
        FileUtils.copyFile(img, desk);
	}
	
	public static void mouseover(WebElement elementreff) {
		Actions actt = new Actions(driver);
		actt.moveToElement(elementreff).perform();

	}
	
	public static void rigthclick(WebElement reff) {
		Actions actt = new Actions(driver);
     actt.contextClick(reff).perform();  
     
	}
	
	public static void dropdown(WebElement source,WebElement target) {
		Actions actt = new Actions(driver);
     actt.dragAndDrop(source, target);
	}
	
	public static void doubleclick(WebElement text) {
		Actions actt = new Actions(driver);
		actt.doubleClick(text).perform();
		
	}
	
	public static void dragdrop(WebElement source,WebElement target) {
		Actions actt = new Actions(driver);
		actt.dragAndDrop(source, target);

	}
	
	public void wantAllCaptial(WebElement refname, String text) {
		Actions actt = new Actions(driver);
        actt.keyDown(refname,Keys.SHIFT).sendKeys(refname,text).keyUp(refname,Keys.SHIFT).perform();
	}
	
	
	
	
	
	
	
	//Alert
	public static void silmplealert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	
	public static void conformalertok() {
		Alert a = driver.switchTo().alert();
        a.accept(); 
	}
	
	public static void conformalertcancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void promptalertok(String text) {
		Alert a = driver.switchTo().alert();
        a.sendKeys(text);
        a.accept();
	}
	
	public static void promptalertcancel(String text) {
		Alert a = driver.switchTo().alert();
        a.sendKeys(text);
        a.dismiss();
	}
	
	
	
	//Robot
	
	public static void robotDown(int howmany) throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i <howmany; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
          r.keyPress(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);}
          
		
		public static void robotCopy() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		
					}
		
				public static void robotCut() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		
		}
		
	//frame	
		public static void frameintexclick(int index , WebElement reffname) {
			driver.switchTo().frame(index);
			reffname.click();
		}
		
		public static void frameSendkey(int index , WebElement reffname , String text) {
			driver.switchTo().frame(index);
			reffname.sendKeys(text);

		}
	
	public static void frameIdorname(String idorname, WebElement reffname) {
		driver.switchTo().frame(idorname);
        reffname.click();
	}
	// javascript
	
	public static void scrolldown(WebElement refname) {
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", refname);
		String text = refname.getText();
		System.out.println(text);
	}
	
	public static void Scrollup(WebElement refname) {
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", refname);
		String text = refname.getText();
		System.out.println(text);
	}
	
	// waits
	public static void excplit() {
		
     WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	}
	public static void implicity() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public static void stringvalue( String path, String name ) throws IOException {
		

		File f = new File(path);
  FileInputStream faast = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(faast);
		
		Sheet newsheet = w.getSheet(name);
		
	
		
		
		
	}
	
	public static void createNewRowCell( Sheet newsheet) {
		
		for (int i = 0; i < 30; i++) {
			Row newrow = newsheet.createRow(i);
			for (int j = 0; j < 30; j++) {
				Cell newcell = newrow.createCell(j);
			}
		}
	}	
	
	public static void getTxt(WebElement refname) {
		String text = refname.getText();
        System.out.println(text);
	}
	
	
	
	
	
	
public static void sendkeyvalueAndCell(Sheet refname,int rownumber ,int cellnumber,String value) {
		
		Row row = refname.getRow(rownumber);
		
		Cell cell = row.getCell(cellnumber);
		
		cell.setCellValue(value);
}
		
	
	
	
	public static String excelRead(String pathname, String sheetname, int rownumber, int cellnumber) throws IOException {
		
		File f = new File(pathname);
		
		FileInputStream first = new  FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(first);
		
		Sheet s = w.getSheet(sheetname);
		
		Row r = s.getRow(rownumber);
		Cell c = r.getCell(cellnumber);
		
		int cellType = c.getCellType();
		
		
		
		String value= "";
		if (cellType==1) {
			 value = c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
			 value = simple.format(d);
			
		}
		
		else {
			double d = c.getNumericCellValue();
			long i = (long)d;
			 value = String.valueOf(i);
		}
	
		return value;
		
			
	
	}
	
	
	
	
	public static void rowconspec(Sheet refname,int rownumber ,int cellnumber,String value) {
		
		Row row = refname.getRow(rownumber);
		
		Cell cell = row.getCell(cellnumber);
		
		cell.setCellValue(value);
		
		
	}
	
	
	public void UpdateGetRowAndCellValue( String pathname, String sheetname, int rownumber, int cellnumber, String eqlvalue,String newvalue) throws IOException {

                File f = new File(newvalue);
                FileInputStream fin = new FileInputStream(f);
                Workbook  w  = new XSSFWorkbook(fin); 
                         Sheet sheet = w.getSheet(sheetname);
                         Row row = sheet.getRow(rownumber);
                         Cell cell = row.getCell(cellnumber);
                         String value = cell.getStringCellValue();
                         if (value.equals(eqlvalue)) {
							cell.setCellValue(newvalue);
						}
                         
                         FileOutputStream fass = new FileOutputStream(f);
                         w.write(fass);

	
	}
	
	
	public static String dBDatas(String query , String query2) {
	
		String nameclmn = "";
		Connection con = null;
		
		try {
			// load the driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// connect to Database
			 con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe", "HR", "login");
			
			//write a Sql query
			String g = query;
			
			//prepare the statement
			PreparedStatement pr = con.prepareStatement(g);
			
			// execute query
			ResultSet ex = pr.executeQuery();
			
			for (int i = 0; i < g.length(); i++) {
				
					if (ex.next()) {
				 nameclmn = ex.getString(query2);
				//int int1 = ex.getInt("MANAGER_ID");
				//System.out.println(int1);
			
			}
				
			}
		
		}
		catch (ClassNotFoundException|SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
		
		try {
			con.close();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		

	
	}
		return nameclmn;
	
	
	}	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
	








		
	
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

