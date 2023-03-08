package Programas;

import java.util.Scanner;
import Banco.Cuenta;
import Banco.CuentaAhorros;
import Banco.CuentaCheques;

public class AppCuenta1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        CuentaAhorros[] ca = new CuentaAhorros[100];
        for (int i = 0; i < ca.length; i++) {
            ca[i] = new CuentaAhorros(0,0);
        }
        
        CuentaCheques[] cc = new CuentaCheques[100];
        for (int h = 0; h < cc.length; h++) {
            cc[h] = new CuentaCheques(30,0);
        }
         */
        CuentaAhorros ca = new CuentaAhorros(0, 0);
        CuentaCheques cc = new CuentaCheques(30, 0);

        int opc, opc2, opc3, op1 = 0, op2 = 0, op3 = 0;
        double cantidad, tasa, saldo;
        System.out.println("-----Bienvenido-----\n");
        do {
            System.out.println("Que desea hacer?\n•1) Abrir cuenta ahorros\n•2) Abrir cuenta cheques\n•3) Salir\n");
            System.out.println("--------------------\n");
            opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    System.out.println("•Cual es el saldo de su nueva cuenta?");
                        saldo = sc.nextDouble();
                        System.out.println("");
                        System.out.println("•Cual es la tasa de interes de la cuenta?");
                        tasa = sc.nextDouble();
                        System.out.println("");
                        ca = new CuentaAhorros(tasa, saldo);
                        System.out.println(ca);
                    do {
                        System.out.println("-------------------------\n");
                        System.out.println("Que desea hacer?\n•1) Aplicar interes\n•2) Depositar\n•3) Retirar\n•4) Salir\n");
                        System.out.println("-------------------------");
                        opc2 = sc.nextInt();
                        System.out.println("");
                        switch (opc2) {
//                        for (int i = 0; i < ca.length; i++){
//                    }
                            case 1:
                                System.out.println("•Ingrese la tasa de interes: ");
                                tasa = sc.nextDouble();
                                System.out.println("");
                                ca.aplicarInteres(tasa);
                                break;
                            case 2:
                                System.out.println("•Ingrese la cantidad que desea depositar: ");
                                cantidad = sc.nextDouble();
                                System.out.println("");
                                ca.depositar(cantidad);
                                break;
                            case 3:
                                System.out.println("•Ingrese la cantidad que desea retirar: ");
                                cantidad = sc.nextDouble();
                                System.out.println("");
                                ca.retirar(cantidad);
                                break;
                            case 4:
                                System.out.println("•Volvera al menu anterior!\n");
                                op2 = 1;
                                break;
                        }
                    } while (op2 == 0);
                    break;
                case 2:
                    System.out.println("•Cual es el saldo de su nueva cuenta?");
                        saldo = sc.nextDouble();
                        System.out.println("");
                        cc = new CuentaCheques(30, saldo);
                        System.out.println(cc);
                    do {
                        System.out.println("-------------------------\n");
                        System.out.println("Que desea hacer?\n•1) Aplicar costo de manejo de cuenta\n•2) Depositar\n•3) Retirar\n•4) Salir\n");
                        System.out.println("-------------------------");
                        opc3 = sc.nextInt();
                        System.out.println("");
                        switch (opc3) {
                            case 1:
                                System.out.println("•Se le aplicara el costo de manejo de cuenta!");
                                System.out.println("");
                                cc.aplicarCostoManejoCuenta();
                                break;
                            case 2:
                                System.out.println("•Ingrese la cantidad que desea depositar: ");
                                cantidad = sc.nextDouble();
                                System.out.println("");
                                cc.depositar(cantidad);
                                break;
                            case 3:
                                System.out.println("•Ingrese la cantidad que desea retirar: ");
                                cantidad = sc.nextDouble();
                                System.out.println("");
                                cc.retirar(cantidad);
                                break;
                            case 4:
                                System.out.println("•Volvera al menu anterior!\n");
                                op3 = 1;
                                break;
                        }
                    } while (op3 == 0);
                    break;
                case 3:
                    op1 = 1;
                    System.out.println("•Adios!\n");
                    break;
            }
        } while (op1 == 0);
    }
}
