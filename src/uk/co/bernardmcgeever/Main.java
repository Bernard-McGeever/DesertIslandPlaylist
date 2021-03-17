package uk.co.bernardmcgeever;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Yesterday");
        desertIslandPlaylist.add("Help");
        desertIslandPlaylist.add("Hay Jude");
        desertIslandPlaylist.add("Let it be");
        desertIslandPlaylist.add("Yellow submerine");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        // Swap
        String a = desertIslandPlaylist.get(1);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.add(2, a);
        System.out.println(desertIslandPlaylist);
    }
}
