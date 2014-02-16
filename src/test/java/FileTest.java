package test.java;
import main.java.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jay Tolla
 */
public class FileTest {

    private File file;

    /**
     * Instantiate a test file in the setup method.
     *
     * This gives us our state.
     */
    @Before
    public void setup() {
        file = new File("test.txt", 512, "Test!", "2/8/2014");
    }

    /**
     * Test the constructor by getting the original values of the
     * original parameters.
     */
    @Test
    public void testFileConstructor() {
        Assert.assertEquals("The file name is correct", file.getFileName(), "test.txt");
        Assert.assertEquals("The file size is correct", file.getFileSize(), (Object) 512);
        Assert.assertEquals("The file contents are correct", file.getFileContents(), "Test!");
        Assert.assertEquals("The name is correct", file.getDateOfCreation(), "2/8/2014");
    }

}
