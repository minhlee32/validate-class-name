import static org.junit.jupiter.api.Assertions.*;

class ClassNameTest {

    private static ClassName className;

    private static final String[] validName = new String[]{"C0318G", "C0618G"};
    private static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        boolean isValid;
        for (String name : validName) {
            isValid = className.validate(name);
            System.out.println("Class name " + name + " is " + isValid);
        }
        for (String name : invalidName) {
            isValid = className.validate(name);
            System.out.println("Class name " + name + " is " + isValid);
        }
    }
}