package info605.tp3;

public enum Couleur {
    rouge,
    vert,
    jaune,
    bleu,
    violet,
    cyan,
    gris,
    noir,
    ;

    public static Couleur getCouleur(String coulSaisie) {
        for (Couleur c : Couleur.values())
            if (c.name().equalsIgnoreCase(coulSaisie))
                return c;
        return Couleur.rouge;
    }
}
