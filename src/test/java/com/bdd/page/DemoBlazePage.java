package com.bdd.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com")
public class DemoBlazePage extends PageObject {

    @FindBy(xpath = "//a[.='Log in']")   //definiendo el xpath
    private WebElementFacade btnLogIn;

    @FindBy(xpath = "//a[.='Sign up']")
    private WebElementFacade btnSignUp;

    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElementFacade txtUser;

    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElementFacade txtLoginUserName;

    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElementFacade txtPassword;

    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElementFacade txtLoginPassword;

    @FindBy(xpath = "//button[.='Sign up']")
    private WebElementFacade btnModalSignUp;

    @FindBy(xpath = "//button[.='Log in']")
    private WebElementFacade btnModalLogIn;

    @FindBy(xpath = "//a[@id='nameofuser']")
    private WebElementFacade linkInfoUserLogueado;

    // Controles: Logout
    @FindBy(xpath = "//a[.='Log out']")
    private WebElementFacade linkLogOut;

    // Controles: Add to Cart
    @FindBy(xpath = "//a[.='Laptops']")
    private WebElementFacade linkCategoryLaptops;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    private WebElementFacade linkProductLaptop;

    @FindBy(xpath = "//a[.='Add to cart']")
    private WebElementFacade btnAddToCart;

    @FindBy(xpath = "//a[@id='cartur']")
    private WebElementFacade linkCart;

    @FindBy(xpath = "//h2[@class='name']")
    private WebElementFacade textTitleProduct;

    @FindBy(xpath = "//td[.='Sony vaio i5']")
    private WebElementFacade listProductAddToCart;

    public void clickEnLogIn() throws InterruptedException {
        btnLogIn.click();
    }

    public void clickBtnModalLogIn() throws InterruptedException {
        btnModalLogIn.click();
    }

    public void clickEnSignUp() throws InterruptedException {
        btnSignUp.click();
    }

    public void clickBtnModalSignUp() throws InterruptedException {
        btnModalSignUp.click();
    }

    public void clickBotonAlerta() throws InterruptedException {
       getDriver().switchTo().alert().accept();
    }

    public void setUserName(String userName) throws InterruptedException {
        txtUser.sendKeys(userName);
    }

    public void setPassword(String password) throws InterruptedException {
        txtPassword.sendKeys(password);
    }

    public void setLoginUserName(String userName) throws InterruptedException {
        txtLoginUserName.sendKeys(userName);
    }

    public void setLoginPassword(String password) throws InterruptedException {
        txtLoginPassword.sendKeys(password);
    }

    public String getUserLogueado() throws InterruptedException{
        linkInfoUserLogueado.waitUntilNotVisible();
        return linkInfoUserLogueado.getText();
    }

    // Logout
    public void clickEnLogOut() throws InterruptedException {
        linkLogOut.click();
    }

    public boolean existBtnLogIn() throws InterruptedException{
        return btnLogIn.isVisible();
    }

    // Add Product to Cart
    public void clickCategorylaptops() throws InterruptedException {
        linkCategoryLaptops.click();
    }

    public void clickProductLaptop() throws InterruptedException {
        linkProductLaptop.click();
    }

    public boolean existTitleProductoLaptop() throws InterruptedException{
        return textTitleProduct.isVisible();
    }

    public void clickProductAddToCart() throws InterruptedException {
        btnAddToCart.click();
        Thread.sleep(1000);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void clickLinkCart() throws InterruptedException {
        linkCart.click();
    }

    public boolean existProductLaptopInCart() throws InterruptedException{
        return listProductAddToCart.isVisible();
    }

}
