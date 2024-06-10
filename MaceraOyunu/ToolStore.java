package MaceraOyunu;

public class ToolStore extends NormalLoc {

    ToolStore(Player player) {
        super(player, "MAĞAZA");
    }


    public boolean getLocation() {
        System.out.println("Para : " + player.getMoney());
        System.out.println("1-Silahlar ");
        System.out.println("2-Zırhlar ");
        System.out.println("3-Çıkış ");
        System.out.print("Seç : ");
        int selTool = scanner.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                selItemID = weopenMenu();
                buyWeopen(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
        }
        return true;
    }

    public int weopenMenu() {
        System.out.println("1-Tabanca\t <Hasar : 2 - Para 25>");
        System.out.println("2-Kılıç  \t <Hasar : 3 - Para 35>");
        System.out.println("3-Tüfek  \t <Hasar : 7 - Para 45>");
        System.out.println("4-Çıkış");
        System.out.print("Silah Seç : ");
        int selWeopenID = scanner.nextInt();
        return selWeopenID;
    }

    public void buyWeopen(int ItemID) {
        int Damage = 0, Price = 0;
        String wName = null;

        switch (ItemID) {
            case 1:
                wName = "Tabanca ";
                Damage = 2;
                Price = 25;
                break;
            case 2:
                wName = "Kılıç  ";
                Damage = 3;
                Price = 35;
                break;
            case 3:
                wName = "Tüfek  ";
                Damage = 7;
                Price = 45;
                break;
            case 4:
                System.out.println("Çıkış Yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz sayı ");
                break;
        }
        if (Price > 0) {                            // Geçersiz sayı yazdırdıktan sonra bu koda geçmesin diye
            if (player.getMoney() >= Price) {
                player.ınventory.setwName(wName);
                player.ınventory.setDamage(Damage);
                player.setMoney(player.getMoney() - Price);
                System.out.println(wName + " Satın Aldınız" + " <Eski Hasar " + player.getDamage() + " Yeni Hasar " + player.getTotalDamage() + ">");
                System.out.println("Para : " + player.getMoney());
            } else {
                System.out.println("Paran Yetersiz");
            }
        }
    }

        public int armorMenu(){
            System.out.println("1-Hafif Zırh\t <Engellenen Hasar : 1 - Para 15>");
            System.out.println("2-Orta Zırh \t <Engellenen Hasar : 3 - Para 25>");
            System.out.println("3-Ağır Zırh \t <Engellenen Hasar : 5 - Para 40>");
            System.out.println("4-Çıkış");
            System.out.print("Zırh Seç : ");
            int selWeopenID = scanner.nextInt();
            return selWeopenID;
        }

        public void buyArmor(int ItemID){
            int Avoid = 0, Price = 0;
            String aName = null;

            switch (ItemID) {
                case 1:
                    aName = "Hafif Zırh ";
                    Avoid = 1;
                    Price = 15;
                    break;
                case 2:
                    aName = "Orta Zırh ";
                    Avoid = 3;
                    Price = 25;
                    break;
                case 3:
                    aName = "Ağır Zırh  ";
                    Avoid = 5;
                    Price = 40;
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz sayı ");
                    break;
            }
            if (Price > 0) {                            // Geçersiz sayı yazdırdıktan sonra bu koda geçmesin diye
                if (player.getMoney() >= Price) {
                    player.ınventory.setaName(aName);
                    player.ınventory.setArmor(Avoid);
                    player.setMoney(player.getMoney() - Price);
                    System.out.println(aName + " Satın Aldınız" + " Engellenen Hasar " + player.ınventory.getArmor());
                    System.out.println("Para : " + player.getMoney());
                } else {
                    System.out.println("Paran Yetersiz");
                }
            }
        }
}