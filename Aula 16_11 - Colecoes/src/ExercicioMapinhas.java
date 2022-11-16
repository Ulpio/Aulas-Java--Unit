import java.util.HashMap;
import java.util.Map;

public class ExercicioMapinhas {
    String key;
    String value;
    /* Implemente uma classe em Java com as funcionalidades de uma
        agenda telefˆonica, associando um nome a um n ́umero telefˆonico. A
        classe deve possuir os metodos:
        inserir contato;
        listar contato;
        remover contato;
        tamanho da agenda telefˆonica.
     */
    public static void main(String[] args) {
        Map <String,String> listaTelefonica = new HashMap<String,String>();
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
        System.out.println(listaTelefonica.keySet());
    }
    
    
}
