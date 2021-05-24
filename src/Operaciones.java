/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jesus
 */
public class Operaciones {
    /**
    * se crea un parametro auxiliar resultado que guarda la suma de a y b
    * @param a numero entero
    * @param b numero entero
    * @return resultado si resultado es par y resultado+1 si resultado es impar
    */
    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
    }
    /**
    * 
    * @param a numero entero
    * @param b numero entero
    * @return a si a es mayor o igual que b o b si b es mayor que a
    */
    public int mayor(int a, int b) {
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }

   /**
    * se crea un parametro auxiliar sum que vale 0 donde se van sumando el valor de cada indice del array
    * @param numeros array
    * @return el parametro sum
    */
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[i];
        }
        return sum;
    }
    
}
