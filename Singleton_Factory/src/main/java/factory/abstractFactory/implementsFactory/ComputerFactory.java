package factory.abstractFactory.implementsFactory;

import factory.abstractFactory.Computer;
import factory.abstractFactory.interfaceFactory.ComputerAbstractFactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
