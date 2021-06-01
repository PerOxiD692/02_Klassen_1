public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        ausgabe("name: " + cat1.tellYourAttributes("#name"));
        ausgabe("color: " + cat1.tellYourAttributes("#color"));
        ausgabe("age: " + cat1.tellYourAttributes("#age"));

        ausgabe("-----------------------------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35);
        ausgabe("name: " + cat2.tellYourAttributes("#name"));
        ausgabe("color: " + cat2.tellYourAttributes("#color"));
        ausgabe("age: " + cat2.tellYourAttributes("#age"));
    }

    public static void ausgabe (String outputStr){
         System.out.println(outputStr);
    }



}
