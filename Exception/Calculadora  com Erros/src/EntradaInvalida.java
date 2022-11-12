public class EntradaInvalida extends Exception {
    @Override
    public String getMessage() {
        return "A entrada é inválida";
    }
}
