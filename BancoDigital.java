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
public class BancoDigital extends Banco {
    private String url;

    public BancoDigital(String url, String nombre, int cantidadDeEmpleados, int Ncuentas) {
        super(nombre, cantidadDeEmpleados, Ncuentas);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override  // comportamiento
    public boolean agregarCuenta(Cuenta unaCuenta) {
       return super.addCuenta(unaCuenta);
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

    @Override  // comportamiento
    public boolean puedeRecibirTarjeta(String unCbu) {
        int i=0;
        boolean encontre = true;
        boolean cumple = false;
        while((i < super.getDl()) && (encontre)){
            if(super.getCuentas()[i].getCbu().equals(unCbu)){
               if (super.getCuentas()[i].getMoneda().equals("pesos")){
                   if(super.getCuentas()[i].getMonto() > 100000){
                       cumple= true;
                       encontre=false;
                   }
               }
            }
            i++;
        }
        return cumple;
    }

    @Override  // comportamiento 
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
