public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        cat1.tellYourName();
        cat1.tellYourFurColor();
        cat1.tellYourAge();

        System.out.println("-----------------------------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35);
        cat2.tellYourName();
        cat2.tellYourFurColor();
        cat2.tellYourAge();
    }
}
