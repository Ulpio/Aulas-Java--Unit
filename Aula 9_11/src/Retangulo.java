public class Retangulo implements AreaCalculavel{
    float base;
    float altura;

    Retangulo(float base, float altura){
        this.base = base;
        this.altura = base;
    }
    
    @Override
    public double areaCalculada(){
        return base*altura;
    }
}
