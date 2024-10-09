package cars;

// extends keyword to indicate that Toyota class is derived from Car
public class Toyota extends Car {

    private boolean gps = false;

    public Toyota(){
        setMake("Toyota");
    }

    // overriding - change the behaviour of method
    // --method signature (method name, type and ordering) is the same as the parent 
    @Override // annotation to tell java overriding -- compiler will generate error if signature is incorrect
    public void go(int d, boolean t){
        this.fuel -= d;
    }

    // @Override
    // public void setMake(String m){ }

    public boolean isGps() {return gps;}
    public void setGps(boolean gps){this.gps = gps;}
    
}
