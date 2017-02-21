/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.Validacion;

import com.mx.santander.lh.obpyme.WebElement.ElementPageMarketingSantander;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Z762602
 */
public class ValidacionMarketingSantander {
    
    private ElementPageMarketingSantander elementosPage = new ElementPageMarketingSantander();
    
    public boolean ValidaElementosMarketingSantander(WebDriver driver){
        try {
            elementosPage.ElementoTextInputBusqueda(driver).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
