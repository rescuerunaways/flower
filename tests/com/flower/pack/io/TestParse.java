package com.flower.pack.io;

import com.flower.pack.excptions.CodeException;
import javafx.util.Pair;
import org.junit.Test;

import static com.flower.pack.io.Parser.parse;
import static org.junit.Assert.assertEquals;

public class TestParse {
    @Test()
    public void testParse() throws CodeException {
        Pair<String, Integer> result = new Pair<>("R12", 10);
        assertEquals(result, parse("10 R12"));
    }
}
