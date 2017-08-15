package services;

import model.Joueur;

public interface JoueurService {


    /**
     * @param id Id du joueur
     * @return le joueur demandé
     */
    Joueur findById(int id);
}
