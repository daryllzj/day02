package sdf;

public class CarMain2 {
    
    public static void main(String[] args) {
        Porche p;

        Car c = new Porche("pink","s1222");

        System.out.println(c.getColor());

        System.out.printf(">>> registration: %s\n", c.getRegistration());

        p = (Porche)c;
        p.accelerate();

        System.out.printf(">>> acceleration: %d\n", p.getAccelerate());

        c = new Car();
        p = (Porche)c;
        p.accelerate();
    }
}
