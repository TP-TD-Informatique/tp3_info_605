package info605.tp3;

public class Robot {
    private Cube cubeTenu;

    private final Table support;

    public Robot(Table support) {
        this.support = support;
    }

    public void creerCube(Couleur couleur, TailleCube taille) {
        if (estMainVide()) {
            setCubeTenu(new Cube(taille, couleur));
        }
    }

    private boolean estMainVide() {
        return cubeTenu == null;
    }

    private void setCubeTenu(Cube cubeTenu) {
        this.cubeTenu = cubeTenu;
    }

    public void detruireCube() {
        if (!estMainVide()) {
            setCubeTenu(null);
        }
    }

    public void prendreCube(TailleCube taille, Couleur couleur) {
        if (estMainVide()) {
            setCubeTenu(support.prendreCube(taille, couleur));
        }
    }

    public void poserCube() {
    }

    public void poserCube(TailleCube taille, Couleur couleur) {
        if (!estMainVide()) {
            support.poserCubeSurCube(cubeTenu, taille, couleur);
        }
    }
}
