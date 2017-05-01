package com.flower.pack.io;

import com.flower.pack.excptions.CodeException;
import com.flower.pack.model.Order;
import org.junit.Test;

import static com.flower.pack.io.Parser.parse;
import static org.junit.Assert.assertEquals;

public class ParseTest {
    @Test()
    public void testParse() throws CodeException {
        Order result = new Order(10, "R12");
        assertEquals(result, parse("10 R12"));
    }
}
