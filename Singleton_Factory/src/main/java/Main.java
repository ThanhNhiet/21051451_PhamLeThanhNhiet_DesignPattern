import factory.abstractFactory.Computer;
import factory.abstractFactory.implementsFactory.ComputerFactory;
import factory.abstractFactory.implementsFactory.PCFactory;
import factory.abstractFactory.implementsFactory.ServerFactory;
import singleton.EagerInitializedSingleton;
import singleton.LazyInitializedSingleton;
import singleton.StaticBlockSingleton;
import singleton.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
//        testSingleton();

        testAbstractFactory();
    }

    private static void testSingleton() {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton anotherSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());

        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

//        Dung nhieu
        LazyInitializedSingleton singleton3 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton singleton4 = LazyInitializedSingleton.getInstance();
        System.out.println(singleton3.hashCode());
        System.out.println(singleton4.hashCode());


        new Thread(() -> {
            ThreadSafeSingleton singleton5 = ThreadSafeSingleton.getInstance();
            System.out.println(singleton5.hashCode());
        }).start();
        new Thread(() -> {
            ThreadSafeSingleton singleton6 = ThreadSafeSingleton.getInstance();
            System.out.println(singleton6.hashCode());
        }).start();
    }

    private static void testAbstractFactory() {
        Computer pc =
                ComputerFactory.getComputer(new
                        PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server =
                ComputerFactory.getComputer(new
                        ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}