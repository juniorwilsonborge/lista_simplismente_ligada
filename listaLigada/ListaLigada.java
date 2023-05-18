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
public class ListaLigada {
    public static void main(String[] args) {
        lista contacto=new lista();
        contacto.adicionarNoFim("Junior");
        contacto.adicionarNoFim("wilson");
        contacto.adicionarNoFim("Guery");
        contacto.adicionarNoFim("Onilio");
        contacto.adicionarNoFim("willian");
        contacto.adicionarNoFim("Francisco");
        System.out.println("Listas de Alunos");
        
        
        contacto.adicionarNoFim("purfica");
        
        contacto.adicionar("bad"
                + ""
                + "jocu");
        System.out.println(contacto.listar());
         
        contacto.adicionarNoInterior(4, "Samuel");
         System.out.println(contacto.listar());
         
        System.out.println("Comprimento da lista: "+contacto.comprimentoLista());
   
        //contacto.removerNoInterior(4);
        //contacto.removerNoInterior(3);
        contacto.removerNoInterior(3);
    System.out.println(contacto.listar());     
    
        
    System.out.println(contacto.listar());
     contacto.removerNoInicio();
    System.out.println(contacto.listar());
    contacto.removerNoInicio();
    System.out.println(contacto.listar());
        //System.out.println(contacto.pesquisar("badjocu"));
    System.out.println("Comprimento da lista: "+contacto.comprimentoLista());
    
    System.out.println("Comprimento da lista: "+contacto.comprimentoLista());
    
}
  
}
