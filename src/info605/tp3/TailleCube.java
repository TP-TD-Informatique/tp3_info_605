package info605.tp3;

public enum TailleCube {
    grand,
    moyen,
    petit,
    ;

    public static TailleCube getTaille(String taille) {
        for (TailleCube t : TailleCube.values())
            if (t.name().equalsIgnoreCase(taille))
                return t;
        return TailleCube.grand;
    }

    public boolean lessThanOrEquals(TailleCube taille) {
        switch (this) {
            case grand -> {
                return true;
            }
            case moyen -> {
                return taille == moyen || taille == petit;
            }
            case petit -> {
                return taille == petit;
            }
            default -> {
                return false;
            }
        }
    }
}
