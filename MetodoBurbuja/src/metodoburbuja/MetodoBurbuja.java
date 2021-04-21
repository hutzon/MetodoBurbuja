package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [], nElementos, aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemntos a ingresar: "));
        
        arreglo=new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print(i+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }

        //metodo burbuja
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
            
        }
        
        System.out.print("Numeros ordenados en forma creciente: ");
        for (int i = 0; i < (nElementos); i++) {
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println(" ");
        
        System.out.print("Numeros ordenados en forma decreciente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" ");
        }

    }
    
}
