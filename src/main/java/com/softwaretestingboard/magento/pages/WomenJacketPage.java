package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketPage extends Utility {

    By jacketNameList = By.xpath("//strong[@class='product name product-item-name']//a");
    By sortBySelectProductName = By.xpath("(//select[@id='sorter'])[1]");
    By allProductTitle = By.xpath("//strong[@class = 'product name product-item-name']");
    By sortByFilterPath = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By allProductPrice = By.xpath("//span[@class = 'normal-price']//span[@class = 'price']");

    public void sortedByFilterProductName() {
        selectByVisibleTextFromDropDown(sortBySelectProductName,"Product Name");
    }
   public String getAllJacketNamList(){
        return getTextFromElement(jacketNameList);
   }
    public List<WebElement> getAllProductTitleOnPage () {
        List<WebElement> products = driver.findElements(allProductTitle);
        return products;
    }
    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilterPath, sortByOption);
    }
    public List<WebElement> getAllProductPriceOnPage () {
        List<WebElement> products = driver.findElements(allProductPrice);
        return products;
    }

}