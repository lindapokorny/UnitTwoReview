package com.example.lindapokorny.unittworeviewdayone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    PartyClass partyClass;

    @Before
    public void setUp() throws Exception {
        partyClass = new PartyClass();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_plus_one_method() {
        String fellow = "Kreyshawn";
        assertEquals(fellow + "plus 1", partyClass.plusOne(fellow));
    }
}

