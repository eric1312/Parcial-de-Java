/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author ericc
 */
public abstract class Banco {
    private String nombre;
    private int cantidadDeEmpleados;
    private Cuenta [] cuentas;
    private int dl;
    private int df;

    public Banco(String nombre, int cantidadDeEmpleados, int Ncuentas) {
        this.nombre = nombre;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.cuentas = new Cuenta[Ncuentas];
        this.df=Ncuentas;
        this.dl=0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidadDeEmpleados() {
        return this.cantidadDeEmpleados;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }
    
    public int getDl() {
        return this.dl;
    }

    public int getDf() {
        return this.df;
    }
    public boolean addCuenta(Cuenta unaCuenta){  // la información de sus cuentas (maximo N cuentas)
        boolean cumple = false;
        if(this.dl < this.df){
            this.cuentas[dl]=unaCuenta;
            cumple = true;
            this.dl++;
        }
        return cumple;
    }
    
    // se declaran los metodos abstractos
    
    public abstract boolean agregarCuenta(Cuenta unaCuenta);
    
    public abstract String obtenerCuenta(String unCbu);
    
    public abstract boolean puedeRecibirTarjeta(String unCbu);
    
    public abstract void depositarDinero(String unCbu, double unMonto);
    
}
