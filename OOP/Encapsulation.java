class Human extends Object {
    private int age; 
    private String name; 

    public String getName(){
        return name; 
    }

    public int getAge() {
        return age; 
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n){
        name = n;
    }
}

public class Encapsulation{
    public static void main(String args[]) {
        Human obj = new Human(); 

        obj.setAge(20);
        obj.setName("Yash");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}