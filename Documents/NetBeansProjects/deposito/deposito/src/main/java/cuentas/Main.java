/**
 *La clase Main desde la cual se ejecuta todo. u
 * 
 * @author Iuliia Tuyev Tuyeva 
 * @version 2.1
 * @since 18/02/2022
 */

package cuentas;


import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        operativa_cuenta(1);
    }
/**
 * El método creado con el uso de refactor, no devuelve nada, lanza excepciones
 * @param cantidad tiene el parametro que hemos puesto gracias al uso de 
 * refactor
 */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        //Introducir el método operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
