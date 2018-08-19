/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int idade;
        int palpite;
        Scanner ler = new Scanner(System.in);
        Jogo jogo = new Jogo();
        
        System.out.println("Informe seu nome:");
        nome = ler.next();
        System.out.println("Informe sua idade:");
        idade = ler.nextInt();
        
        jogo.inicializar();
        jogo.jogador1.nome = nome;
        jogo.jogador1.idade = idade;
        
        System.out.print("O jogo possui 25 locais onde os navios podem estar escondidos");
        
        jogo.imprime();
        
        System.out.println("\nNavios restantes: " + jogo.contaAcertos());
        
        while(jogo.contaAcertos() > 0){
            System.out.println(nome + ", dê um palpite de 0 a 24:");
            palpite = ler.nextInt(); 
            while(palpite < 0 || palpite > 24){
               System.out.print(nome + ", dê um palpite de 0 a 24:");
               palpite = ler.nextInt(); 
            }
            jogo.jogador1.darPalpite(palpite);
            
            if(jogo.verificar() == true){
                jogo.imprime();
                System.out.println("\nVocê acertou!");
            }else{
                jogo.imprime();
                System.out.println("\nVocê errou!");
            }
            System.out.println("Navios restantes: " + jogo.contaAcertos());
        }
        
        jogo.imprime();
        
        System.out.println("\nParabéns " + nome + ". Você venceu!");
    }
    
}
