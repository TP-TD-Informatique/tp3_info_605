package info605.tp3;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<Cube> cubeSurTable = new ArrayList<Cube>();

    public Cube prendreCube(TailleCube taille, Couleur couleur) {
        Cube cube = getCube(taille, couleur);
        depileCube(cube);

        return cube;
    }

    private void depileCube(Cube cube) {
        int i = cubeSurTable.indexOf(cube);
        cubeSurTable.add(i, cube.getDessous());
        cube.setDessous(null);
    }

    public void poseCubeSurTable(Cube cube) {
    }

    private void addCubeSurTable(Cube cube) {
    }

    private Cube getCube(TailleCube taille, Couleur couleur) {
        for (Cube cube : cubeSurTable)
            if (cube.isSameCube(taille, couleur))
                return cube;

        return null;
    }

    public void poserCubeSurCube(Cube cube, TailleCube taille, String couleur) {
    }
}
