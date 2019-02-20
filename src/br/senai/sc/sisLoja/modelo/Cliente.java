package br.senai.sc.sisLoja.modelo;

public class Cliente {
    private int codCli;
    private String nomCli;
    private String endCli;
    private String baiCli;
    private String comCli;
    private int cepCli;
    private int telCli;

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getEndCli() {
        return endCli;
    }

    public void setEndCli(String endCli) {
        this.endCli = endCli;
    }

    public String getBaiCli() {
        return baiCli;
    }

    public void setBaiCli(String baiCli) {
        this.baiCli = baiCli;
    }

    public String getComCli() {
        return comCli;
    }

    public void setComCli(String comCli) {
        this.comCli = comCli;
    }

    public int getCepCli() {
        return cepCli;
    }

    public void setCepCli(int cepCli) {
        this.cepCli = cepCli;
    }

    public int getTelCli() {
        return telCli;
    }

    public void setTelCli(int telCli) {
        this.telCli = telCli;
    }

    public boolean getNomeCli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
