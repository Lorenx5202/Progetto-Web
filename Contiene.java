package model;

import java.util.Objects;

// Tabella ponte ORDINE <-> PRODOTTO con chiave composta (IDProdotto, IDOrdine)
public class Contiene {
    private Integer idProdotto;
    private Integer idOrdine;
    private int quantita;

    public Contiene() {
    }

    public Integer getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(Integer idProdotto) {
        this.idProdotto = idProdotto;
    }

    public Integer getIdOrdine() {
        return idOrdine;
    }

    public void setIdOrdine(Integer idOrdine) {
        this.idOrdine = idOrdine;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contiene)) return false;
        Contiene that = (Contiene) o;
        return Objects.equals(idProdotto, that.idProdotto)
                && Objects.equals(idOrdine, that.idOrdine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProdotto, idOrdine);
    }
}
