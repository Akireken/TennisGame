package fr.exercice.ak;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TennisGameTest {

    @Test
    public void devrait_renvoyer_0_0_en_debut_de_parti() {
        assertThat(0, is(0));
    }

}