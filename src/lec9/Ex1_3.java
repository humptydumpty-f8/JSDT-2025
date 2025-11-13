package lec9;

import java.util.ArrayList;
import java.util.List;

/**
 * Відношення ненаправленої асоціації між класами
 * Клас Player асоціює клас Team
 */

public class Ex1_3 {

    //Клас-ассоціація
    static class Team {
        String teamName;
        List teamList = new ArrayList<Player>();
    }

    //Асоційований клас
    static class Player
    {
        String playerName;
        Team team;
    }

    public static void main(String[] args) {
        Team team = new Team();
        Player player = new Player();

        team.teamList.add(player);
        player.team = team;
    }
}
