package main.java.org.hillcrest.chapter11.studentgrader;
import java.io.IOException;

/**
 * Custom exception used for handling erroneous data
 */
public class BadDataException extends IOException {
    /**
     * Creates a BadException
     * @param message the message detailing the error
     */
    public BadDataException(String message){
        super(message);
    }
}
