package streams_terminal;

import data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
    }

    public static long countWithFilterCondition() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter((student) ->
                {
                    if (student.getGpa() > 3.8) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Total Students in StudentDatabase: " + count());

        System.out.println("Total Students in StudentDatabase with Gpa Filter: " + countWithFilterCondition());
    }
}
