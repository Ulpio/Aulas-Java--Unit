import java.nio.charset.MalformedInputException;
import java.util.Stack;

public class Pilha {
    /*
     * Crie uma pilha.
     *  Insira v ́arios elementos na Pilha.
     *  Mostre o elemento do topo da Pilha.
     *  Retire o elemento da Pilha.
     *  Mostre a quantidade de elementos inseridos na Pilha.
     *  Indique a posi ̧c ̃ao de um elemento (a contar a partir do topo da Pilha).
     *  Limpa a Pilha (apagar todos os elementos da Pilha).
     */
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
        pilha.clear();
        System.out.println(pilha.size());
        if (pilha.empty()){
            System.out.println("Pilha está vazia");
        }
        else{
            System.out.println("Pilha não tá vazia");
        }

    }
        
}
    
    

