package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends TestBase {

    HomePage homePage = new HomePage();
    WomenJacketPage womenJacketPage = new WomenJacketPage();


    // 1. verifyTheSortByProductNameFilter
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        // Click on Jackets
        homePage.clickOnJacket();
        // Select Sort By filter “Product Name”
        List<WebElement> list = womenJacketPage.getAllProductTitleOnPage();

        ArrayList originalList = new ArrayList();
        for (WebElement l : list) {
            originalList.add(l.getText());
        }
        Collections.sort(originalList);
        System.out.println(originalList);

        womenJacketPage.sortByFilter("Product Name");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = womenJacketPage.getAllProductTitleOnPage();
        for (WebElement l : list) {
            sortedList.add(l.getText());
        }
        System.out.println(sortedList);
        // Verify the products name display in alphabetical order
        Assert.assertEquals(originalList, sortedList);
    }
    // 2. verifyTheSortByPriceFilter
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //  Click on Jackets
        homePage.clickOnJacket();
        //  Select Sort By filter “Price”
        List<WebElement> list = womenJacketPage.getAllProductPriceOnPage();
        ArrayList originalPriceList = new ArrayList();
        for (WebElement l : list) {
            originalPriceList.add(l.getText());
        }
        Collections.sort(originalPriceList);
        System.out.println(originalPriceList);
        womenJacketPage.sortByFilter("Price");
        Thread.sleep(2000);
        ArrayList sortedPriceList = new ArrayList();
        list = womenJacketPage.getAllProductPriceOnPage();
        for (WebElement l : list) {
            sortedPriceList.add(l.getText());

        }
        System.out.println(sortedPriceList);
        Assert.assertEquals(originalPriceList,sortedPriceList);
    }

}
