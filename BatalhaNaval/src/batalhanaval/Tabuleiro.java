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
public class Tabuleiro {
    int vet[] = new int[25];
    
    //Método para marcar o tabuleiro em posiçoes aleatórias
    void marcaPosicoes(){
        int cont = 0;
        while(cont < 5){
            int i = (int)(Math.random()*24);
            vet[i] = 1;
            cont = cont +1;
        }
    }    
    
}

