package br.edu.univas;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();
        inverterPalavra(palavra);

    }
    public static void inverterPalavra(String palavra){
        String[] palavraTemp = palavra.split("");
        String palavraInvertida = "";
        for(int i = palavraTemp.length - 1; i >= 0;i--){
            palavraInvertida+= palavraTemp[i];
        }
        System.out.println(palavraInvertida);
    }
}
