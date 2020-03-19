package fr.exercice.ak;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TennisGameTest {

    @Test
    public void devrait_renvoyer_0_0_en_debut_de_parti() {
        TennisGame tennisGame = new TennisGame();
        String result = tennisGame.getScore();
        assertThat(result, is("0 - 0"));
    }


    /*
        Regle du tennis

        En debut de match le score a affiché : "0 - 0"

        Si le joueur 1 marque une fois : "15 - 0"
        Si le joueur 1 marque deux fois : "30 - 0"
        Si le joueur 1 marque trois fois : "40 - 0"

        Si le joueur 2 marque une fois : "0 - 15"
        Si le joueur 2 marque deux fois : "0 - 30"
        Si le joueur 2 marque trois fois : "0 - 40"

        Si joueur 1 marque une fois et joueur 2 marque 3 fois : "15 - 40"
        etc ...

        Le programme a deux interaction :
            - un joueur marque
            - afficher le score
     */
}