package WorkingWithExceptions;

public class Test {
    public static void main(String[] args) {
        boolean success = Data.validate("test","test!","test");
        if (success) {
            System.out.println("Data validation");
        } else {
            System.out.println("Data not validation");
        }
    }
}
