package br.edu.univas;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[5];
        for(int i = 0;i < lista.length;i++){
            System.out.println("Digite uma palavra: ");
            lista[i] = scanner.nextLine();
        }
        concatenaLista(lista);

    }
    public static void concatenaLista(String[] lista){
        String palavrasConcat= "";
        for(int i = 0;i < lista.length;i++){
            palavrasConcat+=lista[i];
        }
        System.out.println(palavrasConcat);
    }

}
