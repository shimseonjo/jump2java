package inheritance;

public class HouseDog extends Dog {
    HouseDog(){}
    HouseDog(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    void sleep(){
        super.sleep();
        System.out.println(this.name + " zzzzzzz");
    }
}
