package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sample {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	

public static void chromebrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	

}
public static void getcurrent() {
	driver.manage().window().maximize();

}
public static void currenttheurl(String url) {
	driver.get(url);
	

}

public static void getthetitle() {
	String title = driver.getTitle();
	System.out.println("Title: "+title);

}
public static String getcuureenturl() {
	String url = driver.getCurrentUrl(); 
return url;
}
public static void sendthevalue(WebElement k, String o) {
	k.sendKeys(o);

}
public static void passworddd(WebElement k, String d) {
	k.sendKeys(d);
	
}
public static void loginnn(WebElement t) {
	t.click();

}
public static void actionss(WebElement b) {
	a=new Actions(driver);
	a.moveToElement(b).perform();
	

}
public static void close() {
	driver.close();

}

public static void actionsss(WebElement s, WebElement t) {
	a=new Actions(driver);
	a.dragAndDrop(s, t).perform();

}
public static void downkeyyy() {
a=new Actions(driver);
	a.keyDown(Keys.SHIFT).perform();
	
	

}
public static void upkeyy() {
	a=new Actions(driver);
	a.keyUp(Keys.SHIFT).perform();

}
public static void presss() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);


}
public static void presssrel() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);


}
public static void pressreleases() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);



}
public static void pressrelease() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);


}
public static void ascreenshot(String filename) throws IOException {
	 TakesScreenshot tk=(TakesScreenshot)driver;
	 File src = tk.getScreenshotAs(OutputType.FILE);
	 File des=new File("\\Users\\Rajesh\\eclipse-workspace\\Maven1stClass\\Screenshot\\"+filename+".png");
	 FileUtils.copyFile(src, des);

}
public static void javasc(WebElement p,String press) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value','"+press+"')", p);

}
public static String windowhandl(int window) {
	Set<String> all = driver.getWindowHandles();
	List<String> l=new ArrayList();
	l.addAll(all);
	String childwindow = l.get(window);
	return childwindow;

}
public static void dropdown(WebElement element, int i) {
	
	Select s=new Select(element);
	s.selectByIndex(i);
	

}
public static void webtable(int k) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
WebElement table = alltable.get(k);
List<WebElement> allrow = table.findElements(By.tagName("tr"));
for (WebElement row : allrow) {
	String l = row.getText();
	System.out.println(l);
}


}
public static void webtables(int i, int k, int l) {
List<WebElement> alltable = driver.findElements(By.tagName("table"));
WebElement table = alltable.get(i);
List<WebElement> allrow = table.findElements(By.tagName("tr"));
WebElement row = allrow.get(k);
List<WebElement> alldata = row.findElements(By.tagName("td"));
WebElement data = alldata.get(l);
String m = data.getText();
System.out.println(m);

}
public static String read(String k, String sheet, int row, int cell) throws IOException {
	File f=new File(k);
	FileInputStream fin=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fin);
	String name="";
	Sheet sh = book.getSheet(sheet);
	Row r = sh.getRow(row);
Cell c = r.getCell(cell);
int type = c.getCellType();
if (type==1) {
	 name = c.getStringCellValue();
}
else if (DateUtil.isCellDateFormatted(c)) {
	Date d = c.getDateCellValue();
	SimpleDateFormat sim=new SimpleDateFormat("dd, MMMM, YYYY");
	 name = sim.format(d);
	System.out.println(name);
}
else {
	double d = c.getNumericCellValue();
	long l=(long)d;
	 name = String.valueOf(l);
	
	
	
}
return name;
}
public static void written(String k, String i, int n, int o, String w) throws IOException {
	File f=new File(k);
	Workbook book=new XSSFWorkbook();
	Sheet sh = book.createSheet(i);
Row r = sh.createRow(n);
Cell c = r.createCell(o);
c.setCellValue(w);
FileOutputStream fout=new FileOutputStream(f);
book.write(fout);





}

public static void adddata(String k, String i, int j, int l) throws IOException {
	File f=new File(k);
	FileInputStream fin=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(i);
	Row r = sh.createRow(j);
	Cell c = r.createCell(l);
	FileOutputStream fout=new FileOutputStream(f);
	book.write(fout);

}	
public static void changedata(String k, String sheet, int row, int cell, String value) throws IOException {
	File f=new File(k);
	FileInputStream fin=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(sheet);
	Row r = sh.getRow(row);
	Cell c = r.getCell(cell);
	c.setCellValue(value);
	FileOutputStream fout=new FileOutputStream(f);
	book.write(fout);

	
}

public static void thewait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

}
}

	
	
	


