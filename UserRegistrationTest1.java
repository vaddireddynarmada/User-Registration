import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest1 {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validName("Narma");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("narma");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("As");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenNull_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenNumericCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("xuyz22");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenSpecialCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Dsfs@%");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validName("Sdfd");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("dft");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {

        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Ch");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenEmpty_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenNumericCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Chadag19");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenLastName_WhenSpecialCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("Ch@d@ga%");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validEmail("ashikachadaga@gmail.com");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validEmail("abc()*@gmail.com");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenNull_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validEmail(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validEmail("");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validMobileNumber("91 9485736453");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber("919485736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber("91 5736453");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber(null);
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validMobileNumber("");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("9a 948375053h");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean isNotValid = userValidator.validName("#6 948375*535");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.validPassword("AshikaCh@dag11");
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

