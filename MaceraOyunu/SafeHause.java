package MaceraOyunu;

public class SafeHause extends NormalLoc{
    SafeHause(Player player) {
        super(player, "Güvenli Ev");
    }


    public boolean getLocation() {
        player.setHealty(player.getrHealty());
        System.out.println("Güvenli Eve Geldiniz");
        System.out.println("İyileştin");
        return true;
    }
}
