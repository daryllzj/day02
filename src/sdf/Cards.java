package sdf;

public class Cards {

    private String suit;
    private String name;
    private Integer value;

    public Cards(String suit, String name, Integer value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }
    public String getSuit() {
        return suit;
    }
    public String getName() {
        return name;
    }
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Cards [suit=%s , name= %s, value=%d \n".formatted(this.suit, this.name, this.value);
    }

    

    
    
}
