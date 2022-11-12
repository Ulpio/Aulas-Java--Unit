import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisaoPorZero,EntradaInvalida {
        int numero1,numero2;
        float resultado;
        String operacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo(a) á calculadora mais pica das galáxias");
        try {
            System.out.println("Insira o primeiro valor:\n");
            numero1 = entrada.nextInt();
            System.out.println("Insira o segundo Valor:\n");
            numero2 = entrada.nextInt();
        } catch (InputMismatchException e) {
            throw new EntradaInvalida();
        }
        System.out.println("Insira a operação desejada");
        operacao = entrada.next();


        switch(operacao){
            case "+":{
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            }
            case "-":{
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            }
            
            case "*":{
                resultado = numero1*numero2;
                System.out.println(resultado);
                break;
            }
            case "x":{
                resultado = numero1*numero2;
                System.out.println(resultado);
                break;
            }
            case"/":{
                if(numero2 == 0){
                    throw new DivisaoPorZero();
                }
                else{
                resultado = numero1/numero2;
                System.out.println(resultado);
                break;
                }
            }
            default:{
                System.out.println("deu ruim aí");
            }

        }
        

    }
}

