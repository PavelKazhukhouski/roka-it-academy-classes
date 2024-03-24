package pl.roka.it.lesson8.task_8_5;


public abstract class KitchenAppliances implements HouseholdAppliances {

    private String brand;
    private String model;
    private boolean poweredOn;

    public KitchenAppliances(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void powerOn() {
        poweredOn = true;
        System.out.println(brand + " " + model + " switchedOn.");
    }

    @Override
    public void powerOff() {
        poweredOn = false;
        System.out.println(brand + " " + model + " switchedOff.");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public void cook() {
        if (poweredOn) {
            System.out.println("cook " + brand + " " + model + " switchedOn.");
        } else {
            System.out.println("can_t_cook " + brand + " " + model + " switchedOff.");
        }



    }
}