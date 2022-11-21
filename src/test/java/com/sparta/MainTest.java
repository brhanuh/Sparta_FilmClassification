package com.sparta;


import org.example.FilmClassifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {-40, 500, -1})
    @DisplayName("Returns correct classification where is not correct")
    public void incorrectAge(int age){
        String expected = "Age does not exist";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 0, 1})
    @DisplayName("Returns correct classification for people under 4")
    public void under4Classifications(int age){
        String expected = "No films are available.";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 6})
    @DisplayName("Returns correct classification for people under 12")
    public void under8Classifications(int age){
        String expected = "U films are available";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {9, 11, 8})
    @DisplayName("Returns correct classification for people under 12")
    public void under12Classifications(int age){
        String expected = "U, PG films are available.";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {14, 12, 13})
    @DisplayName("Returns correct classification for people between 12 and under 15")
    public void over12Under15(int age){
        String expected = "U, PG, 12A, 12 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 17, 16})
    @DisplayName("Returns correct classification for people under 18")
    public void peopleUnder18(int age){
        String expected = "U, PG, 12A, 12, 15 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {150, 45, 18})
    @DisplayName("Returns correct classification for people over 18")
    public void over18(int age){
        String expected = "All films are available.";
        String result = FilmClassifications.availableClassifications(age);
        System.out.println(age);
        Assertions.assertEquals(expected, result);
    }
}
