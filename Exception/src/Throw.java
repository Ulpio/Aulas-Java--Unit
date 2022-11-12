public class Throw {
    private static void aumentarLetras() throws Exception{
        String frase = null;
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException n){
            throw new Exception();
        }
        System.out.println(frase);
        System.out.println(novaFrase);
    }
}
