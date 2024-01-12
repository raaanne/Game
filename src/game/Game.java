
package game;


public class Game {

   
    public static void main(String[] args) {
//        Kucing kiran = new Kucing();
//        kiran.energi = 0;
//        kiran.kecepatan = 10;
//        kiran.ketinggian = 10;
//        kiran.nama = "Kazuha";
//        kiran.ras = "Anggora";
//        kiran.umur = 10;
//        
//        
//        kiran.walk_run();
//        kiran.belok_kanan();
//        kiran.belok_kiri();
//        kiran.berhenti();
//        kiran.makan();
//        kiran.melompat();
//        kiran.tidur();
    
    
    
       //Buat objek
       Player Hero = new Player();
       Player Enemy = new Player ();
       //Mmberi nilai atribut 
       Hero.name = "Dipia";
       Hero.speed = 20;
       Hero.healthPoin = 100;
       Hero.damage = 1000;
       Hero.armor = 100;
       
       // Enemy 
      Enemy.name = "Nirmaloy";
      Enemy.speed = 25;
      Enemy.healthPoin = 100;
      Enemy.damage = 100;
      Enemy.armor = 50;
      
      //Method
       Hero.run();
       if(Hero.isDead()){
           System.out.println(Hero.name + " is Dead, Game over :)");
       }
       Hero.attack();
        System.out.println(Hero.name + " Attacking " + Enemy.name);
        System.out.println(Enemy.name + " Attacking back " + Hero.name);
        Hero.defense();
        System.out.println(Hero.name + " Armor = 50 ");
        System.out.println(Hero.name + " Attack again to " + Enemy.name);
        System.out.println(Enemy.name + " HP = 0");
        System.out.println(Enemy.name + " is dead :( ");
    }
}
    
    
//    Drone kiran = new Drone();
//    kiran.energi = 20;
//    kiran.ketinggian = 100;
//    kiran.kecepatan = 60;
//    kiran.merek = "ipong";
//    
//    kiran.terbang();
//    kiran.matikanMesin();
//    kiran.turun();
//    kiran.belok();
//    kiran.maju();
//    kiran.mundur();
//}
