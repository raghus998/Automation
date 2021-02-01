package basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GK1
{
	
	    static WebDriver driver;
	    static String[] listOfTestSteps;
	    
	    static {
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	    }
	    public static void logOnToTFS(String userName, String password) throws InterruptedException {
	        String s = "https://"+userName+":"+password+"@gw-tfssvr.teamdevcentral.com/tfs/Greenway/PrimeSuite/_testManagement#planId=380870&suiteId=381572&_a=tests/";
	        driver.navigate().to(s);
	        Thread.sleep(8000);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath(".//*[@id='mi_58']/span")).click();
	        Actions action = new Actions(driver);
	        Thread.sleep(8000);
	        action.contextClick(driver.findElement(By.xpath("//div[@class='node-content']")));
	        action.build().perform();
	        driver.findElement(By.xpath("//*[.='Export']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[.='Print']")).click();
	        Thread.sleep(20000);
	        Set<String> window = driver.getWindowHandles();
	        System.out.println(window.size());
	        System.out.println(window);
	        Thread.sleep(3000);
	        int count=0;
	        for(String sent: window) {
	            
	            try{driver.switchTo().window(sent);
	            driver.switchTo().activeElement().findElement(By.xpath("//*[.='Save']")).click();
	            System.out.println("test"+count);
//	            Actions action1 = new Actions(driver);
//	            action1.sendKeys(Keys.ENTER);
//	            action1.build().perform();
//	            Pattern p = new Pattern("D:\\TFS\\save.png");
//	            Screen save= new Screen();
//	                save.click(p);
	            }
	            catch(Exception e) {count++;}
	        }
	        Thread.sleep(3000);
	        
	        
	    }
	    public static void getListOfTestSteps(String id) throws InterruptedException, InvalidFormatException, IOException {
	        FileInputStream file = new FileInputStream("C:\\Users\\gireeshk\\Downloads\\eclipse\\ExcelPro\\InputExcel.xlsx");
	        Workbook wb = WorkbookFactory.create(file);
	        Sheet sh = wb.getSheet("Accoun");
	        driver.findElement(By.xpath("//input[@title='Search work items']")).sendKeys(id);
	        driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
	        Thread.sleep(8000);
	        String list_id= driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']")).getAttribute("id");
	        System.out.println(list_id);
	        String[] main= null;
	        for(int i=0; i<29;i++) {
//	            System.out.println(driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']//*[@id='row_"+list_id+"_"+i+"']")).getText());
	            Row r= sh.createRow(i);
	            Cell c= r.createCell(0);
	            c.setCellValue(driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']//*[@id='row_"+list_id+"_"+i+"']")).getText());
	            String s1= driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']//*[@id='row_"+list_id+"_"+i+"']")).getText();
	            s1=s1.replaceFirst("[\r\n]+", "");
	            String[] t=s1.split("[\r\n]+");
	            
	            if(t.length>2) {
	            s1=s1.replaceFirst("[\r\n]+", "\r\n"+"Expected Result :- ");
	            }
	            else {
	                
	            }
	            System.out.println(s1);

	            main[i]=s1;
	        }
	        FileOutputStream fout = new FileOutputStream("C:\\Users\\gireeshk\\Downloads\\eclipse\\ExcelPro\\InputExcel.xlsx");
	        wb.write(fout);
	    }
	    public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
	        
	        String userName = "gkamasani";
	        String password = "apR$2018";
	        logOnToTFS(userName,password);
//	        getListOfTestSteps("376792");
	        
	        
	        
	    }

	}


