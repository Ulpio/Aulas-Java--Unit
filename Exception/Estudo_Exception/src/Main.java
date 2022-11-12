public class Main {
    public static void main(String[] args) throws SemBException{
        String frase = null;
        String novaFrase = null;

        try{
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException nullpointer){
            System.out.println("A frase está vazia.");
            novaFrase = "default";
        }
        finally{
            System.out.println(novaFrase.toUpperCase());
        }

        // if(!frase.contains("b") || !frase.contains("B")){
        //     throw new SemBException();
        // }
    }
}
