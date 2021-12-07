/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author IFSC
 */
public class placavideo {
    String modelo;

    public placavideo (){
        modelo = "nvidia";
    }
    public placavideo (String modelo){
        this.modelo=modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
