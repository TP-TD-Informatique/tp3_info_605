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

    public Cube getDessous() {
        return dessous;
    }

    public boolean setDessous(Cube dessous) {
        if (dessous == null || taille.lessThanOrEquals(dessous.getTaille())) {
            this.dessous = dessous;
            return true;
        }
        return false;
    }

    public boolean isSameCube(TailleCube taille, Couleur couleur) {
        return this.taille == taille && this.couleur == couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cube) {
            return isSameCube(((Cube) obj).taille, ((Cube) obj).couleur);
        }
        return false;
    }
}
