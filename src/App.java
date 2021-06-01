public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        System.out.println("name: " + cat1.tellYourAttributes("#name"));
        System.out.println("color: " + cat1.tellYourAttributes("#color"));
        System.out.println("age: " + cat1.tellYourAttributes("#age"));

        System.out.println("-----------------------------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35);
        System.out.println("name: " + cat2.tellYourAttributes("#name"));
        System.out.println("color: " + cat2.tellYourAttributes("#color"));
        System.out.println("age: " + cat2.tellYourAttributes("#age"));
    }
}
