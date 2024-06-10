package MaceraOyunu;

public abstract class NormalLoc extends Location{

    NormalLoc(Player player, String Name) {
        super(player);
        this.Name = Name;
    }
    public boolean getLocation(){
        return true;
    }
}
