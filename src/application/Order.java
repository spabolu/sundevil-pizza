package application;

enum Status {
    NULL,
    ACCEPTED,
    READY_TO_COOK,
    COOKING,
    READY
}

public class Order {
    private int ID;
    private Status status;
    private final Pizza pizza;

    double pickUpTime;
    double price;


    public Order() {                            //NULL constructor
        this.ID = -1;
        this.status = Status.NULL;
        this.pickUpTime = 0.0;
        this.pizza = new Pizza();
        this.price = 0.0;
    }

    public Order(int ID, Pizza pizza, Status status, double pickUpTime) {
        this.ID = ID;
        this.status = status;
        this.pickUpTime = pickUpTime;
        this.pizza = pizza;
        this.price = this.pizza.calculatePrice();
    }

    //Getters and Setters - Lines 37-49
    public Status getStatus(){
        return this.status;
    }
    public void setStatus(Status newStatus){
        this.status = newStatus;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int newID){
        this.ID = newID;
    }



    public Status updateStatus(Status status){
        switch(status) {
            case NULL:
                System.out.println("No order to update");
                break;
            case ACCEPTED:
                status = Status.READY_TO_COOK;
                break;
            case READY_TO_COOK:
                status = Status.COOKING;
                break;
            case COOKING:
                status = Status.READY;
                break;
            case READY:
                System.out.println("Order is ready and cannot be updated");
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }
        return status;
    }
}
