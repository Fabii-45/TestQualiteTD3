package modele;

import static java.lang.Math.max;

public class G  {

    private F f;
    private S s;
    private Generateur generateur;

    public G() {
        generateur = new Generateur();
        f = new F();
        s = new S();
    }

    public int calcul(int coupe) throws Exception {
        int n = generateur.generate();
        int f_result = f.calcul(n);
        int s_result = s.calcul(n);

        int so = f_result + s_result;

        if (coupe != 1 && coupe != 40){
            throw new Exception("coupe KO");
        }

        if(so<coupe){
            return so;
        } else {
            return max(f_result,s_result);
        }
    }


}
