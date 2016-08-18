package com.example.user.eightball;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleStringsTest {

    @Test
    public void getAnswersTest() {
        Answers answers = new AnswersFromSimpleStrings();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void getAnswersTest2() {
        Answers answers = new AnswersFromSimpleStrings();
        assertEquals(2, answers.getLength());
    }

    @Test
    public void getLengthTestWhenEmpty() {
        Answers answers = new AnswersFromSimpleStrings();
        assertEquals(0, answers.getLength());
    }

    @Test
    public void getLengthTest() {
        Answers answers = new AnswersFromSimpleStrings();
        answers.addAnswers("hi");
        answers.addAnswers("hello");

        assertEquals(2, answers.getLength());
    }

    @Test
    public void getAnswersAtIndexTest() {
        Answers answers = new AnswersFromSimpleStrings();
        answers.addAnswers("hi");
        answers.addAnswers("hello");

        assertEquals("hello", answers.getAnswerAtIndex(1));
    }

    @Test
    public void getAnswersTestWhenPassingArraylist() {
        ArrayList<String> otherAnswers = new ArrayList<>();
        otherAnswers.add("hi");
        otherAnswers.add("hello");
        Answers answers = new AnswersFromSimpleStrings(otherAnswers);
        assertEquals("hello", answers.getAnswerAtIndex(1));
    }
}
