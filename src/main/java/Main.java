import singleton.EagerInitializedSingleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton anotherSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());

    }
}