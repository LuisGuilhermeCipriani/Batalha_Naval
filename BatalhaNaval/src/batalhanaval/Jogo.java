/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author Luis Guilherme
 */
public class Jogo {
    Jogador jogador1;
    Tabuleiro tab;
    
    //Método para inicializar o tabuleiro e marcar posições
    void inicializar(){
        jogador1 = new Jogador();
       tab = new Tabuleiro();
       tab.marcaPosicoes();
    }
    
    //Método para verificar se o palpite do jogador coincidiu com a posiçao do tabuleiro
    boolean verificar(){
        boolean retorno = false;
        int palpite = jogador1.palpite;
            if(tab.vet[palpite] == 1){
                tab.vet[palpite] = 2;
                retorno = true;
            }
        return retorno;
    }
    
    //Método para imprimir o tabuleiro
    void imprime(){
        String v[] = new String[25];
        for(int i = 0; i < tab.vet.length; i++){
            if(tab.vet[i] == 2){
                v[i] = "*";
            }else{
                v[i] = "0";
            }
            if(i % 5 == 0){
               System.out.print("\n"); 
            }
            System.out.print(v[i] + "\t"); 
        }
    }
    
    //Método para contar a quantidade de navios restantes
    int contaAcertos(){
        int cont = 0;
        for(int i = 0; i < tab.vet.length; i++){
            if(tab.vet[i] == 1){
                cont = cont + 1;
            }
        }
        return cont;
    }
}
