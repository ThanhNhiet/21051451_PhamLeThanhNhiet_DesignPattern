import singleton.EagerInitializedSingleton;
import singleton.LazyInitializedSingleton;
import singleton.StaticBlockSingleton;
import singleton.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
//        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton anotherSingleton = EagerInitializedSingleton.getInstance();
//        System.out.println(singleton.hashCode());
//        System.out.println(anotherSingleton.hashCode());

//        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton anotherSingleton = StaticBlockSingleton.getInstance();
//        System.out.println(singleton.hashCode());
//        System.out.println(anotherSingleton.hashCode());

        //Dung nhieu
//        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton anotherSingleton = LazyInitializedSingleton.getInstance();
//        System.out.println(singleton.hashCode());
//        System.out.println(anotherSingleton.hashCode());


        new Thread(() -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }).start();
        new Thread(() -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }).start();

    }
}