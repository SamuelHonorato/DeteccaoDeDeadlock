/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somavalores;

/**
 *
 * @author Abençoado por Deus
 */
public class SomaValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 10;
        int valor2 = 20;
        int res;
        res = Soma(valor1 , valor2);
        System.out.printf("O resultado da soma é: %d\n", res);
        int x = 0;
                
                
    }
    
    public static int Soma(int v1, int v2){
        return v1+v2;
    }
    
}
