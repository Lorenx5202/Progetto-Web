public class Personale{
    private String nome;
    private String cognome;
    private int id;
    private int permesso;

    public Personale(String nome, String cognome, int id){
        this.nome= nome;
        this.cognome= cognome;
        this.id= id;
        this.permesso= 2;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    public int getPermesso(){
        return permesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
