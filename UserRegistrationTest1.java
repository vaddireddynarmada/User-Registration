import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest1 {
    @Test
    public void givenFirstName_WhenNull_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenNull_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenEmpty_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenNull_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validEmail(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmailAddress_WhenEmpty_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validEmail("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNull_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validPassword(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenEmpty_ShouldThrowUserValidationException() {
        UserRegistration userValidator = new UserRegistration();
        try {
            userValidator.validPassword("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }
    }
}

