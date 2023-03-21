import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration lastName = new UserRegistration();
        lastName.validLastName();
    }

    public void validLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid last name");
        System.out.println("Last name starts with Capital and has minimum 3 characters");
        String lastName = sc.next();
        String lastNameRegex = "^[A-Z][a-z]{3,}";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        Matcher matcherObject = patternObject.matcher(lastName);
        boolean name = matcherObject.matches();
        if (name) {
            System.out.println("LastName : " + lastName);
        } else
            System.err.println(lastName + " is an Invalid last Name");
    }
}