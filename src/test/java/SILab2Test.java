import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    private List<String> createList(String...elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }



    @Test
    void everyStatement_193028(){
        RuntimeException exception = null;

        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList("0","#","0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertNotNull(SILab2.function(createList("0","#","0","0","0","#","0","#","#")));

        assertNotNull(SILab2.function(createList("0", "#", "0", "0", "0", "#", "0", "#", "#","#","0","#","0","0","#","#")));

        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList("#","0","#","0","#","0","0","0")));
        assertFalse(exception.getMessage().contains("Something else"));
    }

    @Test
    void everyBranch_193028(){
        RuntimeException exception = null;
        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList("0","#","0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertNotNull(SILab2.function(createList("0","#","0","0","0","#","0","#","#")));

        assertNotNull(SILab2.function(createList("0", "#", "0", "0", "0", "#", "0", "#", "#","#","0","#","0","0","#","#")));

        exception = assertThrows(RuntimeException.class,() -> SILab2.function(createList("#","0","#","0","#","0","0","0")));
        assertFalse(exception.getMessage().contains("Something else"));
    }
}