import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration phoneNumber = new UserRegistration();
        phoneNumber.validPhoneNumber();
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
            System.err.println(phoneNumber + " is an Invalid phoneNumber");
    }
}