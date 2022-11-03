package application;
enum Type{
    NULL,
    PEPPERONI,
    CHEESE,
    VEGGIE
}

public class Pizza {
    Type type;
    Boolean mush, olive, onion, cheese;

    public Pizza(){
        this.type = Type.NULL;

        this.mush = false;
        this.olive = false;
        this.onion = false;
        this.cheese = false;
    }

    public Pizza(Type type, Boolean mush, Boolean olive, Boolean onion, Boolean cheese){
        this.type = type;

        this.mush = mush;
        this.olive = olive;
        this.onion = onion;
        this.cheese = cheese;
    }

    public double calculatePrice(){
        double price = 0.0;
        if(this.type == Type.NULL){
           return 0.0;
        }

        if(this.mush) price += 0.5;
        if(this.olive) price += 0.5;
        if(this.onion) price += 0.5;
        if(this.cheese) price += 0.5;

        return price;

    }
}
