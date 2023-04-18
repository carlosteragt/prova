package br.edu.univas;

public class n7 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2},{3,4}};
        determinante(matriz);

    }
    public static void determinante(int[][] matriz){
        if(matriz.length == 2){
            int diagPri = matriz[0][0] * matriz[1][1];
            int diagSec = matriz[0][1] * matriz[1][0];
            System.out.println("Determinante = " + (diagPri - diagSec));
        }
        else{
            System.out.println("Não e uma matriz de ordem 2");
        }
    }
}
