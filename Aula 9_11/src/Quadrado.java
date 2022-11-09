public class Quadrado implements AreaCalculavel {
    float lado;

    Quadrado(float lado){
        this.lado = lado;
    }
    @Override
    public double areaCalculada() {
        return lado*lado;
    }
    

    
}
