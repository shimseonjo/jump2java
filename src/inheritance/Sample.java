package inheritance;

public class Sample {
    public static void main(String[] args) {
        Dog houseDog = new HouseDog();
        houseDog.setName("harry");
        houseDog.setAge(10);

        HouseDog houseDog2 = new HouseDog("harry",2);

        houseDog.sleep();
    }
}
