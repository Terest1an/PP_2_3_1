package web.model;

import java.util.List;

public class Car {
    private int id;
    private String model;
    private int series;


    public Car(int id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int date) {
        this.series = date;
    }

    @Override
    public String toString() {
        return "Автомобиль №" + id +
                " Лада " + model +
                " Серии " + series;
    }
}
