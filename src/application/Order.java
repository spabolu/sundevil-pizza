package application;

/**
 * Order status represented as an enum.
 */
enum Status {
    NULL,
    ACCEPTED,
    READY_TO_COOK,
    COOKING,
    READY
}

/**
 * The Order Class.
 */
public class Order {
    private int ID;
    private Status status;
    public Pizza pizza;

    double pickUpTime;
    double price;


    /**
     * Instantiates a new Order.
     */
    public Order() {
        this.ID = -1;
        this.status = Status.NULL;
        this.pickUpTime = 0.0;
        this.pizza = new Pizza();
        this.price = 0.0;
    }

    /**
     * Instantiates a new Order.
     *
     * @param ID         the id
     * @param pizza      the pizza
     * @param status     the status
     * @param pickUpTime the pick up time
     */
    public Order(int ID, Pizza pizza, Status status, double pickUpTime) {
        this.ID = ID;
        this.status = status;
        this.pickUpTime = pickUpTime;
        this.pizza = pizza;
        this.price = this.pizza.calculatePrice();
    }

    /**
     * Get status.
     *
     * @return the status
     */
    public Status getStatus(){
        return this.status;
    }

    /**
     * Set status.
     *
     * @param newStatus the new status
     */
    public void setStatus(Status newStatus){
        this.status = newStatus;
    }

    /**
     * Get id int.
     *
     * @return the int
     */
    public int getID(){
        return this.ID;
    }

    /**
     * Set id.
     *
     * @param newID the new id
     */
    public void setID(int newID){
        this.ID = newID;
    }

    /**
     * Update status.
     *
     * @param status the status
     * @return the status
     */
    public static Status updateStatus(Status status){
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
