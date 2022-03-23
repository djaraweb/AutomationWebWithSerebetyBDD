package com.bdd.stepdefinition;

import com.bdd.step.DemoBlazeStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoblazeStepDefinition {

    @Steps
    private DemoBlazeStep demoBlazeStep;

    @Dado("^Que Cargo la pagina de demoblaze.com$")
    public void cargar_la_pagina_de_demoblaze()  {
        demoBlazeStep.cargarPaginaDemoBlaze();
    }

    @Cuando("^presiono el boton sign up$")
    public void presiono_boton_sign_up() throws InterruptedException {
        demoBlazeStep.clickEnSignUp();
    }

    @Y("^ingreso el usuario \"([^\"]*)\"$")
    public void ingreso_el_usuario(String userName) throws Exception {
        demoBlazeStep.setUserName(userName);
    }

    @Y("^ingreso el password \"([^\"]*)\"$")
    public void ingreso_el_password(String pwd) throws Exception {
        demoBlazeStep.setPassword(pwd);
    }

    @Y("^ingreso el usuario de login \"([^\"]*)\"$")
    public void ingreso_el_usuario_de_login(String userName) throws Exception {
        demoBlazeStep.setLoginUserName(userName);
    }

    @Y("^ingreso el password de login \"([^\"]*)\"$")
    public void ingreso_el_password_de_login(String pwd) throws Exception {
        demoBlazeStep.setLoginPassword(pwd);
    }

    @Y("^Presiono el boton Sign Up$")
    public void presiono_el_boton_Sign_Up() throws Exception {
       demoBlazeStep.clickModalBtnSignUp();
    }

    @Y("^presiono el boton de la Alerta$")
    public void presiono_el_boton_de_la_alerta() throws Exception {
        demoBlazeStep.clickModalBtnSignUp();
    }

    // Login
    @Cuando("^presiono el boton log in$")
    public void presiono_boton_log_in() throws InterruptedException {
        demoBlazeStep.clickEnLogIn();
    }

    @Y("^Presiono el boton Log In$")
    public void presiono_el_boton_Log_In() throws Exception {
        demoBlazeStep.clickModalBtnLogIn();
    }

    @Entonces("^Valido que el usuario este logueado$")
    public void valido_que_el_usuario_este_logueado() throws InterruptedException {
        demoBlazeStep.validarUsuarioEstaLogueado();
    }

    // Logout
    @Y("^presiono el boton log out$")
    public void presiono_boton_log_out() throws InterruptedException {
        demoBlazeStep.clickEnLogOut();
    }

    @Entonces("^Valido que la session haya sido cerrada$")
    public void valido_que_la_session_haya_sido_cerrada() throws InterruptedException {
        demoBlazeStep.validarUsuarioCerroLaSession();
    }

    // Add Producto to Cart
    @Cuando("^presiono el link de categorias laptops$")
    public void presiono_el_link_de_categorias_laptops() throws InterruptedException {
        demoBlazeStep.clickCategoryLaptops();
    }

    @Y("^presiono el link del producto Sony vaio i5$")
    public void presiono_el_link_del_producto_Sony_vaio_i5() throws InterruptedException {
        demoBlazeStep.clickProductLaptop();
    }

    @Y("^presiono el boton add to cart del producto$")
    public void presiono_el_boton_add_to_cart_del_producto() throws InterruptedException {
        demoBlazeStep.clickProductAddToCart();
    }

    @Y("^presiono en link cart del menu$")
    public void presiono_en_link_cart_del_menu() throws InterruptedException {
        demoBlazeStep.clickLinkCart();
    }

    @Entonces("^valido que se muestre la pagina detalle del producto$")
    public void valido_que_se_muestre_la_pagina_detalle_del_producto() throws InterruptedException {
        demoBlazeStep.validarSeHaCargadoLaPaginaProducto();
    }

    @Entonces("^valido que el producto este agregado en el carrito$")
    public void valido_que_el_producto_este_agregado_en_el_carrito() throws InterruptedException {
        demoBlazeStep.validarSeHaCargadoElProductoAlCarrito();
    }

}