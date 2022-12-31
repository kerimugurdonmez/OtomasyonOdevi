package Pages;

import Base.BasePage;
import Constants.PageElements;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginPage extends BasePage {

   // CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/userLoginInfo.csv"));

    public void userLogin() throws InterruptedException {
        clickElement(PageElements.USEREMAIL);
        Thread.sleep(500);
        sendKeys(PageElements.USEREMAIL, "kerimugurdonmez@gmail.com");
        Thread.sleep(500);
        clickElement(PageElements.USERPASS);
        Thread.sleep(500);
        sendKeys(PageElements.USERPASS, "7dCnYnhgsy.s3n8");
    }

    public void CSVReader() {
        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(("user.dir") + "/src/test/resources/userLoginInfo.csv");

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}