package web.model;


public class Cars {
    private String model;
    private String engine;
    private int stateNumber;

    public Cars(String model, String engine, int stateNumber) {
        this.model = model;
        this.engine = engine;
        this.stateNumber = stateNumber;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", stateNumber=" + stateNumber +
                '}';
    }
}
