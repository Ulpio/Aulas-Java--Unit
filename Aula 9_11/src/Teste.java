import java.util.Vector;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        //System.out.println(circulo.areaCalculada()+"cm²");
        Quadrado quadrado = new Quadrado(3);
        //System.out.println(quadrado.areaCalculada()+"cm²");
        Retangulo retangulo = new Retangulo(5, 2);
        //System.out.println(retangulo.areaCalculada()+"cm²");
        Vector<AreaCalculavel> area = new Vector<>();
        area.add(retangulo);
        area.add(circulo);
        area.add(quadrado);
        for (AreaCalculavel x: area){
            System.out.println(x.areaCalculada()+"cm²");
        }
    }
    
}
