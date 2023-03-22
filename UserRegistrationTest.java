import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validName("Nar");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("nar");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Ab");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validName("Narmada");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("xyz");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Ch");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validEmail("narmada.vaddireddy97@gmail.com");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {

        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validEmail("abc()*@gmail.com");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validMobileNumber("91 9367938587");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber("919367938587");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber("91 5736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validPassword("xyz@");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validPassword("sd@A12");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validPassword("asjd23$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validPassword("asjdAG$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validPassword("asjd23^$df");
        Assert.assertFalse(isNotValid);
    }
}
