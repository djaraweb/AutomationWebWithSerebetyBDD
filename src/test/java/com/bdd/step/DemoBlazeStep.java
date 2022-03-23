package com.bdd.step;

import com.bdd.page.DemoBlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class DemoBlazeStep extends ScenarioSteps {

    private DemoBlazePage demoBlazePage;

    @Step
    public void cargarPaginaDemoBlaze() {
        demoBlazePage.open();
        getDriver().manage().window().maximize();
    }

    // Create User
    @Step
    public void clickEnSignUp() throws InterruptedException {
        demoBlazePage.clickEnSignUp();
    }

    @Step
    public void clickModalBtnSignUp() throws InterruptedException {
        demoBlazePage.clickBtnModalSignUp();
    }

    @Step
    public void clickBotonAlerta() throws InterruptedException {
        demoBlazePage.clickBotonAlerta();
    }

    @Step
    public void setUserName(String userName) throws InterruptedException {
        demoBlazePage.setUserName(userName);
    }

    @Step
    public void setPassword(String pwd) throws InterruptedException {
        demoBlazePage.setPassword(pwd);
    }

    // Login
    @Step
    public void setLoginUserName(String userName) throws InterruptedException {
        demoBlazePage.setLoginUserName(userName);
    }

    @Step
    public void setLoginPassword(String pwd) throws InterruptedException {
        demoBlazePage.setLoginPassword(pwd);
    }

    @Step
    public void clickEnLogIn() throws InterruptedException {
        demoBlazePage.clickEnLogIn();
    }

    @Step
    public void clickModalBtnLogIn() throws InterruptedException {
        demoBlazePage.clickBtnModalLogIn();
    }

    @Step
    public void validarUsuarioEstaLogueado() throws InterruptedException {
        String sUserLogueado = demoBlazePage.getUserLogueado();
        Assert.assertEquals("Welcome netadmin1", sUserLogueado);
    }

    // Logout
    @Step
    public void clickEnLogOut() throws InterruptedException {
        demoBlazePage.clickEnLogOut();
    }

    @Step
    public void validarUsuarioCerroLaSession() throws InterruptedException {
        Assert.assertTrue(demoBlazePage.existBtnLogIn());
    }

    // Add to Cart
    @Step
    public void clickCategoryLaptops() throws InterruptedException {
        demoBlazePage.clickCategorylaptops();
    }

    @Step
    public void clickProductLaptop() throws InterruptedException {
        demoBlazePage.clickProductLaptop();
    }

    @Step
    public void clickProductAddToCart() throws InterruptedException {
        demoBlazePage.clickProductAddToCart();
    }

    @Step
    public void clickLinkCart() throws InterruptedException {
        demoBlazePage.clickLinkCart();
    }

    @Step
    public void validarSeHaCargadoLaPaginaProducto() throws InterruptedException {
        Assert.assertTrue(demoBlazePage.existTitleProductoLaptop());
    }

    @Step
    public void validarSeHaCargadoElProductoAlCarrito() throws InterruptedException {
        Assert.assertTrue(demoBlazePage.existProductLaptopInCart());
    }

}
