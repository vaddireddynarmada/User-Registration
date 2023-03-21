import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration emailId = new UserRegistration();
        emailId.validEmailId();
    }

    public void validEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid EmailId");
        String email = sc.next();
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcherObject = patternObject.matcher(email);
        boolean emailId = matcherObject.matches();
        if (emailId) {
            System.out.println("EmailId : "+email);
        } else
            System.err.println("Invalid email id");
    }
}