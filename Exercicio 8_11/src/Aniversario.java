public class Aniversario extends CartaoWeb {

    Aniversario(String destinatario, String mensagem){
        super(destinatario,mensagem);
    }
    
    public String receberDestinatario(){
        return getDestinatario();
    }

    @Override
    String ShowMessage() {
        
        return getMensagem();
    }
}
