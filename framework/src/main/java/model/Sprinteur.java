package model;

import java.io.*;

// Le sprinteur est composé :
// un deck de cartes spécifique
public class Sprinteur implements Coureur {
    public Deck deck;

    public Sprinteur() {
        // 3x2, 3x3, 3x4, 3x5, 3x9 : Total : 69
        Integer[] cartesSprinteur = new Integer[]{2,2,2,3,3,3,4,4,4,5,5,5,9,9,9};
        List<Integer> cartes = Arrays.stream(cartesSprinteur).collect(Collectors.toList());
        deck = new Deck(cartes);
    }
}