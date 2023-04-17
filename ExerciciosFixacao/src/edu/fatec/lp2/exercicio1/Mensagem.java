package edu.fatec.lp2.exercicio1;

import java.lang.String;

public abstract class Mensagem {
    private String destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem (String destinatario, String destinatario, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public String getDestinatario() {

        return destinatario;
    }

    public void setDestinatario(String destinatario) {

        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {

        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {

        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {

        return conteudo;
    }

    public void setConteudo(String conteudo) {

        this.conteudo = conteudo;
    }

    public abstract void sendMessage();
}

public class MsgTexto extends Mensagem{
    private int numChar;


    public MsgTexto(String destinatario, String destinatario, String conteudo){
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void sendMessage(){

        System.out.println("Mensagem de texto enviada: " + getConteudo());
    }
}
public class MsgAudio extends Mensagem{

    private int duracao;

    public MsgAudio(String destinatario, String destinatario, String conteudo){
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }

    public void sendMessage(){
        System.out.println("Mensagem de áudio enviada: " + getConteudo());
    }

}

public class MsgFoto extends Mensagem{

    private int tamanho;

    public MsgFoto(String destinatario, String destinatario, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void sendMessage(){
        System.out.println("Mensagem de foto enviada: " + getConteudo());
    }

}