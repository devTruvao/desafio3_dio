public class Program {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        
        iphone.iniciarCorreioDeVoz();
        iphone.ligar();
        iphone.atender();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        }
}
