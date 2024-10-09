package cars;

public class MainToyota {
    
    public static void main(String[] args) {
        
        Toyota camry = new Toyota();

        camry.info();
        System.out.printf(">>> has GPS: %b\n", camry.isGps());

        camry.setMake("BMW");

        camry.fuelGauge();
        camry.go(5, true);
        camry.fuelGauge();
        camry.go(7,false);
        camry.fuelGauge();

        Car myCar = new Toyota();
        // cannot Toyota toyota = new Car(); 
        Fiat fiat = new Fiat();

        CarWorkshop workshop = new CarWorkshop();
        workshop.service(myCar);

        workshop.service(camry);
        workshop.service(fiat);

    }
}
