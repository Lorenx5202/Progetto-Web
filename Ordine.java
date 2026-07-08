package model;

import java.time.LocalDateTime;

public class Ordine {
    private Integer id;
    private LocalDateTime dataEff;
    private String indirizzoCliente;
    private String metodoDiPag;
    private int stato;
    private Integer idConsumatore;
    private Integer idPersonale;
    private Integer idProprietario;

    public Ordine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataEff() {
        return dataEff;
    }

    public void setDataEff(LocalDateTime dataEff) {
        this.dataEff = dataEff;
    }

    public String getIndirizzoCliente() {
        return indirizzoCliente;
    }

    public void setIndirizzoCliente(String indirizzoCliente) {
        this.indirizzoCliente = indirizzoCliente;
    }

    public String getMetodoDiPag() {
        return metodoDiPag;
    }

    public void setMetodoDiPag(String metodoDiPag) {
        this.metodoDiPag = metodoDiPag;
    }

    public int getStato() {
        return stato;
    }

    public void setStato(int stato) {
        this.stato = stato;
    }

    public Integer getIdConsumatore() {
        return idConsumatore;
    }

    public void setIdConsumatore(Integer idConsumatore) {
        this.idConsumatore = idConsumatore;
    }

    public Integer getIdPersonale() {
        return idPersonale;
    }

    public void setIdPersonale(Integer idPersonale) {
        this.idPersonale = idPersonale;
    }

    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }
}
