public class ExceptionFinally {
    public static void main(String[] args) throws Exception {
        String frase = null;
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e){
            System.out.println("A frase inicial está nula, para solucionar  tal problema, foi lhe atribuído o valor default");
            frase = "Frase Vazia";
        }
        finally{
            System.out.println("Finally\n");
            novaFrase = frase.toUpperCase();
        }
        System.out.println(frase);
        System.out.println(novaFrase);
    }
}
