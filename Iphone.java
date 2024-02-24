public class Iphone {

    private NavegadorInternet navegadorInternet;
    private ReprodutorMusica reprodutorMusica;
    private Telefone telefone;
    
    public Iphone() {
        this.navegadorInternet = new NavegadorInternet();
        this.reprodutorMusica = new ReprodutorMusica();
        this.telefone = new Telefone();
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public ReprodutorMusica getReprodutorMusica() {
        return reprodutorMusica;
    }

    public Telefone getTelefone() {
        return telefone;
    }
    
}