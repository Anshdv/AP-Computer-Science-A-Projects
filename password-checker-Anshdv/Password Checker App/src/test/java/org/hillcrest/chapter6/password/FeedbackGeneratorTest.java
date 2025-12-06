package test.java.org.hillcrest.chapter6.password;

import main.java.org.hillcrest.chapter6.password.FeedbackGenerator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FeedbackGeneratorTest {
    @Test
    public void lengthFeedbackTest() {
        String myPassword = "$We1";
        String actual = FeedbackGenerator.generateFeedback(myPassword);
        String expected = "\t- Increase the length to at least 8 characters.\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lowercaseLetterFeedbackTest() {
        String myPassword = "$WE12345";
        String actual = FeedbackGenerator.generateFeedback(myPassword);
        String expected = "\t- Add at least one lowercase letter.\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uppercaseLetterFeedbackTest() {
        String myPassword = "$we12345";
        String actual = FeedbackGenerator.generateFeedback(myPassword);
        String expected = "\t- Add at least one uppercase letter.\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberFeedbackTest() {
        String myPassword = "$We#####";
        String actual = FeedbackGenerator.generateFeedback(myPassword);
        String expected = "\t- Add at least one number.\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void specialCharacterFeedbackTest() {
        String myPassword = "We123456";
        String actual = FeedbackGenerator.generateFeedback(myPassword);
        String expected = "\t- Include at least one special character.\n";
        Assert.assertEquals(expected, actual);
    }
}
