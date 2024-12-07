class Mobile {
    String namer; 
    int price; 
    static String type; 

    static {
        type = "android"; 
        System.out.println("Static block is loaded");
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile"); 
    }
}