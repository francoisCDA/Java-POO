package org.Exercices.visteur;

public interface EmployeeVisitor {
        void inspect(Manager manager );

        void inspect(Developper developper);

        void inspect(Designer designer);
}
