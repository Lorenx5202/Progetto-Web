public class Proprietario {
    private String nome;
    private String cognome;
    private int permesso;

    public Proprietario(String nome, String cognome){
        this.nome= nome;
        this.cognome= cognome;
        this.permesso= 3;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getPermesso() {
        return permesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
