package Banco;

public class CuentaCheques extends Cuenta{
    private double costoManejoCuenta = 30;

    public CuentaCheques(double saldo) {
        super(saldo);
    }

    public CuentaCheques(double costoManejoCuenta, double saldo) {
        super(saldo);
        this.costoManejoCuenta = costoManejoCuenta;
    }

    public double getCostoManejoCuenta() {
        return costoManejoCuenta;
    }

    public void setCostoManejoCuenta(double costoManejoCuenta) {
        this.costoManejoCuenta = costoManejoCuenta;
    }
    
    public void aplicarCostoManejoCuenta(){
        System.out.println("Su saldo anterior era: " + moneda.format(this.getSaldo()) + ".");
        this.setSaldo(this.getSaldo() - this.getCostoManejoCuenta());
        System.out.println("Su nuevo saldo es: " + moneda.format(this.getSaldo()) + ".\n");
    }

    @Override
    public String toString() {
        return "---Cuenta Cheques---\nSaldo: " + moneda.format(this.getSaldo()) + ".\n"
                + "Costo por manejo de cuenta: " + moneda.format(this.getCostoManejoCuenta()) + ".\n" +
                "--------------------\n";
    }
}
