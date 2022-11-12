public class DivisaoPorZero extends Exception{
    @Override
    public String getMessage() {
        return "Divisão por zero é inválida";
    }
}
