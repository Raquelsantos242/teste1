package br.com.infnet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.Scanner;

import static funcoes.Funcoes.*;

public class App 
{

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {


                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double var1 = 0 , var2 = 0 , result = 0;
                String captcha;
                int escolha =0 , i = 0;


                switch (escolha) {
                    case 0:
                        LOGGER.info("BEM-VINDO!");
                        LOGGER.debug("Escolha a opção: %n1 Adição%n2 Subtração%n3 Multiplicacao%n4 Divisao%n5 Resto da divisão%n6 Potenciação%n");
                        escolha = sc.nextInt();
                        LOGGER.debug("Digite os valores: ");
                        var1 = sc.nextDouble();
                        var2 = sc.nextDouble();
                    case 1:
                        result = somarValores(var1, var2, result);
                        LOGGER.debug("Resultado: " + result);
                        break;
                    case 2:
                        result = subtrairValores(var1, var2, result);
                        LOGGER.debug("Resultado: " + result);
                        break;
                    case 3:
                        result = multiplicarValores(var1, var2, result);
                        LOGGER.debug("Resultado: " + result);
                        break;
                    case 4:
                        result = dividirValores(var1, var2, result);
                        LOGGER.debug("Resultado: " + result);
                        break;
                    case 5:
                        result = potenciaValores(var1, var2, result);
                        LOGGER.debug("Resultado: " + result);
                        break;
                    default:
                        LOGGER.debug("Deseja fazer mais alguma operação ? (s/n)%n");
                        captcha = sc.next();
                        if (captcha == "s") {
                            escolha = 0;
                        } else if (captcha == "n") {
                            LOGGER.debug("Obrigado :D");
                            i = 99 ;
                        } else {
                            LOGGER.error("Opção invalida");
                            escolha = 99;
                        }
                }
            }

        }




