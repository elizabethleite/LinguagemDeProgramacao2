package edu.fatec.lp2.exercicio1;

public class WhatsApp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public WhatsApp(Contatinho[] contatos, Mensagem[] mensagens){
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public Contatinho getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho contatos) {
        this.contatos = contatos;
    }

    public Mensagem getMensagens() {
        return mensagens;
    }

    public void setMensagens(Mensagem mensagens) {
        this.mensagens = mensagens;
    }

    //Listar contatos//
    public void listarContatos() {
        for (Contatinho contato : contatos) {
            System.out.println(contato.getNome() + ": " + contato.getCelular());
        }

    //Listar mensagens//

    public void listarMensagens() {
            for (Mensagem mensagem : mensagens) {
                System.out.println("Hora do envio: " + mensagem.getHoraEnvio());
                System.out.println("Para: " + mensagem.getDestinatario());
                System.out.println("Conteúdo: " + mensagem.getConteudo());
            }
    }
}
