package br.com.infnet;
import java.util.Locale;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static double somarValores(double x, double y, double z) {
        z = y + x;
        return z;
    }

    public static double multiplicarValores(double x, double y, double z) {
        z = x * y;
        return z;
    }

    public static double subtrairValores(double x, double y, double z) {
        z = x - y;
        return z;
    }

    public static double dividirValores(double x, double y, double z) {
        z = x / y;
        return z;
    }

    public static double restoDivisao(double x, double y, double z) {
        z = x % y;
        return z;
    }

    public static double potenciaValores(double x, double y, double z) {
        z = Math.pow(x, y);
        return z;
    }

    public static void main( String[] args )
    {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double var1 = 0 , var2 = 0 , result = 0;
                String captcha;
                int escolha =0 , i = 0;


                switch (escolha) {
                    case 0:
                        System.out.printf("Escolha a opção: %n1 Adição%n2 Subtração%n3 Multiplicacao%n4 Divisao%n5 Resto da divisão%n6 Potenciação%n");
                        escolha = sc.nextInt();
                        System.out.println("Digite os valores: ");
                        var1 = sc.nextDouble();
                        var2 = sc.nextDouble();
                    case 1:
                        result = somarValores(var1, var2, result);
                        System.out.println("Resultado: " + result);
                        break;
                    case 2:
                        result = subtrairValores(var1, var2, result);
                        System.out.println("Resultado: " + result);
                        break;
                    case 3:
                        result = multiplicarValores(var1, var2, result);
                        System.out.println("Resultado: " + result);
                        break;
                    case 4:
                        result = dividirValores(var1, var2, result);
                        System.out.println("Resultado: " + result);
                        break;
                    case 5:
                        result = potenciaValores(var1, var2, result);
                        System.out.println("Resultado: " + result);
                        break;
                    default:
                        System.out.printf("Deseja fazer mais alguma operação ? (s/n)%n");
                        captcha = sc.next();
                        if (captcha == "s") {
                            escolha = 0;
                        } else if (captcha == "n") {
                            System.out.println("Obrigado :D");
                            i = 99 ;
                        } else {
                            System.out.println("Opção invalida");
                            escolha = 99;
                        }
                }
            }

        }




