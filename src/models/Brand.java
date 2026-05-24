package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] models;

  public String getBrandName() {
    return brandName;
  }

  public CarModel[] getModels() {
    return models;
  }

  public void setBrand(String brandName) {
    this.brandName = brandName;
  }

  public void setModels(CarModel[] models) {
    this.models = models;
  }

  public Brand(String brandName, CarModel[] models) {
    this.brandName = brandName;
    this.models = models;
  }

  @Override
  public String toString() {
    return "Brand [brand=" + brandName + ", models=" + Arrays.toString(models) + "]";
  }

  public int getTotalValidYears() {
    int total = 0;
    int i = 0;

    while (i < this.models.length) {
      CarModel modelo = this.models[i];
      int j = 0;

      while (j < modelo.getYears().length) {
        CarYear year = modelo.getYears()[j];

        if (year.isValid()) {
          total = total + 1;
        }

        j = j + 1;
      }

      i = i + 1;
    }

    return total;
  }

}