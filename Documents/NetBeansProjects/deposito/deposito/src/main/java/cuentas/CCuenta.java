/**
 *La clase cuenta. Contiene los atributos: nombre, cuenta, saldo y tipoInteres.
 * Sus getters y setters, los constructores y los métodos ingresar y retirar
 * @author Iuliia Tuyev Tuyeva 
 * @version 2
 * @since 18/02/2022
 */
package cuentas;

public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Método get creado por refactor
     * @return the nombre devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set creado por refactor
     * @param nombre actualiza el valor del nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get creado por refactor
     * @return the cuenta devuelve el valor de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método set creado por refactor
     * @param cuenta actualiza el valor de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get creado por refactor
     * @return the devuelve el valor de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método set creado por refactor
     * @param saldo actualiza el valor del saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés devuelve el valor de la tipo de Interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés  actualiza el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Constructor sin parametros
 */
    public CCuenta()
    {
    }
    /**
     * Constructor con parametros
     * @param nom corresponde a nombre
     * @param cue corresponde a cuenta
     * @param sal corresponde a saldo
     * @param tipo corresponde a tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Método que devuelve el saldo en double
 * @return devuelve el saldo
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Método para ingresar el saldo en la cuenta
 * @param cantidad recibe la cantidad
 * @throws Exception lanza excepción si la cantidad es un valor negativo
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método para retirar una cantidad de la cuenta
 * @param cantidad recibe la cantidad por parametro
 * @throws Exception lanza la excepción con mensaje si la cantidad es un número negativo
 * y otra si no hay suficiente saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
