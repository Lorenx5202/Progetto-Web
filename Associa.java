package model;

import java.util.Objects;

// Tabella ponte con chiave primaria composta (IDProdotto, NomeIngrediente)
public class Associa {
    private Integer idProdotto;
    private String nomeIngrediente;
    private int diffPrezzo;
    private boolean isDefault;

    public Associa() {
    }

    public Integer getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(Integer idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public int getDiffPrezzo() {
        return diffPrezzo;
    }

    public void setDiffPrezzo(int diffPrezzo) {
        this.diffPrezzo = diffPrezzo;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Associa)) return false;
        Associa that = (Associa) o;
        return Objects.equals(idProdotto, that.idProdotto)
                && Objects.equals(nomeIngrediente, that.nomeIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProdotto, nomeIngrediente);
    }
}
