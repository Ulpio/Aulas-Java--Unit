import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DiaDosNamorados ddn = new DiaDosNamorados("Ulpio", "Feliz dia dos Namorados!");
        Aniversario niver = new Aniversario("Gustavo", "Feliz aniversário!!");
        Natal natal = new Natal("Arthur", "Feliz natal!");
        ArrayList <CartaoWeb> cartao = new ArrayList<>();
        cartao.add(ddn);
        cartao.add(niver);
        cartao.add(natal);

        for (CartaoWeb x: cartao){
            System.out.println(x.getDestinatario()+". Mensagem: "+x.getMensagem());
        }        
    }
}
