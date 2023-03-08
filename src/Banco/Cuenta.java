package Banco;

import java.text.DecimalFormat;

public class Cuenta {
    protected final DecimalFormat moneda = new DecimalFormat("$#,###.##");
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    boolean mensaje;
    public boolean depositar(double cantidad){
        if(cantidad > 0){
            mensaje = true;
            System.out.println(mensaje);
            System.out.println("Su saldo anterior era: " + moneda.format(this.getSaldo()) + ".");
            this.setSaldo(this.getSaldo() + cantidad);
            System.out.println("Deposito de: " + moneda.format(cantidad) + ".");
            System.out.println("Su nuevo saldo es: " + moneda.format(this.getSaldo()) + ".\n");
        } else
        if(cantidad <= 0){
            mensaje = false;
            System.out.println(mensaje + "\n");
        }
        return mensaje;
    }
    
    public boolean retirar(double cantidad){
        if(cantidad <= this.getSaldo()){
            mensaje = true;
            System.out.println(mensaje);
            System.out.println("Su saldo anterior era: " + moneda.format(this.getSaldo()) + ".");
            this.setSaldo(this.getSaldo() - cantidad);
            System.out.println("Retiro de: " + moneda.format(cantidad) + ".");
            System.out.println("Su nuevo saldo es: " + moneda.format(this.getSaldo()) + ".\n");
        } else
        if(cantidad > this.getSaldo()){
            mensaje = false;
            System.out.println(mensaje + "\n");
        }
        return mensaje;
    }
    
    @Override
    public String toString(){
        return "-----Cuenta-----\n\nSaldo: " + moneda.format(this.getSaldo()) + ".\n";
    }
}
