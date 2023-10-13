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
public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("00345", "testA.uala", 3456, "pesos");
        Cuenta cuenta2 = new Cuenta("00543", "testB.uala", 3434, "dolares");
        Cuenta cuenta3 = new Cuenta("00775", "testC.uala", 3467, "pesos");
        
        
        BancoTradicional unBancoT = new BancoTradicional("Calle 7 N° 726 (B1900TFS) La Plata, Buenos Aires, Argentina", "La Plata", "bancoprovincia", 70, 5);
        unBancoT.agregarCuenta(cuenta1);
        unBancoT.agregarCuenta(cuenta2);
        unBancoT.depositarDinero("00345", 71000);
        //System.out.println(unBancoT.obtenerCuenta("00345"));
        System.out.println("BANCO TRADICIONAL "+ unBancoT.puedeRecibirTarjeta("00345"));
        
        
        
        BancoDigital unBancoD = new BancoDigital("www.bancoTest.com.ar","unlpbank",70,5);
        unBancoD.agregarCuenta(cuenta3);
        unBancoD.depositarDinero("00775", 101000);
        //System.out.println(unBancoD.obtenerCuenta("00775"));
        System.out.println("BANCO DIGITAL "+ unBancoD.puedeRecibirTarjeta("00775"));
        
        
        
        
    }
    
}
