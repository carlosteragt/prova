package br.edu.univas;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        boolean resultado = comparaPalavras(frase,palavra);
        System.out.println(resultado);
    }
    public static Boolean comparaPalavras(String frase, String palavra){
        if(frase.contains(palavra)){
            return true;
        }
        else{
            return false;
        }
    }

}
