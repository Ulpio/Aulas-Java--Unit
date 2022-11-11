public class Retangulo implements AreaCalculavel{
    float base;
    float altura;

    Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double areaCalculada(){
        return base*altura;
    }
}
