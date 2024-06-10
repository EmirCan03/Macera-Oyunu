package MaceraOyunu;

import java.util.Random;

public class Obstacle {
    private String mName;
    private int Damage;
    private int Healty;
    private int maxNumber;
    private int Award;    // ödül

    private String Attack;

    Obstacle(String mName,int Damage,int Healty,int maxNumber,int Award,String Attack){
        this.mName = mName;
        this.Damage = Damage;
        this.Healty = Healty;
        this.maxNumber = maxNumber;
        this.Award = Award;
        this.setAttack(Attack);
    }

    public int obstacleCount(){
        Random r = new Random();
        return r.nextInt(this.maxNumber)+1;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getHealty() {
        return Healty;
    }

    public void setHealty(int healty) {
        Healty = healty;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getAward() {
        return Award;
    }

    public void setAward(int Award) {
        this.Award = Award;
    }

    public String getAttack() {
        return Attack;
    }

    public void setAttack(String attack) {
        Attack = attack;
    }
}
