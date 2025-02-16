package com.mycompany.deposito;
import cuentas.*;
/**
 * Clase que representa deposito.
 * @author nemerpus
 */
public class Deposito {
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 500);
    }
// Método Operativa Cuenta
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        // Instacia objeto cuenta1
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
// Funcionamiento cuenta 
        try {
            cuenta1.retirar(2300);
            System.out.println("Se han retirado 2300 euros");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("Se han ingresado 695 euros");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
