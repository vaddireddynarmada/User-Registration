import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        registration.validFirstName();
        registration.validLastName();
        registration.validPhoneNumber();
        registration.validEmail();
        registration.validPassword();
    }
    public void validFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid first name");
        System.out.println("First name starts with Capital and has minimum 3 characters");
        String firstName = sc.next();
        Pattern patternObject = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcherObject = patternObject.matcher(firstName);
        boolean name = matcherObject.matches();
        if (name) {
            System.out.println("Firstname : "+firstName);
        } else
            System.err.println("Invalid First Name");
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
            System.out.println("LastName : "+lastName);
        } else
            System.err.println(lastName + " is an Invalid last Name");
    }
    public void validEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid EmailId");
        System.out.println("Last name starts with Capital and has minimum 3 characters");
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
    public void validPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid PhoneNumber");
        System.out.println("Mobile Format - Country code follow by space and 10 digit number");
        String phoneNumber = sc.nextLine();
        String mobileNumber = "^[+][0-9]{2}\\s[0-9]{10}$";
        Pattern patternObject = Pattern.compile(mobileNumber);
        Matcher matcherObject = patternObject.matcher(phoneNumber);
        boolean number = matcherObject.matches();
        if (number) {
            System.out.println("PhoneNumber : "+phoneNumber);
        } else
            System.err.println(phoneNumber + " is an Invalid First Name");
    }
    public void validPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid password");
        System.out.println("Enter above 8 Characters and Should have at least 1 Upper Case and number and special character");
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