
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class UserRegistrationTest {
    @RunWith(Parameterized.class)
    public class UserRegistrationParameterizedTest {
        public String testEmail;
        public boolean expectedResult;
        public UserRegistration userValidator;

        public UserRegistrationParameterizedTest(String testEmail, boolean expectedResult) {
            this.testEmail = testEmail;
            this.expectedResult = expectedResult;
        }

        @Before
        public void initialize() {
            userValidator = new UserRegistration();
        }

        @Test
        public void givenEmailAddress_ShouldReturnAsExpected() {
            boolean testResult = userValidator.validEmail(testEmail);
            Assert.assertEquals(testResult, expectedResult);
        }

        @Parameterized.Parameters
        public static Collection input() {
            return Arrays.asList(new Object[][]{{"abc@bridgelabz.co.in", true}, {"abc@gmail.com.com", true},
                    {"abc@yahoo.com", true}, {"abc@1.com", true}, {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc-100@abc.net", true},
                    {"abc.100@abc.com.au", true}, {"abc+100@gmail.com", true},
                    {".abc@abc.com", false}, {"abc", false}, {"abc@.com.my", false}, {"abc@abc@gmail.com", false},
                    {"abc()*@gmail.com", false}, {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false},
                    {"abc123@.com", false}, {"abc123@.com.com", false}, {"abc123@gmail.a", false},
                    {"abc@%*.com", false}, {"abc@gmail.com.1a", false}, {".abc@gmail.com.aa.au", false}});
        }
    }
}
