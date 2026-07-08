package model;

import java.util.Objects;

// Tabella ponte con chiave primaria composta (IDProdotto, NomeIngrediente)
public class Composto {
    private Integer idProdotto;
    private String nomeIngrediente;

    public Composto() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Composto)) return false;
        Composto that = (Composto) o;
        return Objects.equals(idProdotto, that.idProdotto)
                && Objects.equals(nomeIngrediente, that.nomeIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProdotto, nomeIngrediente);
    }
}
