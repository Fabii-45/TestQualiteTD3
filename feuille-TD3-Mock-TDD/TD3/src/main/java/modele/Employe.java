package modele;

public class Employe {

    int annee;//anciennete dans l entreprise
    double salaireDeBase;//salaire de depart a l embauche

    public Employe(){}

    public Employe(int a, double s){
        annee=a;
        salaireDeBase=s;
    }

    public int getAnnee(){return annee;}

    public double getSalaireDeBase() {
        return salaireDeBase;
    }

    public void setAnnee(int a){this.annee=a;}

    public void setSalaireDeBase(double s){this.salaireDeBase=s;}

    protected Categorie creerCategorie() {
        return new Categorie();
    }

    //salaire effectif de l employe calcule selon son anciennete sa categorie
    public double salaire() {
        switch(creerCategorie().valCategorie(annee)) {
            case 1: {
                return this.salaireDeBase;
            }
            case 2: {
                return this.salaireDeBase*1.1;
            }
            default: {
                return this.salaireDeBase*1.2;
            }
        }
    }
}