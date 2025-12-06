package test.java.org.hillcrest.chapter6.password;

import main.java.org.hillcrest.chapter6.password.CriteriaChecker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CriteriaCheckerTest {
    // criteria tests
    @Test
    public void lengthTest() {
        String myPassword = "$We1";
        int actual = CriteriaChecker.evaluateCriteria(myPassword);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lowercaseLetterTest() {
        String myPassword = "$WE12345";
        int actual = CriteriaChecker.evaluateCriteria(myPassword);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uppercaseLetterTest() {
        String myPassword = "$we12345";
        int actual = CriteriaChecker.evaluateCriteria(myPassword);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberTest() {
        String myPassword = "$We#####";
        int actual = CriteriaChecker.evaluateCriteria(myPassword);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void specialCharacterTest() {
        String myPassword = "We123456";
        int actual = CriteriaChecker.evaluateCriteria(myPassword);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    // strength tests
    @Test
    public void veryWeakTest() {
        int myPasswordScore = 1;
        String actual = CriteriaChecker.determineStrength(myPasswordScore);
        String expected = "Very Weak";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void weakTest() {
        int myPasswordScore = 2;
        String actual = CriteriaChecker.determineStrength(myPasswordScore);
        String expected = "Weak";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void moderateTest() {
        int myPasswordScore = 3;
        String actual = CriteriaChecker.determineStrength(myPasswordScore);
        String expected = "Moderate";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strongTest() {
        int myPasswordScore = 4;
        String actual = CriteriaChecker.determineStrength(myPasswordScore);
        String expected = "Strong";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void veryStrongTest() {
        int myPasswordScore = 5;
        String actual = CriteriaChecker.determineStrength(myPasswordScore);
        String expected = "Very Strong";
        Assert.assertEquals(expected, actual);
    }
}
