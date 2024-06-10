package MaceraOyunu;

public class Inventory {
    private boolean Water;
    private boolean Firewood;
    private boolean Food;
    private String wName;
    private String aName;     // silah ve zırh ismi
    private int Damage;
    private int Armor;

    Inventory(){
        setWater(false);
        setFirewood(false);
        setFood(false);
        setwName(null);
        setaName(null);
        setDamage(0);
        setArmor(0);
    }


    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }

    public boolean isFirewood() {
        return Firewood;
    }

    public void setFirewood(boolean firewood) {
        Firewood = firewood;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }
}
