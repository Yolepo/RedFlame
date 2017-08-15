package model;

import java.io.*;

// Le rouleur est composé :
// un deck de cartes spécifique
public class Rouleur implements Coureur {
    public Deck deck;

    public Rouleur() {
        // 3x3, 3x4, 3x5, 3x6, 3x7 : Total : 75
        Integer[] cartesRouleur = new Integer[]{3,3,3,4,4,4,5,5,5,6,6,6,7,7,7};
        List<Integer> cartes = Arrays.stream(cartesRouleur).collect(Collectors.toList());
        deck = new Deck(cartes);
    }
}
