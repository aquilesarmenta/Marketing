/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.Test;

import com.mx.santander.lh.obpyme.Operacion.OperacionesMarketingSantander;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Z762602
 */
public class MarketingSantander {
    
    public static void main(String[] args) throws InterruptedException{
        
        WebDriver browserDriver = new ChromeDriver();
        OperacionesMarketingSantander oMarketing = new OperacionesMarketingSantander();
        oMarketing.OperacionesCampaniaMArketing(browserDriver);
        
    }
    
}
