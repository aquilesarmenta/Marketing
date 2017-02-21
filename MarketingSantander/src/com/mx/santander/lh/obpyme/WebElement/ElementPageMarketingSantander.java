/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.WebElement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Z762602
 */
public class ElementPageMarketingSantander {
    
    
    //Busca el Elemento TextInput de Busqueda de Google.
    public WebElement ElementoTextInputBusqueda(WebDriver driver){
        WebElement elementTextInputBusqueda = driver.findElement(By.name("q"));
        return elementTextInputBusqueda;
    }
    
    //Busca la lista de URL que mostro la Busqueda de Google.
    
    public List<WebElement> ListaURLBusqueda(WebDriver driver){
        List<WebElement> listaURL = driver.findElements(By.className("r"));
        return listaURL;
    }
    
    
    
}
