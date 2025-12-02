package models;

public class Brand {

    private String name;
    private CarModel[] models;

    public Brand(String name, CarModel[] models) {
        this.name = name;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public CarModel[] getModels() {
        return models;
    }

    @return

    número total
    de años
    con isValid = true

    public int getTotalValidYears() {
        int total = 0;

        if (models == null)
            return 0;

        for (CarModel m : models) {
            if (m.getYears() == null)
                continue;
            for (CarYear y : m.getYears()) {
                if (y.isValid())
                    total++;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return name + " - Años válidos: " + getTotalValidYears();
    }
}
