
import Interfaces.*;

public class iPhoneNavegador implements Navegador {
    private String paginaAtual;

    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + paginaAtual);
    }
}