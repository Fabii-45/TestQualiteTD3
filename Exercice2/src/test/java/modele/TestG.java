package modele;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class TestG {

    @Test
    public void testCalculLigne1() throws Exception {
        int n = 0;
        int Fn = 1;
        int Sn = 1;
        int Gn = 1;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }

    @Test
    public void testCalculLigne2() throws Exception {
        int n = 1;
        int Fn = 1;
        int Sn = 4;
        int Gn = 4;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }

    @Test
    public void testCalculLigne3() throws Exception {
        int n = 2;
        int Fn = 2;
        int Sn = 2;
        int Gn = 2;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }

    @Test
    public void testCalculLigne4() throws Exception {
        int n = 10;
        int Fn = 89;
        int Sn = 4;
        int Gn = 89;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }

    @Test
    public void testCalculLigne5() throws Exception {
        int n = 19;
        int Fn = 6765;
        int Sn = 4;
        int Gn = 6765;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }

    @Test
    public void testCalculLigne6() throws Exception {
        int n = 20;
        int Fn = 10946;
        int Sn = 2;
        int Gn = 10946;
        int coupe = 1;

        F f = Mockito.mock(F.class);
        S s = Mockito.mock(S.class);

        G g = spy(new G());

        Generateur generateur = Mockito.mock(Generateur.class);

        doReturn(n).when(generateur).generate();
        doReturn(Sn).when(f).calcul(n);
        doReturn(Fn).when(s).calcul(n);

        Assertions.assertDoesNotThrow(() -> generateur.generate());
        Assertions.assertEquals(Gn, g.calcul(coupe));
    }
}
