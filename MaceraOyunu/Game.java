package MaceraOyunu;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scann =new Scanner(System.in);

    public void Login(){
        Scanner scann =new Scanner(System.in);
        System.out.println("******   MACERA OYUNUNA HOŞGELDİN   ******");
        System.out.print(" İsmini Gir : ");
        String Name = scann.next();
        player =new Player(Name);
        player.selectCha();
        Start();
    }

    public void Start(){
        while (true){
            System.out.println();
            System.out.println("<=======================>");
            System.out.println();
            System.out.println("Gidebileceğin Yerler ");
            System.out.println();
            System.out.println("1-GÜVENLİ EV ---> Sana ait güvenli bir mekan. Düşman yok!");
            System.out.println("2-MAĞARA ---> Seni bir zombi karşılayabilir!");
            System.out.println("3-ORMAN ---> Karşına vampir çıkabilir. Dikkati ol!");
            System.out.println("4-NEHİR ---> Ayılarla savaşmak için iyi bir mekan!");
            System.out.println("5-MAĞAZA ---> Silah veya zırh almak için buraya gel.");
            System.out.print("Nereye Gitmek İstersin :");
            int selectLoc = scann.nextInt();

            while (selectLoc < 1 || selectLoc > 5){
                System.out.print("Geçerli Bir Yer Seç");
                selectLoc = scann.nextInt();

            }
            switch (selectLoc){
                case 1:
                    location = new SafeHause(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHause(player);
            }
            if (location.getClass().getName().equals("SafeHause")){
                if (player.ınventory.isFood() && player.ınventory.isWater() && player.ınventory.isFirewood()){
                    System.out.println("OYUNU KAZANDIN :) " + player.getName());
                    break;
                }
            }
            if (!location.getLocation()){
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
