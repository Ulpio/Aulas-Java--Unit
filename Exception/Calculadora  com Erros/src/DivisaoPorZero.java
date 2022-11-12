public class DivisaoPorZero extends Exception{
    @Override
    public String getMessage() {
        return "Divisão por zero é inválida, por favor, rode o programa novamente e não coloque o zero como divisor.";
    }
}
