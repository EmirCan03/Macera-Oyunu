package MaceraOyunu;

import java.util.Scanner;

public class Player {
    Inventory ınventory;
    private String Name;
    private String cName;
    private int rHealty;
    private int Damage;
    private int Healty;
    private int Money;
    private String Attack;

    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.setName(name);
        this.ınventory = new Inventory();

    }

    public void selectCha() {
       switch (chaMenu()) {
           case 1:
               initPlayer("Samuray",5,21,15,"Keskin Kılıç Saldırısı! ");
               break;
           case 2:
               initPlayer("Okçu",7,18,20,"Tam İsabet! ");
               break;
           case 3:
               initPlayer("Ninja",8,24,5,"Ninja Saldırsı");
               break;
           default:
               initPlayer("Samuray",5,21,15,"Keskin Kılıç Saldırsı! ");
               break;
       }
           System.out.println("Karakter : " + getcName() + ",\tHasar : " + getDamage() + ",\tSağlık : " + getHealty() + ",\tPara : " + getMoney());

        }

    public int chaMenu() {
        System.out.println("BİR KARAKTER SEÇİNİZ ");
        System.out.println("1-Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15 ");
        System.out.println("2-Okçu    \t Hasar : 7 \t Sağlık : 18 \t Para : 20 ");
        System.out.println("3-Ninja   \t Hasar : 8 \t Sağlık : 24 \t Para : 5 ");
        System.out.print("Karakter Seçiniz (1 ile 3 arasında) :");
        int chaID = scanner.nextInt();

        while (chaID < 1 || chaID > 3) {
            System.out.print("Lütfen 1 ile 3 arasında bir sayı giriniz ");
            chaID = scanner.nextInt();
        }
        return chaID;
    }
    public int getTotalDamage(){
        return this.getDamage()+ this.ınventory.getDamage();
    }

    public void initPlayer(String cName,int dmg,int healty,int mny,String atc){
        this.cName=cName;           // setcName(cName); de yapılabilir aynı şey
        this.Damage=dmg;
        this.Healty=healty;
        this.Money=mny;
        this.Attack=atc;
        this.rHealty=healty;        //reel healty hiç eksilip artmaz.
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
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

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rhealty) {
        this.rHealty = rhealty;
    }

    public String getAttack() {
        return Attack;
    }

    public void setAttack(String attack) {
        Attack = attack;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}