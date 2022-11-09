import java.lang.annotation.Documented;

public class Circulo implements AreaCalculavel {
    float raio;
    Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public double areaCalculada(){
        return 3.14*(raio*raio);
    }
    
}
