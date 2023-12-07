package org.Exercices.visteur;

public class Main {
    public static void main(String[] args) {

        Manager roger = new Manager();
        Developper fabrice = new Developper();
        Designer steeve = new Designer();

        PerformanceEvaluator bob = new PerformanceEvaluator();
        SalaryAdjuster john = new SalaryAdjuster();

        roger.accept(bob);
        roger.accept(john);

        fabrice.accept(bob);
        fabrice.accept(john);

        steeve.accept(bob);
        steeve.accept(john);
    }
}
