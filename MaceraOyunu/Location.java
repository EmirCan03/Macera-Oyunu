package MaceraOyunu;

import java.util.Scanner;

public abstract class Location {
    protected String Name;
    protected Player player;
    Scanner scanner = new Scanner(System.in);


    Location(Player player){
        this.setPlayer(player);
    }
    public abstract boolean getLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
