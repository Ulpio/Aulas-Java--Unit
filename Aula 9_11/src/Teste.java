import java.util.Scanner;

public class Teste {
    static String forma;
    float raio;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual forma gostaria de calcular?\n");
        System.out.println("C para Círculo \n Q para Quadrado \n R para retângulo");
        forma = scanner.nextLine();
        forma.toUpperCase();
        switch(forma){
            case "C" :{
                Circulo c = new Circulo(scanner.nextFloat());
                c.areaCalculada();
            }
        }
    }
    
}
