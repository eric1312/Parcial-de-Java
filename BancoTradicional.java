/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;


public class BancoTradicional extends Banco {
    private String direccion;
    private String localidad;
    private int cantidadDeCuentasEnDolares;

    public BancoTradicional(String direccion, String localidad, String nombre, int cantidadDeEmpleados, int Ncuentas) {
        super(nombre, cantidadDeEmpleados, Ncuentas);
        this.direccion = direccion;
        this.localidad = localidad;
        this.cantidadDeCuentasEnDolares = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getCantidadDeCuentasEnDolares() {
        return cantidadDeCuentasEnDolares;
    }

    @Override // comportamiento
    public boolean agregarCuenta(Cuenta unaCuenta) {
        boolean cumple = false;
        if(this.cantidadDeCuentasEnDolares < 100){
            super.addCuenta(unaCuenta);
            cumple=true;
            this.cantidadDeCuentasEnDolares++;
        }
        return cumple;
    }

    @Override // comportamiento
    public String obtenerCuenta(String unCbu) {
        String aux = " ";
        int i=0;
        boolean encontre = true;
        while((i < super.getDl()) && (encontre)){
            if(super.getCuentas()[i].getCbu().equals(unCbu)){
                aux = super.getCuentas()[i].toString();
                encontre = false;
            }
            i++;
        }
        return aux;
    }

    @Override // comportamiento
    public boolean puedeRecibirTarjeta(String unCbu) {
        int i=0;
        boolean encontre = true;
        boolean cumple = false;
        while((i < super.getDl()) && (encontre)){
            if(super.getCuentas()[i].getCbu().equals(unCbu)){
               if (super.getCuentas()[i].getMoneda().equals("pesos")){
                   if(super.getCuentas()[i].getMonto() > 70000){
                       cumple= true;
                       encontre=false;
                   }
               }else{
                   if(super.getCuentas()[i].getMonto() > 500){
                       cumple= true;
                       encontre= false;
                   }
               }
            }
            i++;
        }
        return cumple;
    }

    @Override   // comportamiento
    public void depositarDinero(String unCbu, double unMonto) {
        int i=0;
        boolean encontre = true;
        while((i < super.getDl()) && (encontre)){
            if(super.getCuentas()[i].getCbu().equals(unCbu)){
                super.getCuentas()[i].setMonto(unMonto);
                encontre = false;
            }
            i++;
        }
    }  
}
