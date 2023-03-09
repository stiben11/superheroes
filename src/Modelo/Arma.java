package Modelo;


public class Arma {
   private String nom_arma;
   private int da_arma;
    public Arma(String nom_arma,int da_arma){
        this.nom_arma=nom_arma;
        this.da_arma=da_arma;
    }

    public String getNom_arma() {
        return nom_arma;
    }

    public void setNom_arma(String nom_arma) {
        this.nom_arma = nom_arma;
    }

    public int getDa_arma() {
        return da_arma;
    }

    public void setDa_arma(int da_arma) {
        this.da_arma = da_arma;
    }
    
    
}
