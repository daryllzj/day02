package sdf;

public class Porche extends Car {

    private String turbo = "off";
    private int accelerate = 0;

    public Porche(){
        super.setColor("Red");
    }

    public Porche(String colour, String registration){
        setColor(colour);
        setRegistration(registration);
    }

    

    public String getTurbo(){
        return turbo;
    }

    public void accelerate(){
        this.accelerate ++;
        if (this.accelerate > 4){
            this.turbo = "on";
        }
    }

    public void deccelerate(){
        this.accelerate --;
        if (this.accelerate <= 4){
            this.turbo = "off";
        }
    }

    // not allowed to change colour
    @Override
    public void setColor(String c){}

    public int getAccelerate() {
        return accelerate;
    }


    
}
