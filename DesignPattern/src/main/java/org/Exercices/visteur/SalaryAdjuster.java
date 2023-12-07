package org.Exercices.visteur;

public class SalaryAdjuster implements EmployeeVisitor {
    @Override
    public void inspect(Manager manager) {
        System.out.println("mise à jour salaire manager");
    }

    @Override
    public void inspect(Developper developper) {
        System.out.println("mise à jour salaire developpeur");
    }

    @Override
    public void inspect(Designer designer) {
        System.out.println("mise à jour salaire designer");
    }
}
