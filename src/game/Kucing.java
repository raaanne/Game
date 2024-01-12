
package game;


public class Kucing {
    //atribut
    String nama;
    String ras;
    int umur, kecepatan, ketinggian, energi;
    
    //method
    void walk_run(){
        energi--;
        if(energi > 0 && energi < 5){
            energi++;
            System.out.println("Kucing berjalan...");
        } 
        else if (energi > 6){
           energi++;
            System.out.println("Kucing berlari...");
        }
    }
    void melompat(){
        ketinggian--;
        if(ketinggian > 5){
            ketinggian++;
            System.out.println("Kucing melompat");
        } else {
            System.out.println("Kucing takut untuk melompat");
        }
    }
     void berhenti(){
        if(kecepatan < 0){
            System.out.println("Kucing berhenti");
        } else {
            System.out.println("Kucing tetap berlari/berjalan");
        }
    }
     void belok_kanan(){
         energi--;
         System.out.println("Kucing belok kanan");
     }
     void belok_kiri(){
         energi--;
         System.out.println("Kucing belok kiri");
     }
     void tidur(){
         energi--;
         if(energi < 0){
             System.out.println("Kucing kelelahan lalu tidur");
         } else {
             System.out.println("Kucing tidak mau tidur");
         }
     }
     void makan(){
         energi--;
         if(energi < 0){
             System.out.println("Kucing makan karena kelelahan");
         } else {
             System.out.println("Kucing tetap bermain");
         }
     }
     
}
