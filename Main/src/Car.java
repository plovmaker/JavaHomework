public class Car implements Motor, Wheel {
    private int position = 0;
    private float gas = 5;
    private String model;
    private int wheel = 210;

    public int getPosition() {
        return position;
    }
    public String Drive(int x) {
        position = position + x;
        gas = gas - (x/10);
        return "New position is: " + position;
    }
    public float getGas() {
        return gas;
    }
    public String fillGas(float x) {
        gas = gas + x;
        return "Tank Refilled";
    }
    public void changeWheel(int x) {
        wheel = x;
        System.out.println("Wheel changed");
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void getModel() {
        System.out.println("The model of this car is " + model);
    }
}
