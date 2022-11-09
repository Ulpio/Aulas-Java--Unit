public class DiaDosNamorados extends CartaoWeb {


    DiaDosNamorados(String destinatario, String mensagem){
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
