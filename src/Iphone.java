public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutoMusical{

    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica...");
    }

    @Override
    public void ligar() {
        System.out.println("iniciando ligacao...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz...");
    }
    
}
