package org.Exercices.visteur;

public class Designer implements Inspectable {
    private double salaire = 5000;
    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        employeeVisitor.inspect(this);
    }
}
