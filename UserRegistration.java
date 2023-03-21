import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration firstName = new UserRegistration();
        firstName.validFirstName();
    }
    public void validFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid first name");
        System.out.println("First name starts with Capital and has minimum 3 characters");
        String firstName = sc.next();
        String firstNameRegex = "^[A-Z][a-z]{3,}";
        Pattern patternObject = Pattern.compile(firstNameRegex);
        Matcher matcherObject = patternObject.matcher(firstName);
        boolean name = matcherObject.matches();
        if (name) {
            System.out.println("Firstname : "+firstName);
        } else
            System.err.println("Invalid First Name");
    }

}