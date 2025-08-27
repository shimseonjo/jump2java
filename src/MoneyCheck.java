import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> pocket  = new ArrayList<>();
        pocket.add("2000");
        pocket.add("card");
//       int money =2000;
//       boolean hasCard = true;
       if( pocket.contains("card")){
           System.out.println("택시");
       } else if (Integer.parseInt(pocket.get(0))>= 3000) {
           System.out.println("택시");
       } else {
           System.out.println("걸어간다.");
       }
    }
}
