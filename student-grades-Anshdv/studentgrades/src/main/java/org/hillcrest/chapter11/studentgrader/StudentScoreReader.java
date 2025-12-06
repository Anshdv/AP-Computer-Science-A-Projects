package main.java.org.hillcrest.chapter11.studentgrader;
import java.util.ArrayList;

/**
 * Utility class to parse scores from a student's records file
 */
public class StudentScoreReader {
    /**
     * procedure to extract and parse all the data in the records
     * @param rawRecords the list of all the raw records
     * @return all the parsed records in a list
     * @throws BadDataException thrown when file cannot be parsed correctly
     */
    public static ArrayList<StudentRecord> parseRecords(ArrayList<String> rawRecords) throws BadDataException {
        if (rawRecords.isEmpty()) {
            throw new BadDataException("No records to parse");
        }

        int studentCount;
        try {
            studentCount = Integer.parseInt(rawRecords.getFirst());
        } catch (NumberFormatException e) {
            throw new BadDataException("Expected integer on first line");
        }

        ArrayList<StudentRecord> studentRecords = new ArrayList<>();
        int currentIndex = 1;

        for (int i = 0; i < studentCount; i++) {
            if (currentIndex >= rawRecords.size()) {
                throw new BadDataException("Data unexpectedly ended (expected more records)");
            }

            String name = rawRecords.get(currentIndex);
            currentIndex++;
            if (currentIndex >= rawRecords.size()) {
                throw new BadDataException("Data unexpectedly ended (expected more scores)");
            }

            int scoresCount;
            try {
                scoresCount = Integer.parseInt(rawRecords.get(currentIndex));
                currentIndex++;
            } catch (NumberFormatException e) {
                throw new BadDataException("Expected integer for score count");
            }

            if (currentIndex + scoresCount > rawRecords.size()) {
                throw new BadDataException("Data unexpectedly ended for student: " + name + " (expected more scores)");
            }

            ArrayList<Double> scores = new ArrayList<>();
            for (int j = 0; j < scoresCount; j++) {
                try {
                    double score = Double.parseDouble(rawRecords.get(currentIndex));
                    currentIndex++;
                    scores.add(score);
                } catch (NumberFormatException e) {
                    throw new BadDataException("Expected double for score");
                }
            }

            studentRecords.add(new StudentRecord(name, scores));
        }

        if (currentIndex != rawRecords.size()) {
            throw new BadDataException("Unexpected lines in data");
        }

        return studentRecords;
    }
}
