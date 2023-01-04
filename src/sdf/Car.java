package sdf;

public class Car{

    // members
    private String registration;
    private String color;
    private int year;
    private boolean started;

    // constructors

    public Car() {
        this.color = "white";
    }
    
    public Car(String registration, String color) {
        this.registration = registration;
        this.color = color;
    }


    // getters and setters
    public String getRegistration() {
        return registration;
    }
    
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isStarted() {
        return started;
    }

    // methods

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
        
    }
    
    public void getOutOfMyWay() {
        System.out.println("Get out of my way");
        
    }
    
    
    
}