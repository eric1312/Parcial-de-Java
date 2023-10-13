
package parcial;


public class Cuenta {
       private String cbu;
       private String alias;
       private int dni;
       private String moneda;
       private double monto;

    public Cuenta(String cbu, String alias, int dni, String moneda) {
        this.cbu = cbu;
        this.alias = alias;
        this.dni = dni;
        this.moneda = moneda;
        this.monto = 0;
    }

    public String getCbu() {
        return this.cbu;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getDni() {
        return this.dni;
    }

    public String getMoneda() {
        return this.moneda;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto += monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cbu: " + this.getCbu() + ", alias: " + this.getAlias() + ", dni: " + this.getDni() + ", moneda: " + this.getMoneda() + ", monto: " + this.getMonto() + '}';
    }
    
    
    
    
}

