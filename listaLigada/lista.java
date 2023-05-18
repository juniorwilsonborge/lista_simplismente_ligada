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
public class lista{

    
    
//declaracao de variavel
    private No inicio;
    private No ultimo; 
    public int tamanho=0;

    public lista() {
    }
    
    
    
    //metudo que verifica se aposicao esta vazia ou nao
    public boolean verificaPosicaio(int posicao){
       return (posicao < 0 || posicao > this.tamanho);
            }
    //metudos vai adicionar no começo da lista 
    public void adicionar(String elemento){
        //instanciar um no 
        
        No nova=new No(elemento);
        if(this.tamanho == 0 ){
            //caso lista esta vazia 
            this.inicio=nova;
            this.ultimo=this.inicio;
        }else{
            //fazer associação ou link de nós 
            nova.setProximo(this.inicio);
            this.inicio=nova;//atribuir o inicio para o novo elemento
        }
        this.tamanho++;
    }
    
     //Metudo adicionar na cauda da lista
    public void adicionarNoFim(String elemento){
        //instanciar um nó
        No nova=new No(elemento);
        //caso lista esta vazia adicionar no inicio
        if(this.tamanho == 0){
            //chamar metudo adicionar no inicio
            adicionar(elemento);
        }else{
           this.ultimo.setProximo(nova);
           this.ultimo=nova;
           this.tamanho++;//incrimentar o tamanho da lista
        }
        
    }
    
    //metudo adicionar no interior da lista 
    public void adicionarNoInterior(int posicao, String elemento){
        No nova =new No(elemento);
        //se lista esta fazia 
        if(this.tamanho == 0 || posicao == 0){
            //chamar metudo adicionar no inicio
            adicionar(elemento);
        }else if(posicao==tamanho){
            //adicionar no fim 
            adicionarNoFim(elemento);
        }else{
            No atual=this.inicio;
            //percorer a lista toda
            for(int i=0; i< posicao - 1;i++){
                atual=atual.getProximo();
            }
            //fazer link de nós
            nova.setProximo(atual.getProximo());
            atual.setProximo(nova);
            tamanho++;
            
        }
        
    }





        //listar lista 
       public String listar(){
        if(tamanho==0){
            return "[]";
        }
         String lista="[";
         No atual=this.inicio;
        //percorres a lista toda
        for(int i=0 ; i<tamanho;i++){
            lista+=""+atual.getElemento()+",";
            
            atual=atual.getProximo();
        }
        lista+="]";
        return lista;
       }


        //tamanho da lista 
       public int comprimentoLista(){
           return tamanho;
       }

//remover tudo sem percorrer a lista 
       public void removerTudo(){
           this.inicio=null;
           this.ultimo=null;
           this.tamanho=0;
       }
       
  //percorer lista toda i apgar um por um
       public void apagarTudo(){
           No atual=this.inicio;
           while(atual != null){
               //No anterior=atual.getProximo();
               atual.setElemento(null);
               atual.setProximo(null);
               atual=atual.getProximo();
           }
           this.inicio=null;
           this.ultimo=null;
           this.tamanho=0;
       }

//remover no inicio da lista
       public void removerNoInicio(){
           if (tamanho == 0) {
               System.out.println("Lista esta vazia");
           }else{
               this.inicio=inicio.getProximo();
               tamanho--;
           }
       }
       
    //remover no fim da lista 
       public void removerNoFim(){
           if (tamanho == 1) {
               removerNoInicio();
           }else{
               No fim=this.inicio;
               //percorer a liosta 
               for (int i = 0; i < tamanho - 1; i++) {
                   fim=fim.getProximo();
               }
               fim.setProximo(null);
               fim.setElemento(null);
               this.ultimo=fim;
               tamanho--;
           }
           
       }
       //remover no interior da lista 
       public void removerNoInterior(int posicao){
           if(posicao == 0){
              removerNoInicio();
           }else if (posicao == tamanho) {
               removerNoFim();
           }else{
               No anterior = this.inicio;
               for (int i = 0; i < posicao - 1; i++) {
                   anterior=anterior.getProximo();
               }
               No atual=anterior.getProximo();
               No proximo=atual.getProximo();
               anterior.setProximo(proximo);
               atual.setElemento(null);
               //atual.setProximo(proximo);
               
               
               
               tamanho--;
           }
       }
//pegar elemento na lista 
       public String pega(int posicao){
           if(posicao == 0){
               return this.inicio.getElemento();
           }else if(posicao == this.tamanho){
               return this.ultimo.getElemento();
           }else if (posicao < 0) {
               System.out.println("Posição não existe");
           }
               No atual=this.inicio;
               for (int i = 0; i < posicao; i++) {
                   atual=atual.getProximo();
               }
               return atual.getElemento();
           
           
       } 

    //pesquisar elementos na lista 
       public boolean pesquisar(String elemento){
           
           if (tamanho == 0) {
               System.err.println("Lista vazia");
           }
           No atual = this.inicio;
           for (int i = 0; i < tamanho ; i++) {
               if(atual.getElemento().equals(elemento)){
                   return true;
               }
               atual=atual.getProximo();
           }
           return false;
           }
           
           
           
       

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
  
    }
    
    

