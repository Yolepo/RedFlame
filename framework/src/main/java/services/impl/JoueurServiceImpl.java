package services.impl;

import model.Joueur;
import org.springframework.stereotype.Service;
import services.JoueurService;

@Service
public class JoueurServiceImpl implements JoueurService {
    /**
     * @param id Id du joueur
     * @return le joueur demandé
     */
    @Override
    public Joueur findById(long id) {
        return null;
    }
}
