import Interfaces.*;

public class iPhoneTelefone implements Telefone {
    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
