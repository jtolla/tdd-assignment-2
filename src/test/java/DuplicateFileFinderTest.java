package test.java;
import main.java.File;
import main.java.DuplicateFileFinder;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Jay Tolla
 */
public class DuplicateFileFinderTest {


    /**
     * Create two separate files and their corresponding DuplicateFileFinder
     */
    private File fileHello;
    private DuplicateFileFinder duplicateFileFinderHello;

    private File fileHola;
    private DuplicateFileFinder duplicateFileFinderHola;

    @Before
    public void setup() {
        fileHello = new File("hello.txt", 1024, "Hello!", "2/8/2014");
        duplicateFileFinderHello = new DuplicateFileFinder(fileHello);

        fileHola = new File("hola.txt", 512, "Hola!", "2/10/2014");
        duplicateFileFinderHola = new DuplicateFileFinder(fileHola);
    }

    /**
     * A test that should return a duplicate.
     */
    @Test
    public void testCheckForDuplicatePositive() {
        assertEquals("positive check for duplicate", duplicateFileFinderHello.checkForDuplicate(), "Duplicate found!");
    }

    /**
     * A test that should not return a duplicate.
     */
    @Test
    public void testCheckForDuplicateNegative() {
        assertEquals("negative check for duplicate", duplicateFileFinderHola.checkForDuplicate(), "No duplicates found.");
    }

}
