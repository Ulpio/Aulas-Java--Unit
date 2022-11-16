import java.util.HashMap;
import java.util.Map;

public class ExercicioMapinhas {
    public static void main(String[] args) {
        Map <String,String> listaTelefonica = new HashMap<>();
        listaTelefonica.put("Ulpio", "123456");
        listaTelefonica.put("Pedro","456789");
        listaTelefonica.put("Mecanico","741852");
        listaTelefonica.put("Farmacia","963852");
        listaTelefonica.put("Bom Dia e CIA.","40028922");

        for(String contato :listaTelefonica.keySet()){
            System.out.println("O numero do(a): "+contato+" é "+listaTelefonica.get(contato));
           }
        listaTelefonica.remove("Bom Dia e CIA.");
        System.out.println("Bom dia e CIA. foi reomvido da Lista Telefônica");
        System.out.println("Sua lista telefônica tem "+listaTelefonica.size()+" itens");

        for(String contato :listaTelefonica.keySet()){
            System.out.println("O numero do(a): "+contato+" é "+listaTelefonica.get(contato));
           }
    }

}
