package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {
    int n = brands.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
          Brand temp = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = temp;
        }
      }
    }
    return brands;
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int izquierda = 0;
    int derecha = brands.length - 1;
    Brand brand = null;
    int buscando = 1;

    while (izquierda <= derecha) {
      if (buscando == 1) {
        int medio = izquierda + (derecha - izquierda) / 2;
        int years = brands[medio].getTotalValidYears();

        if (years == validYears) {
          brand = brands[medio];
          buscando = 0;
        } else {
          if (isAscending) {
            if (years < validYears) {
              izquierda = medio + 1;
            } else {
              derecha = medio - 1;
            }
          } else {
            if (years < validYears) {
              derecha = medio - 1;
            } else {
              izquierda = medio + 1;
            }
          }
        }
      } else {
        izquierda = derecha + 1;
      }
    }

    return brand;
  }

  

}