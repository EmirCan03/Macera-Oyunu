package MaceraOyunu;

public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    protected String Award;
    BattleLoc(Player player, String Name, Obstacle obstacle,String Award) {
        super(player);
        this.obstacle = obstacle;
        this.Name = Name;
        this.Award = Award;
    }


    public boolean getLocation() {
        int obsCount = obstacle.obstacleCount();
        System.out.println("Konumunuz : " + getName());
        System.out.println("Burada " + obsCount + " tane " + obstacle.getmName() + " yaşıyor! ");
        System.out.print("<S>avaş ya da <K>aç ");
        String selCase = scanner.next();
        selCase = selCase.toUpperCase();


        if (selCase.equals("S")) {

            if (Combat(obsCount)) {
                System.out.println(this.getName() + " bölgesindeki bütün " + obstacle.getmName() + "leri öldürdünüz.");
                if (this.Award.equals("Yiyecek") && player.ınventory.isFood() == false) {
                    System.out.println(this.Award + " Kazandınız.");
                    player.ınventory.setFood(true);
                }else if (this.Award.equals("Su") && player.ınventory.isWater() == false) {
                    System.out.println(this.Award + " Kazandınız.");
                    player.ınventory.setWater(true);
                }else if (this.Award.equals("Yakacak Odun") && player.ınventory.isFirewood() == false) {
                    System.out.println(this.Award + " Kazandınız.");
                    player.ınventory.setFirewood(true);
                }

                return true;
            } if (player.getHealty() < 0){
                System.out.println(obstacle.getmName() + " Canına Okudu! Öldün");
                return false;
            }
        }
        if (selCase.equals("K")) {
            System.out.println("Korkak Davrandın");
            return true;
        }

        return true;
    }

    public boolean Combat(int obsCount){
        for (int i=0;i < obsCount; i++ ){
            int defObsHealty = obstacle.getHealty();
            playerStats();
            enemyStats();
            while (player.getHealty()>0 && obstacle.getHealty()>0){
                System.out.println("<V>ur ya da <K>aç ");
                String selCase = scanner.next();
                selCase = selCase.toUpperCase();
                if (selCase.equals("V")){
                    System.out.println(player.getAttack());
                    obstacle.setHealty(obstacle.getHealty() - player.getTotalDamage());
                    afterHit();
                    if (obstacle.getHealty() > 0 ) {
                        System.out.println();
                        System.out.println(obstacle.getAttack());
                        player.setHealty(player.getHealty() - (obstacle.getDamage() - player.ınventory.getArmor()));
                        afterHit();
                    }
                    }else {
                        return false;
                }
            }if (obstacle.getHealty() < 0 && player.getHealty() > 0){
                System.out.println(obstacle.getmName() + " Öldü.");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Para : " + player.getMoney());
                obstacle.setHealty(defObsHealty);
            }else {
                return false;
            }
            System.out.println("--------------------");
        }
        return true;
    }
    public void playerStats(){
        System.out.println("\n" + player.getcName() + " Değerleri\n---------");
        System.out.println("Hasar : " + player.getTotalDamage());
        System.out.println("Sağlık : " + player.getHealty());
        System.out.println("Para : " + player.getMoney());
        if (player.ınventory.getDamage() > 0 ){
            System.out.println("Silahın : " + player.ınventory.getwName());
        }else {
            System.out.println("Silahın Yok");
        }if (player.ınventory.getArmor() > 0){
            System.out.println("Zırh : " + player.ınventory.getaName());
        }else {
            System.out.println("Zırhın Yok");
        }
    }
    public void enemyStats(){
        System.out.println("\n" + obstacle.getmName() + " Değerleri\n---------");
        System.out.println("Hasar : " + obstacle.getDamage());
        System.out.println("Sağlık : " + obstacle.getHealty());
        System.out.println("Ödül : " + obstacle.getAward());
    }

    public void afterHit(){
        System.out.println(player.getcName() + " Canı : " + player.getHealty());
        System.out.println(obstacle.getmName() + " Canı : " + obstacle.getHealty());
        System.out.println();

    }
}
