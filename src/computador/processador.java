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
public class processador {
   int qntnucleo;

   public processador (){
       qntnucleo = 4;
   }
   public processador (int qntnucleo){
       this.qntnucleo=qntnucleo;
   }
   
    public int getQntnucleo() {
        return qntnucleo;
    }

    public void setQntnucleo(int qntnucleo) {
        this.qntnucleo = qntnucleo;
    }
   
}
