package controllers;

import models.Brand;

public class BrandController {
    public Brand[] sortSelectionAsc(Brand[] brands) {
        int n=brands.length;
        for (int i =0; i<n-1;i++){
            int indicemin=i;
            for (int j=i+1; j<n;j++){
                if (brands[indicemin].getTotalValidYears() > brands[j].getTotalValidYears()){
                    Brand aux=brands[j];
                    brands[j]=brands[indicemin];
                    brands[indicemin]=aux;
                }
            }

        }
        return brands;
    }
    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
        int inicio = 0;
        int fin = brands.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int anosMedio = brands[medio].getTotalValidYears();

            if (anosMedio == validYears) {
                return brands[medio]; // Éxito: Encontró la marca
            }

            if (isAscending) {
                // Lógica para orden ascendente
                if (anosMedio > validYears) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            } else {
                // Lógica para orden descendente
                if (anosMedio > validYears) {
                    inicio = medio + 1; // Completado por ti en el paso anterior
                } else {
                    fin = medio - 1; // Completado por ti en el paso anterior
                }
            }
        }
        return null; // No se encontró la marca
    }
}