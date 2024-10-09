package cars;

// Class name
public class Car {

    // 'variables' for this class called members / attributes of the class
    // protected -- descendants can access but public cannot
    protected String make;
    protected String owner;
    protected String colour;
    protected int fuel = 100;

    // constructor is a special function with the same name as the class
    // used to initialise the object when it is instantiated
    public Car(){
        this.colour = "silver"; // this refers to the object
        this.make = "honda";
    }

    // overload constructor to provide different instantiation options
    public Car(String m){
        this.make = m;
    }

    public Car(String m, String c){
        this.make = m;
        this.make = c;
    }

    // encapsulation
    // Getters and setters -- functions to read and update the members
    // make property (read and write)
    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return this.make;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    // methods - behaviours
    public void info(){
        System.out.printf("Make: %s, Owner: %s, Colour: %s\n", this.make, this.owner, this.colour);
    }
    public void fuelGauge(){
        System.out.printf("FUEL: %d\n", this.fuel);
    }

    // overloaded method
    // --name is the same, different parameters or same parameters but different type
    public void go(){
        this.go(1, false);
        // go(1, false)
        // this.fuel -- ;
    }
    public void go (int distance){
        this.go(distance, false);
        // go(distance, false)
        // this.fuel -= distance;
    }
    public void go(String distance){
        this.go(Integer.parseInt(distance),false);
    }
    public void go(int distance, boolean turbo){
        if (turbo){
            this.fuel -= 2;
        }
        this.fuel -= distance;
    }

    public void accelerate(int acc){
        for (int i = 0; i < acc; i++){
            go(i+1);
        }
    }
}