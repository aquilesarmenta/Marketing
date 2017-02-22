/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.santander.lh.obpyme.Operacion;

import com.mx.santander.lh.obpyme.Utilerias.ObtenerDatosExcel;
import com.mx.santander.lh.obpyme.Validacion.ValidacionMarketingSantander;
import com.mx.santander.lh.obpyme.WebElement.ElementPageMarketingSantander;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Z762602
 */
public class OperacionesMarketingSantander {
    
    private final ValidacionMarketingSantander validacionesMArketing = new ValidacionMarketingSantander();
    private final ElementPageMarketingSantander elementos = new ElementPageMarketingSantander(); 
    private final ObtenerDatosExcel datos = new ObtenerDatosExcel();
    
    public void OperacionesCampaniaMArketing(WebDriver driver) throws InterruptedException, IOException{
        
        //OPERACIONES DE MANEJO DE BROWSER
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        
        //VALIDACION DE ELEMENTOS PARA INICIO DE PRUEBA
        Thread.sleep(3000);
        if(validacionesMArketing.ValidaElementosMarketingSantander(driver)){
            System.out.println("----- INICIA TEST AUTOMATIZADO -----");
            System.out.println("------------------------------------");
            System.out.println("Caso de prueba: " + datos.RecuperarDatosExcel().getCasoPrueba());
            System.out.println("");
            //REALIZA LA BUSQUEDA DE LA EMPRESA A LA QUE SE LE VA A REALIZAR EL MARKETING
            elementos.ElementoTextInputBusqueda(driver).sendKeys(datos.RecuperarDatosExcel().getEmpresaMarketing());
            elementos.ElementoTextInputBusqueda(driver).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            
            System.out.println("----- DATOS DE PRUEBA -----");
            System.out.println("---------------------------");
            System.out.println("EMPRESA: " +  datos.RecuperarDatosExcel().getEmpresaMarketing());
            System.out.println("ENLACE TOP 1: " + datos.RecuperarDatosExcel().getPosicionamientoMarketingTopURL());
            System.out.println("TOP NUMBER: " + datos.RecuperarDatosExcel().getTopNumber());
            System.out.println("");
            
            //VALIDA SI SE ENCONTRARON VALORES EN LA BUSQUEDA.
            if(validacionesMArketing.ValidaListaElementosResultados(driver)){
                List<WebElement> listaElementos = elementos.ListaURLBusqueda(driver);
                //RECORREMOS LA LISTA DE ELEMENTOS RECUPERADOS PARA IDENTIFICAR SI LA EMPRESA DE MARKETING SE ENCUENTRA EN LA POSICION INDICADA
                System.out.println("----- RESULTADO DEL TEST AUTOMATIZADO -----");
                System.out.println("-------------------------------------------");
               
                int contador = 0;
                for(WebElement elemento:listaElementos){
                    contador ++;
                    //LA EMPRESA SE ENCUENTRA EN EL TOP TEN
                    if(elemento.getText().equals(datos.RecuperarDatosExcel().getPosicionamientoMarketingTopURL()) && contador == datos.RecuperarDatosExcel().getTopNumber()){
                        System.out.println("LA EMPRESA SE ENCUENTRA EN EL TOP TEN DE BUSQUEDA EN GOOGLE");
                        driver.close();
                        break;
                    }
                    //LA EMPRESA NO SE ENCUENTRA EN EL TOP TEN.
                    if(contador == listaElementos.size()){
                        System.out.println("LA EMPRESA NO SE ENCUENTRA EN EL TOP TEN INICIAR CAMPAÑA DE MARKETING");
                        driver.close();
                    }   
                }
            }
        }else{
            //NO SE ENCONTRARON LOS ELEMENTOS NECESARIOS PARA COMENZAR CON LA PRUEBA
            System.out.println("LA BUSQUEDA EN GOOGLE NO SE ENCUENTRA DISPONIBLE POR EL MOMENTO");
        }
             
        
    }
    
}
