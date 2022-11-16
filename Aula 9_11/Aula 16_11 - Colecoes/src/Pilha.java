import java.nio.charset.MalformedInputException;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        final Stack pilha = new Stack<>();
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro bomba = new Carro();
        pilha.push(c1);
        pilha.push(c2);
        pilha.push(c3);
        pilha.push(bomba);

        System.out.println(pilha.peek());
        pilha.pop();
        System.out.println(pilha.size());
        System.out.println(pilha.get(2));
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.size());
        System.out.println(pilha.empty());
        
    }
        
}
    
    

