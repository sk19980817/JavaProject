package Chapter7;

public class Cat {
    int age;
    String name,color;
//    Dog dog1;
    Cat(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void Show(){
        System.out.println(name+age+color);
    }
}
//class Dog{
//
//}
