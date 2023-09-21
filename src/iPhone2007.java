
import Interfaces.*;
public class iPhone2007 {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new iPhoneReprodutorMusical();
        Telefone telefone = new iPhoneTelefone();
        Navegador navegador = new iPhoneNavegador();

        reprodutorMusical.tocar();
        reprodutorMusical.selecionarMusica("audioslave - like a stone");
        reprodutorMusical.pausar();
        telefone.ligar("223-523-423");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba("https://google.com");
        navegador.atualizarPagina();
    }
}
