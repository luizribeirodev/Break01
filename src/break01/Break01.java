/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package break01;
import java.util.Scanner;
/**
 *
 * @author luiz
 */
public class Break01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 10, valores, soma = 0, interromper =999;
        
        do{
            System.out.println("Digite "+ entrada +" numeros para serem somados caso queira interromper digite "+ interromper + ".");
                valores = sc.nextInt();
                if(valores == interromper){
                        break;
                }
                soma = soma + valores;   
                entrada--;
                
        }while(entrada > 0);
        
        System.out.println("O valor somado foi: " + soma);
        
    }
    
}
//  Ideia da atividade criar um sistema que irar receber 10 numeros e somalos,
//  caso receba o numero 999 e contagem pararam e o resuktado sera mostrado.