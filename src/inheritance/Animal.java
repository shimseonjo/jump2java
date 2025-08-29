package inheritance;

public class Animal {
    protected String name;
    protected int age;
    void setName(String name){
      this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
}
