import java.util.Scanner;

public class Teste {
    static String forma;
    float raio;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual forma gostaria de calcular?");
        System.out.println("C para Círculo\nQ para Quadrado \nR para retângulo");
        forma = scanner.nextLine();
        forma.toUpperCase();
        switch(forma){
            case "C" :{
                System.out.println("Insira o valor do Raio: \n");
                Circulo c = new Circulo(scanner.nextFloat());
                System.out.println(c.areaCalculada()+"cm²");;
                break;
            }
            case "Q" :{
                System.out.println("Insira o valor do lado:\n");
                Quadrado q = new Quadrado(scanner.nextFloat());
                System.out.println(q.areaCalculada()+"cm²");
                break;
            }
            case "R":{
                System.out.println("Insira o valor da base:\n");
                float base = scanner.nextFloat();
                System.out.println("Insira a altura:");
                float altura = scanner.nextFloat();
                Retangulo r = new Retangulo(base,altura);
                System.out.println(r.areaCalculada()+"cm²");
                break;
            }
            default:{
                System.out.println("Forma inválida");
            }
        }
    }
    
}
