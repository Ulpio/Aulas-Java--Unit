public class EntradaInvalida extends Exception {
    @Override
    public String getMessage() {
        return "A entrada é inválida, você digitou algo diferente de um número, por favor, rode o programa novamente.";
    }
}
