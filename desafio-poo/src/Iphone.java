public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {

    @Override
    public void navegarNaInternet() {
        System.out.println("Navegando na internet...");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

}