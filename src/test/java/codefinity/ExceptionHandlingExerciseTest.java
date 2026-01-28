package codefinity;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ExceptionHandlingExerciseTest {

    //ToDo: Pay attention to the test names
    // and implement tests that correspond to those names.
    // Each test should perform the function indicated by the test name."

    @Test
    public void checkAge_ShouldThrowIllegalArgumentException_WhenAgeIsLessThan18() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        int underage = 16;

        IllegalArgumentException error = assertThrows(IllegalArgumentException.class, () -> {
            exercise.checkAge(underage);
        });

        assertEquals("Access denied - You must be at least 18 years old.", error.getMessage());
    }

    @Test
    public void checkAge_ShouldNotThrowException_WhenAgeIs18OrMore() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();
        int ofage = 21;
        assertDoesNotThrow(() -> exercise.checkAge(ofage));
    }

    @Test
    public void printLength_ShouldThrowNullPointerException_WhenStringIsNull() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        String str = null;

        NullPointerException error = assertThrows(NullPointerException.class, () -> {
            exercise.printLength(str);
        });

        assertEquals("String value is null.", error.getMessage());

    }

    @Test
    public void printLength_ShouldNotThrowException_WhenStringIsNotNull() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        String str = "test";

        assertDoesNotThrow(() -> {
            exercise.printLength(str);
        });

    }
}
