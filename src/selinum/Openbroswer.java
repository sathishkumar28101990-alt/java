package selinum;

import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.standard.Chromaticity;

public class Openbroswer {

    public static void main(String[] args)
    {
        // chrome launchW
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
       // driver.manage().window().minimize();
        String title = driver.getTitle();
        System.out.println("title of webpage:"+title);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currenturl:"+currentUrl);
        driver.get("https://parabank.parasoft.com/");
        driver.close();


    }
}
