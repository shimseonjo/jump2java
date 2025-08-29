package polymorphism;

public class Lion extends Animal implements Barkable{
    @Override
    public void bark() {
        System.out.println("Lion 어흥");
    }
}
