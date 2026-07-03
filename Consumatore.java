public class Consumatore {
    final LVL_PRIVILEGE = 1;
    
    private Integer id;
    private String nome;
    private String cognome;
    private String email;
    private String numTelefono;
    private String indirizzo;
    private String infoAggiuntive;
    private String hashedPass;
    private Integer idMenu;

    public Cliente(Integer id, String nome, String cognome, String email, String numTelefono, String indirizzo, String infoAggiuntive, String hashedPass, Integer idMenu) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numTelefono = numTelefono;
        this.indirizzo = indirizzo;
        this.infoAggiuntive = infoAggiuntive;
        this.hashedPass = hashedPass;
        this.idMenu = idMenu;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getInfoAggiuntive() {
        return infoAggiuntive;
    }
    public void setInfoAggiuntive(String infoAggiuntive) {
        this.infoAggiuntive = infoAggiuntive;
    }

    public String getHashedPass() {
        return hashedPass;
    }
    public void setHashedPass(String hashedPass) {
        this.hashedPass = hashedPass;
    }

    public Integer getIdMenu() {
        return idMenu;
    }
    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

}
