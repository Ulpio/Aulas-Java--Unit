public abstract class CartaoWeb {
    private String destinatario;
    private String mensagem;

    public CartaoWeb(String destinatario,String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    abstract String ShowMessage();
    public String setDestinatario(String destinatario){
        return this.destinatario = destinatario;
    }
    public String getDestinatario(){
        return this.destinatario;
    }
    public String setMensagem(String mensagem){
        return this.mensagem = mensagem;
    }
    public String getMensagem(){
        return this.mensagem;
    }
}

