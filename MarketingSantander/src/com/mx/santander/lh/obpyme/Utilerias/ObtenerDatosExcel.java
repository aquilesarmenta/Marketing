/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.Utilerias;

import com.mx.santander.lh.obpyme.Objetos.MarketingObjeto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Z762602
 */
public class ObtenerDatosExcel {
    
    public MarketingObjeto RecuperarDatosExcel() throws FileNotFoundException, IOException{
        
        MarketingObjeto objetoMarketing = new MarketingObjeto();
        
        FileInputStream file = new FileInputStream("DataTestMarketing.xls");
        HSSFWorkbook workBook = new HSSFWorkbook(file);
        HSSFSheet sheet = workBook.getSheetAt(0);
        
        for(int i=1;i<= sheet.getLastRowNum(); i++){
            objetoMarketing.setCasoPrueba(sheet.getRow(i).getCell(0).toString());
            objetoMarketing.setEmpresaMarketing(sheet.getRow(i).getCell(1).toString());
            objetoMarketing.setPosicionamientoMarketingTopURL(sheet.getRow(i).getCell(2).toString());
            objetoMarketing.setTopNumber(Integer.parseInt(sheet.getRow(i).getCell(3).toString()));
        }
        
        return objetoMarketing;
        
    }
}   
    
    

