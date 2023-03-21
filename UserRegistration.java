import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration password = new UserRegistration();
        password.validPassword();
    }

    public void validPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid password");
        System.out.println("Enter above 7 Characters and Should have at least 1 Upper Case and number and special character");
        String password = sc.next();
        String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[&%$#@^*!~])(?=.*[a-z]).{8,}";
        Pattern patternObject = Pattern.compile(passwordRegex);
        Matcher matcherObject = patternObject.matcher(password);
        boolean validPassword = matcherObject.matches();
        if (validPassword) {
            System.out.println("Password : "+password);
        } else
            System.err.println("Invalid password");
    }
}