package co;

import game.GM;
import game.GameClock;
import gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        GM gm = new GM();



        GameClock gameClock = new GameClock();

        gm.setup();
        gui.criarGui();
        gameClock.start();

    }
}
