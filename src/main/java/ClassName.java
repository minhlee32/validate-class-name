import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX = "^[ACP]([A-Za-z0-9]){4}[G-M]$";

    private static final String[] validName = new String[]{" C0318G"};
    private static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public ClassName() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
