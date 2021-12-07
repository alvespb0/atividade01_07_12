package computador;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class computador {
    public ram ram;
    public hd hd;
    public processador processador;
    public placavideo placavideo;
    
    public computador (){
        ram = new ram ();
        hd = new hd ();
        processador = new processador ();
        placavideo = new placavideo();
    }
    public computador (int qnt, int tamanho, int qntnucleo, String modelo){
    ram = new ram(qnt);
    hd = new hd (tamanho);
    processador = new processador (qntnucleo);
    placavideo = new placavideo (modelo);
    }
    void imprimecomputador (){
        System.out.println("quantidade de ram: "+ram.getQnt());
        System.out.println("tamanho do hd "+hd.getTamanho());
        System.out.println("numero de nucleos do processador: "+processador.getQntnucleo());
        System.out.println("modelo placa de video: "+placavideo.getModelo());
    }
    
}
