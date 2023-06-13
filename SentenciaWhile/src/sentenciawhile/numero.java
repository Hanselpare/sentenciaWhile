/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciawhile;

import java.util.Scanner;

/**
 *
 * @author hanpa
 */

//segunndo ejemplo
class numero {
    public void whi(){
Scanner entrada = new Scanner(System.in);
int numero = 0;

while (numero <= 0) {
  System.out.print("Introduce un número positivo: ");
  numero = entrada.nextInt();
}

System.out.println("El número introducido es: " + numero);
}
}    
