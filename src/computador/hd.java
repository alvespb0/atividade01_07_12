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
public class hd {
    int tamanho;

    public hd (){
        tamanho = 1000;
    }
    public hd (int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
