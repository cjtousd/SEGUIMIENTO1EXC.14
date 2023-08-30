/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto14;

import java.util.Scanner;
/*VD1: Ventas del departamento 1 
VD2: Ventas del departamento 2 
VD3: Ventas del departamento 3 
SALAR: Salario que reciben vendedores en cada departamento. 
TOTVEN: Total ventas en la empresa. 
PORVEN: Porcentaje equivalente al 33% de ventas totales. 
SALAR1: Salario de los vendedores en el depto. 1 
SALAR2: Salario de los vendedores en el depto. 2 
SALAR3: Salario de los vendedores en el depto. 3
*/
public class Punto14 {
    public static void main(String[] args) {
        double VD1, VD2, VD3, TOTVEN, PORVEN, SALAR,SALAR1,SALAR2,SALAR3; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese VD1:");
        VD1 = entrada.nextDouble();
        System.out.println("Ingrese VD2:");
        VD2 = entrada.nextDouble();
        System.out.println("Ingrese VD3:");
        VD3 = entrada.nextDouble();
        System.out.println("Ingrese SALAR:");
        SALAR = entrada.nextDouble();
        TOTVEN = (VD1+VD2+VD3);
        PORVEN = (0.33*TOTVEN);
        System.out.println(" TOTVEN = " + (VD1+VD2+VD3));
        System.out.println(" PORVEN = " + (0.33*TOTVEN));        
        
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }
    System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALAR1);
    System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALAR2);
    System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALAR3);
    }
}
