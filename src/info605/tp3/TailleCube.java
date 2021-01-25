package info605.tp3;

public enum TailleCube {
    grand(3),
    moyen(2),
    petit(1),
    ;

    private final int taille;

    TailleCube(int taille) {
        this.taille = taille;
    }

    public static TailleCube getTaille(String taille) {
        for (TailleCube t : TailleCube.values())
            if (t.name().equalsIgnoreCase(taille))
                return t;
        return TailleCube.grand;
    }

    public boolean lessThanOrEquals(TailleCube tailleCube) {
        return this.taille <= tailleCube.taille;
    }

    public int getTaille() {
        return taille;
    }
}
