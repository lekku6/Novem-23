package org.testng;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.Fidelity;
import javax.sound.midi.Sequencer;
import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Actions a;

	// 1
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	// 2

	public static void lanunChrome(String Url) {
		driver.get(Url);
	}

	// 3
	public static void miniMax() {
		driver.manage().window().maximize();

	}

	// 4
	public static void printTitle() {
		String tit = driver.getCurrentUrl();
		System.out.println(tit);

	}

	// 5
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);

	}
	//browser close
	public static void bClose() {
		driver.close();
		
	}

	// 6
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	//getText
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	

	}
	//getAttribute
	public static void getAttribute(WebElement ele) {
		ele.getAttribute("value");
		

	}

	// 7Actions
	public static void moveToElement(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele);

	}

	// 8 Drag and Drop
	public static void dragDrop(WebElement eleSource, WebElement eleTarget) {
		a = new Actions(driver);
		a.dragAndDrop(eleSource, eleTarget);

	}

	// 9
	public static void keyKickDown(WebElement eleTarget, CharSequence key) {
		a = new Actions(driver);
		a.keyDown(eleTarget, key);
	}

	// 10
	public static void keyKickUp(WebElement eleTarget, CharSequence key) {
		a = new Actions(driver);
		a.keyDown(eleTarget, key);
	}

	// 11
	public static void aClick() {
		a = new Actions(driver);
		a.click().perform();

	}

	// 12
	public static void aSendkeys(WebElement eleTarget, CharSequence keys) {
		a = new Actions(driver);
		a.sendKeys(eleTarget, keys).perform();

	}

	// 13
	public static void dobleleftClick(WebElement eleTarget) {
		a = new Actions(driver);
		a.doubleClick(eleTarget).perform();

	}

	// 14
	public static void rightClick(WebElement eleTarget) {
		a = new Actions(driver);
		a.contextClick(eleTarget).perform();

	}

	// 15
	public static void alertOk() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	// 16
	public static void alertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	// 17
	public static void alertFill(String Sendkeys) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(Sendkeys);
	}

	// 18sreenShot
	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dec = new File("");
		FileUtils.copyFile(src, dec);

	}
	
	//Java Script pass Value
	public static void jsFill(String Sendkeys,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argumets[0].setAttribute('value", ele);
		

	}
	//jsClick
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("aruguments[0].click()", ele);
		

	}
	//jsScroolTop
	public static void jsScrollTop(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	//jsScroll Foot
	public static void javaScrolllFoot(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);


	}
	//Enter key Using Robot Class
	
	public void roboEnter() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	}
	//up using robot class
	public static void roboUp() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
	//Down USing Robo Class
	public static void roboDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	//copy using Robot Class
	public static void roboCopy() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	//past USing robo Class
	public static void roboPast() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);


	}
	//Tap Using robo Class
	public static void roboTap() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
	//Cut Using robot class
	public static void roboCut() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);


	}
	public static Select s;
	//Single DropDown
	public static void ddSingleValue(WebElement ele,String value) {
		 s=new Select(ele);
		s.selectByValue(value);

	}
	//Single DropDown Visible
	public static void ddSingleVisibleText(WebElement ele ,String value) {
		s=new Select(ele);
		s.selectByVisibleText(value);
	

	}
	//Single DropDown Intex
	public static void ddSingleIndex(WebElement ele,int index ) {
		s=new Select(ele);
		s.selectByIndex(index);

	}
	//isMultiple
	public static void multiple(WebElement ele) {
		s=new Select(ele);
		System.out.println(s.isMultiple());

	}
	//getOption Select Class
	public static void allOption(WebElement ele) {
		s=new Select(ele);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i <list.size(); i++) {
			WebElement eachOptin = list.get(i);
			String string = eachOptin.getText();
			System.out.println(string);
			
		}

	}
	//getAllSelectedOption
	public static void selectOption(WebElement ele) {
		s=new Select(ele);
		List<WebElement> selectOption = s.getAllSelectedOptions();
		for (int i = 0; i <selectOption.size(); i++) {
			WebElement eachOp = selectOption.get(i);
			String text = eachOp.getText();
			System.out.println(text);
			
		}

	}
	//getFirstSelected Option
	public static void firstOption(WebElement ele) {
		s=new Select(ele);
		WebElement firstSelectOP = s.getFirstSelectedOption();
		System.out.println("first Select Option="+firstSelectOP);

	}
	//Deselect By index posion
	public static void ddDeSelectIndex(WebElement ele,int index) {
		s=new Select(ele);
		s.deselectByIndex(index);

	}
	//Dselect By Value
	public static void ddDeselectValue(WebElement ele,String value) {
		s=new Select(ele);
		s.deselectByValue(value);
		

	}
	//Deselect By Visible Test
	public static void ddDeselectText(WebElement ele,String text) {
		s=new Select(ele);
		s.deselectByVisibleText(text);

	}
	//DeselectAll
	public static void ddDeselect(WebElement ele) {
		s=new Select(ele);
		s.deselectAll();

	}
	//switch To Frame Name
	public static void goFrameName(String id) {
		driver.switchTo().frame(id);

	}
	//swtich To Frame Name
	private void goFrameName(WebElement Name) {
		driver.switchTo().frame(Name);

	}
	//Switch To Fame  WebElement
	public static void goFrameWebEl(WebElement ele) {
		driver.switchTo().frame(ele);

	}
	//Switch To Frame Indexx Position
	public static void goFrameIndex(int Index) {
		driver.switchTo().frame(Index);

	}
	//Exit To Previous Frame
	public static void preFrame() {
		driver.switchTo().parentFrame();

	}
	//Exit Frame To Html
	public static void exitFrame() {
	driver.switchTo().defaultContent();

	}
	//ForWorld Page
	public static void forWord() {
		driver.navigate().forward();
		

	}
	//BackWard Page
	public static void backWord() {
		driver.navigate().back();

	}
	//Refresh your Page
	public static void reFresh() {
	driver.navigate().refresh();

	}

	
	

	// CREAT NEW SHEET.ROW.CELL
	public static void ceratExcel(int creRow, int creCell, String data) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\DataDriven\\exel\\DataDriven.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Datas");
		Row newRow = newSheet.createRow(creRow);
		Cell newCell = newRow.createCell(creCell);
		newCell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	// READ THE VALUE
	public static String readExcel(int getRow, int getCell) throws IOException {
		File f = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\DataDriven\\\\exel\\\\DataDriven.xlsx");
		FileInputStream fos = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fos);

		Sheet gRow = w.getSheet("Datas");
		Row row = gRow.getRow(getRow);
		Cell cell = row.getCell(getCell);
		int cellType = cell.getCellType();
		String value=" ";
		if(cellType==1) {
			value=cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyy");
			value=sdf.format(date);
			
		}
		else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			value=String.valueOf(l);
			
		}
		return value;
		}
	//CREAT NEW ROW,NEW CELL
	private void creatRomOnly(int creRow,int creCell,String data) throws IOException {
		File f = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\DataDriven\\\\exel\\\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Datas");
		Row newRow = s.createRow(creRow);
		Cell newCel = newRow.createCell(creCell);
		newCel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		System.out.println("write....");
		

	

	}
	//CREAT NEWCELL
	private void creatCellOnly(String sheetName,int rowIndex,int creCell,String data) throws IOException {
		File f = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\DataDriven\\\\exel\\\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet r = w.getSheet(sheetName);
		Row c = r.getRow(rowIndex);
		Cell newCel = c.createCell(creCell);
		newCel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);

		
	}
	//Update Data In Excel
	private void upDataDataInExcel(String sheetName,int rowIndex,int cellIndex,String getdata,String setdata) throws IOException {
	File f =new File("C:\\\\\\\\Users\\\\\\\\ELCOT\\\\\\\\eclipse-workspace\\\\\\\\DataDriven\\\\\\\\exel\\\\\\\\DataDriven.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet s = w.getSheet("Datas");
	Row r = s.getRow(rowIndex);
	Cell c = r.getCell(cellIndex);
	String dat = c.getStringCellValue();
	if (dat.equals(getdata)) {
		c.setCellValue(setdata);
		
		
	}
	FileOutputStream fos=new FileOutputStream(f);
	w.write(fos);
	
	

	}
	//fluentWait
	public static void fWait(By locator) {
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(10)).ignoring(Throwable.class);
		fw.until(ExpectedConditions.elementToBeClickable(locator));
			
			
	}

	}


