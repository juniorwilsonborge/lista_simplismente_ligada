/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLigada;

/**
 *
 * @author helder veiga
 */
public class No {
    private No proximo;
    private String elemento;
    //contrutor

    public No(No proximo, String elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(String elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

   public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

   
    
    
}
