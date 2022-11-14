package application;

/**
 * The enum Type.
 */
enum Type{
    /**
     * Null type.
     */
    NULL,
    /**
     * Pepperoni type.
     */
    PEPPERONI,
    /**
     * Cheese type.
     */
    CHEESE,
    /**
     * Veggie type.
     */
    VEGGIE
}

/**
 * The Pizza Class.
 */
public class Pizza {
    /**
     * The Type.
     */
    public Type type;
    /**
     * The Mush.
     */
    public Boolean mush, /**
     * The Olive.
     */
    olive, /**
     * The Onion.
     */
    onion, cheese;

    /**
     * Instantiates a new Pizza.
     */
    public Pizza(){
        this.type = Type.NULL;

        this.mush = false;
        this.olive = false;
        this.onion = false;
        this.cheese = false;
    }

    /**
     * Instantiates a new Pizza.
     *
     * @param type   the type
     * @param mush   the mush
     * @param olive  the olive
     * @param onion  the onion
     * @param cheese the cheese
     */
    public Pizza(Type type, Boolean mush, Boolean olive, Boolean onion, Boolean cheese){
        this.type = type;

        this.mush = mush;
        this.olive = olive;
        this.onion = onion;
        this.cheese = cheese;
    }

    /**
     * Calculate price double based on pizza type and toppings.
     *
     * @return the price double
     */
    public double calculatePrice(){
        double price;
        switch(this.type){
            case PEPPERONI:
                price = 5.5;
                break;
            case CHEESE:
                price = 5.0;
                break;
            case VEGGIE:
                price = 7.0;
                break;
            case NULL:
                return 0.0;
            default:
                price = 0.0;
                break;
        }

        if(this.mush) price += 0.5;
        if(this.olive) price += 0.5;
        if(this.onion) price += 0.5;
        if(this.cheese) price += 0.5;

        return price;

    }

    /**
     * Formats formatted string for a certain pizza
     *
     * @return the String formatted as "<TYPE> Pizza w/ <TOPPING(S)>"
     */
    //Returns a formatted string for a pizza
    public String toString(){
        boolean edited = false;
        String returnVal = "";
        returnVal += this.type.toString();
        returnVal += "Pizza w/ ";
        if(this.mush){
            edited = true;
            returnVal += "Mushrooms, ";
        }
        if(this.cheese){
            edited = true;
            returnVal += "Cheese, ";
        }
        if(this.onion){
            edited = true;
            returnVal += "Onions, ";
        }
        if(this.olive){
            edited = true;
            returnVal += "Olives, ";
        }
        returnVal = returnVal.trim();
        if(edited){
            returnVal = returnVal.substring(0, returnVal.length() - 1);
        }else{
            returnVal = returnVal.substring(0, returnVal.length() - 2);
        }
        return returnVal;
    }
}