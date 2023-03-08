package Programas;

import Banco.Cuenta;
import Banco.CuentaAhorros;
import Banco.CuentaCheques;

public class AppCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(5000);
        System.out.println(c1);
        c1.depositar(3000);
        c1.depositar(-500);
        c1.retirar(9000);
        c1.retirar(5750);
        
        CuentaAhorros ca1 = new CuentaAhorros(15, 5000);
        System.out.println(ca1);
        ca1.aplicarInteres(15);
        
        CuentaCheques cc1 = new CuentaCheques(30, 5000);
        System.out.println(cc1);
        cc1.aplicarCostoManejoCuenta();
    }
}
