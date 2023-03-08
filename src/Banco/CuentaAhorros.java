package Banco;

public class CuentaAhorros extends Cuenta {

    private double tasaInteres;

    public CuentaAhorros(double tasaInteres, double saldo) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorros(double saldo) {
        super(saldo);
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres(double tasaInteres) {
        System.out.println("Su saldo anterior era: " + moneda.format(this.getSaldo()) + ".");
        this.setSaldo(this.getSaldo() + (this.getSaldo() * (tasaInteres / 100)));
        System.out.println("Interes de: " + tasaInteres + "%.");
        System.out.println("Su nuevo saldo es: " + moneda.format(this.getSaldo()) + ".\n");
    }

    @Override
    public String toString() {
        return "---Cuenta Ahorro---\nSaldo: " + moneda.format(this.getSaldo()) + ".\n"
                + "Tasa de interes: " + (this.getTasaInteres()) + "%.\n" + 
                "-------------------\n";
    }
}
