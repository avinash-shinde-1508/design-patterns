import com.techgeeks.creational.singleton.CompleteSingletonImplementation;
import com.techgeeks.creational.singleton.DoubleCheckedLockingSingletonImplementation;
import com.techgeeks.creational.singleton.SimpleSingletonImplementation;
import com.techgeeks.creational.singleton.ThreadSafeSingletonImplementation;

public class Main {
    public static void main(String[] args) {

        // Test singleton implementation
        CompleteSingletonImplementation instance = CompleteSingletonImplementation.getInstance("singleton");
        System.out.println(instance.hashCode());
        CompleteSingletonImplementation instance2 = CompleteSingletonImplementation.getInstance("singleton2");
        System.out.println(instance2.hashCode());

    }
}