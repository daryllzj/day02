package sdf;

public class CarMain {

    public static void main(String[] args) {
        
        Car c = new Car();
        c.setColor("Red");
        c.setRegistration("sdf123");
        c.start();
        System.out.printf("Is Car C started? %b\n", c.isStarted());

        Car d = new Car();
        System.out.printf("What is Car D's color? %s\n", d.getColor());

        Car e = new Car("123","Green");
        System.out.printf("What is Car E's color? %s\n", e.getColor());
        System.out.printf("What is Car E's registration? %s\n", e.getRegistration());


        Porche a = new Porche();
        System.out.printf("What is Porche's color? %s\n", a.getColor());
    }
    
}
