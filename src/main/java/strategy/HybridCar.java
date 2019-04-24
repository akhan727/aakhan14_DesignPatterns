package main.java.strategy;

/**
 * This class creates hybrid car objects with an engine, make, manufacturer, 
 * model, series, size class, and year. 
 **/
public class HybridCar {

    private String engine;
    private String make;
    private String manufacturer;
    private String model;
    private String series;
    private String sizeClass;
    private String year;

    public String getEngine() {

        return engine;
    }

    public void setEngine(String engine) {

        this.engine = engine;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getSeries() {

        return series;
    }

    public void setSeries(String series) {

        this.series = series;
    }
    
    public String getSizeClass() {

        return sizeClass;
    }

    public void setSizeClass(String sizeClass) {

        this.sizeClass = sizeClass;
    }

    public String getYear() {

        return year;
    }

    public void setYear(String year) {

        this.year = year;
    }
    
    /**
     * This method allows the client to print a single string detailing all the 
     * attributes of a HybridCar object.
     * @return String Returns a string of object's car attributes.
     **/
    public String toString() {

        return "  Make: " + make 
             + "\n Model: " + model
             + "\n  Year: " + year
             + "\nSeries: " + series
             + "\n Class: " + sizeClass
             + "\nEngine: " + engine + "\n";
    }
}