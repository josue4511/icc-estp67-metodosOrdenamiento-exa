package models;

import java.util.Arrays;

public class CarModel {
  private String modelName;
  private CarYear[] carYear;
  public CarModel(String modelName, CarYear[] carYear) {
    this.modelName = modelName;
    this.carYear = carYear;
  }
  public String getModelName() {
    return modelName;
  }
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }
  public CarYear[] getCarYear() {
    return carYear;
  }
  public void setCarYear(CarYear[] carYear) {
    this.carYear = carYear;
  }
  @Override
  public String toString() {
    return "CarModel [modelName=" + modelName + ", carYear=" + Arrays.toString(carYear) + "]";
  }
  
}