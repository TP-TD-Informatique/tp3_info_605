package info605.tp3;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<Cube> cubeSurTable = new ArrayList<>();

    public Cube prendreCube(TailleCube taille, Couleur couleur) {
        Cube cube = getCube(taille, couleur);
        if (cube != null) {
            depileCube(cube);
        }

        return cube;
    }

    private void depileCube(Cube cube) {
        int i = cubeSurTable.indexOf(cube);
        cubeSurTable.set(i, cube.getDessous());
        cube.setDessous(null);
    }

    public void poseCubeSurTable(Cube cube) {
        cubeSurTable.add(cube);
    }

    private Cube getCube(TailleCube taille, Couleur couleur) {
        for (Cube cube : cubeSurTable)
            if (cube != null && cube.isSameCube(taille, couleur))
                return cube;

        return null;
    }

    public boolean poserCubeSurCube(Cube cube, TailleCube taille, Couleur couleur) {
        Cube cubeD = getCube(taille, couleur);
        if (cubeD != null) {
            int i = cubeSurTable.indexOf(cubeD);
            if (cube.setDessous(cubeD)) {
                cubeSurTable.set(i, cube);
                return true;
            }
        }
        return false;
    }

    public void afficherTable() {
        for (Cube cube : cubeSurTable) {
            Cube c = cube;
            while (c != null) {
                System.out.print(c.getCouleurWithTaille() + " ");
                c = c.getDessous();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
