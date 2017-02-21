/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.Utilerias;

import com.mx.santander.lh.obpyme.Objetos.MarketingObjeto;

/**
 *
 * @author Z762602
 */
public class ObtenerDatosExcel {
    
    private MarketingObjeto objetoMarketing = new MarketingObjeto();
    
    public MarketingObjeto DatosMarketing(){
        objetoMarketing.setCasoPrueba("IDENTIFICAR SI BANCO SANTANDER SE ENCUENTRA EN EL TOP TEN DE BUSQUEDAS EN GOOGLE");
        objetoMarketing.setEmpresaMarketing("Santander");
        objetoMarketing.setPosicionamientoMarketingTopURL("Banco Santander");
        objetoMarketing.setTopNumber(1);
        
        return objetoMarketing;
        
    }
    
}
