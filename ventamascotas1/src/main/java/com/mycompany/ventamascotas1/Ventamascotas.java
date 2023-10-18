/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ventamascotas;

import java.util.Scanner;

public class Ventamascotas {
    static int clave = 1;
    static String nombre = "jaula";
    static int precio = 100;
    static int existencia = 5;
    
    //más productos
    static int clave1 = 2;
    static String nombre1 = "coquetas";
    static int precio1 = 1350;
    static int existencia1 = 10;
    

    public static void main(String[] args) {
        char respCompra = 's';
        int cuantos1 = 0;
        int claveComprar;
        int totalFactura = 0;
        int totalProducto1 = 0;
        int totalCuantos1 = 0;
        int finalProducto1 = 0;
        
        
 
       

        Scanner entrada = new Scanner(System.in);
        
        
        do {
            
            
            System.out.printf("%5s %15s %15s %13s", "ID", "PRODUCTO", "EXISTENCIA", "PRECIO");
            System.out.println();
            System.out.printf("%5s %15s %15s %13s", clave, nombre, existencia, precio);
            System.out.println();
            System.out.printf("%5s %15s %15s %13s", clave1, nombre1, existencia1, precio1);
            System.out.println();
            System.out.print("Teclea la clave del producto: ");
            claveComprar = entrada.nextInt();
           
            
            if (claveComprar ==1){
            System.out.println("Cantidad de productos seleccionados");
            cuantos1 = entrada.nextInt();
            totalProducto1 = cuantos1+totalCuantos1;  
            totalCuantos1 = cuantos1 + totalCuantos1;
            finalProducto1 = precio * cuantos1;
            totalFactura = totalFactura + finalProducto1;
           
           
            
            
            
            
            
        }
            System.out.print("Desea comprar más? (s/n): ");
            respCompra = entrada.next().charAt(0);
        } while (respCompra == 's' || respCompra == 'S');

        System.out.println("Su compra ha concluido, se emitirá factura");
        System.out.println("\n\nCarrito de compras\n\n");
        System.out.printf("%5s %15s %15s %13s%n", "ID", "PRODUCTO", "CANTIDAD", "TOTAL");
        
        if (cuantos1 != 0) {
            System.out.printf("%5s %15s %15s %13s%n", clave, nombre, totalCuantos1, totalFactura);
        }
        
        System.out.println("\nTOTAL DE SU COMPRA: " + totalFactura);
    }
}
