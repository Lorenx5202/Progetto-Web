public class Cliente {
    private String nome;
    private String cognome;
    private long id;
    private String telefono;
    private String email;
    private String indirizzo;
    private String hashedPassword;
    private int permesso;

    public Cliente(String nome, String cognome, long id, String telefono, String email,String indirizzo, String hashedPassword){
        this.nome= nome;
        this.cognome= cognome;
        this.id= id;
        this.telefono= telefono;
        this.email= email;
        this.indirizzo= indirizzo;
        this.hashedPassword= hashedPassword;
        this.permesso=1;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public long getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail(){
        return email;
    }

    public String getIndirizzo(){
        return indirizzo;
    }

    public String getHashedPassword() {
        return hashedPassword;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public void setIndirizzo(String indirizzo){
        this.indirizzo= indirizzo;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
