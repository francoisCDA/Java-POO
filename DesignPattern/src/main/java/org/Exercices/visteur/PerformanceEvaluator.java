package org.Exercices.visteur;

public class PerformanceEvaluator implements EmployeeVisitor{

    @Override
    public void inspect(Manager manager) {
        System.out.println("Quel est votre role dans cette entreprise ?");
    }

    @Override
    public void inspect(Developper developper) {
        System.out.println("Copilot produit moins de bug");
    }

    @Override
    public void inspect(Designer designer) {
        System.out.println("Midjourney est plus performant");
    }
}
