
import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {
    public static void main(String[] args) {

        BrandController controller = new BrandController();

        Brand[] brands = TestData.createBrands();

        System.out.println("===== ORIGINAL =====");
        for (Brand b : brands) {
            System.out.println(b);
        }

        // Fila B → ascendente
        controller.sortSelectionAsc(brands);

        System.out.println("\n===== ORDENADO ASCENDENTE (Selection Sort) =====");
        for (Brand b : brands) {
            System.out.println(b);
        }

        // búsquedas fila B
        System.out.println("\n===== BUSQUEDAS FILA B =====");

        Brand r1 = controller.binarySearchByValidYears(brands, 7, true);
        System.out.println("\nBuscar 7 años válidos:");
        if (r1 != null)
            System.out.println("Encontrado: " + r1);
        else
            System.out.println("No encontrado");

        Brand r2 = controller.binarySearchByValidYears(brands, 5, true);
        System.out.println("\nBuscar 5 años válidos:");
        if (r2 != null)
            System.out.println("Encontrado: " + r2);
        else
            System.out.println("No encontrado");
    }
}
