package model;

import java.math.BigDecimal;
import java.time.Duration;

public class Prodotto {
    private Integer id;
    private String nome;
    private BigDecimal prezzo;
    private String descrizione;
    private String descrPropPrep;
    private Duration tempoDiPrep;
    private Integer idOrdine;
    private Integer idMenu;

    public Prodotto() {
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

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrPropPrep() {
        return descrPropPrep;
    }

    public void setDescrPropPrep(String descrPropPrep) {
        this.descrPropPrep = descrPropPrep;
    }

    public Duration getTempoDiPrep() {
        return tempoDiPrep;
    }

    public void setTempoDiPrep(Duration tempoDiPrep) {
        this.tempoDiPrep = tempoDiPrep;
    }

    public Integer getIdOrdine() {
        return idOrdine;
    }

    public void setIdOrdine(Integer idOrdine) {
        this.idOrdine = idOrdine;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }
}
