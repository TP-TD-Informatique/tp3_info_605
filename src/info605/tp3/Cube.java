package info605.tp3;

public class Cube {
    private final TailleCube taille;

    private final Couleur couleur;

    public Cube dessous;

    public Cube(TailleCube taille, Couleur couleur) {
        this.taille = taille;
        this.couleur = couleur;
    }

    public TailleCube getTaille() {
        return taille;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Cube getDessous() {
        return dessous;
    }

    public boolean setDessous(Cube dessous) {
        if (taille.lessThanOrEquals(dessous.getTaille())) {
            this.dessous = dessous;
            return true;
        }
        return false;
    }
}
