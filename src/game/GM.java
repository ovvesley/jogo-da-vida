package game;

import java.util.concurrent.ThreadLocalRandom;

public class GM {
    public static final int CONTCEL = 512;
    public static boolean[][] celulas = new boolean[CONTCEL][CONTCEL];

    int inicioCelulas = 10000;
    static int gen = 0;

    public void setup() {
        for (int i = 0; i < inicioCelulas; i++) {
            int x = r(0, CONTCEL);
            int y = r(0, CONTCEL);

            celulas[x][y] = true;

        }

    }

    public static void nextGen() {
        gen++;
        System.out.println("Geração " + gen);

        for(int x =0; x<CONTCEL; x++){
            for(int y=0; y<CONTCEL; y++){
                int n = vizinho(x,y);
                //regra 1

                if(n == 3 && !celulas[x][y]){
                    celulas[x][y] = true;
                }

                if(n<2 ){
                    celulas[x][y] = false;
                }
                if(n==2 || n==3){
                }

                if(n>3){
                    celulas[x][y] = false;
                }
            }
        }
    }

    public static int vizinho(int x, int y) {
        int cont = 0;

        int[] xoff = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] yoff = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < xoff.length; i++) {
            try {
                if (celulas[x + xoff[i]][y + yoff[i]])
                    cont++;
            } catch (Exception e) {

            }
        }

        return cont;
    }

    public static int r(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
