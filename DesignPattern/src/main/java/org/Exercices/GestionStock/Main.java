package org.Exercices.GestionStock;

public class Main {
    public static void main(String[] args) {
        Product productionGPU = new Product();

        StockManager chef = new StockManager();
        Supplier fournisseur1 = new Supplier();
        Supplier fournisseur2 = new Supplier();

        productionGPU.registerObserver(chef);
        productionGPU.registerObserver(fournisseur1);
        productionGPU.registerObserver(fournisseur2);

        productionGPU.changeStockProduct(15);
        productionGPU.changeStockProduct(23);
        productionGPU.changeStockProduct(18);
        productionGPU.changeStockProduct(2);
        productionGPU.changeStockProduct(16);

        productionGPU.removeObserver(fournisseur2);

        productionGPU.changeStockProduct(15);
        productionGPU.changeStockProduct(14);
        productionGPU.changeStockProduct(15);
        productionGPU.changeStockProduct(15);
        productionGPU.changeStockProduct(16);
        productionGPU.changeStockProduct(17);


    }
}
