import java.util.Vector;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.areaCalculada()+"cm²");
        Quadrado quadrado = new Quadrado(3);
        System.out.println(quadrado.areaCalculada()+"cm²");
        Retangulo retangulo = new Retangulo(5, 2);
        System.out.println(retangulo.areaCalculada()+"cm²");
    }
    
}
