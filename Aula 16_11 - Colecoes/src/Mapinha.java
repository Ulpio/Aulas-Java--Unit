import java.util.HashMap;
import java.util.Map;

public class Mapinha{

    
    public static void main(String[] args) {
       Map < String , String > dddEstados = new HashMap < >();
       dddEstados.put("São Paulo","11");
       dddEstados.put("Rio de Janeiro","21");
       dddEstados.put("Alagoas","82");

       for(String municipio :dddEstados.keySet()){
        System.out.println("O DDD de: "+municipio+" é "+dddEstados.get(municipio));
       }
    }
    
}
