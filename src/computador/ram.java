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
public class ram {
    int qnt;
    public ram (){
        qnt = 8;
    }
    public ram (int qnt){
        this.qnt= qnt;
    }
    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
}
