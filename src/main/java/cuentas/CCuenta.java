package cuentas;

/**
 *
 * @author lisuadia
 */
public class CCuenta {

    /**
     * @return Devuelve valor de la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Se fija el valor a la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve valor de la variable cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Se fija el valor a la variable cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve valor de la variable saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Se fija el valor a la variable saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Devuelve el valor de la variable tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres Se fija el valor a la variable tipoInteres 
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * nombre: atributo de clase tipo String 
     */
    private String nombre;
    /**
     * cuenta: atributo de clase tipo String 
     */
    private String cuenta;
    /**
     * saldo: atributo de clase tipo double
     */
    private double saldo;
    /**
     * tipoInteres: atributo de clase tipo double 
     */
    private double tipoInteres;
    
    /**
     * Constructor basico sin parametros de entrada
     */
    public CCuenta(){
        
    }
    
    /**
     * 
     * @param nom Nombre
     * @param cue Nº Cuenta
     * @param sal Saldo
     * @param tipo Tipo de interés
     * 
     * Constructor con parametros de entrada
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * 
     * @return getSaldo  Devuelve el saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad Importe a ingresar
     * @throws Exception Si la cantidad es inferior a 0.
     * 
     * Metodo para realizar ingreso en la cuenta y el importe se suma
     * al saldo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad Importe a retirar
     * @throws Exception Si la cantidad es inferior o igual a 0 y/o menor al saldo.
     * 
     * Metodo para realizar una retirada de dinero en la cuenta, hay que tener
     * en cuenta que haya saldo disponible y que el dinero a retirar no lo supere.
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
