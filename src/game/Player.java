package game;

public class Player {
    //Atribut 
    String name;
    int speed, healthPoin, damage,armor;

    //Method
    void run() {
        System.out.println(name + " is run to find Nirmaloy");
        System.out.println("Speed = " + speed);
    }
    void attack(){
    System.out.println(name + " is attacking ...");
    System.out.println("Attack = " + damage);
   }
    void defense (){
    System.out.println(name + " is defense");
     System.out.println("Defense = " + armor);
} 
    boolean isDead() {
        if (healthPoin <= 0) 
            return true;
      return false;
    }
}
