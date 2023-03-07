package modele;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class EmployeTest {
    @Spy
    private Employe employe = new Employe(2020, 1000);
    Employe spy = spy(employe);

    int salaire = 1000;

    @Test
    public void salaireCat3(){
        int cat3 = 3;
        int annee3 = 30;
        double exceptedSalaire = 1200;

        Categorie categorie = Mockito.mock(Categorie.class);
        Employe employe = spy(new Employe(annee3, salaire));
        doReturn(categorie).when(employe).creerCategorie();
        doReturn(cat3).when(categorie).valCategorie(annee3);

        Assertions.assertDoesNotThrow(() -> employe.salaire());
        Assertions.assertEquals(exceptedSalaire, employe.salaire());
    }

    @Test
    public void salaireCat2(){
        int cat2 = 2;
        int annee2 = 15;
        double exceptedSalaire = 1100;

        Categorie categorie = Mockito.mock(Categorie.class);
        Employe employe = spy(new Employe(annee2, salaire));
        doReturn(categorie).when(employe).creerCategorie();
        doReturn(cat2).when(categorie).valCategorie(annee2);

        Assertions.assertDoesNotThrow(() -> employe.salaire());
        Assertions.assertEquals(exceptedSalaire, employe.salaire());
    }

    @Test
    public void salaireCat1(){
        int an1 = 6;
        double salaire = 1000;
        int categ1 = 1;
        //Création du mock de catégorie -> écrase totalement le code de Categorie
        Categorie categorie = mock(Categorie.class);
        //Création d'un spy pour Employe -> permet d'utiliser le code de Employe
        Employe employe = spy(new Employe(an1, salaire));

        //On return le mock de notre Categorie quand employe rencontre creerCategorie()
        doReturn(categorie).when(employe).creerCategorie();
        //On return 1 lorsque notre mock de Categorie rencontre valCategorie(6)
        doReturn(categ1).when(categorie).valCategorie(an1);

        //On fait nos tests d'assertions normal
        Assertions.assertDoesNotThrow(() -> employe.salaire());
        Assertions.assertEquals(employe.salaire(), 1000);
    }

}
