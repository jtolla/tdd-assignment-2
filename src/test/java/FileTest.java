package test.java;  // use real packages 
import main.java.File;

import org.junit.Assert;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

/**

describe class here


 * @author Jay Tolla
 */
public class FileTest {

    // document this variable and perhaps use a more descriptive name. 
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

    // where is the tear down method?
    // - tests need to clean up after themselves. 

    @After
    public void tearDown() {
       // delete the file file.delete();
    }
    /**
     * Test the constructor by getting the original values of the
     * original parameters.
     */
    @Test
    public void testFileConstructor() {
        // I prefer to have a separate test for each thing I am verifying but this is OK
        Assert.assertEquals("The file name is correct", file.getFileName(), "test.txt");
        Assert.assertEquals("The file size is correct", file.getFileSize(), (Object) 512);
        Assert.assertEquals("The file contents are correct", file.getFileContents(), "Test!");
        Assert.assertEquals("The name is correct", file.getDateOfCreation(), "2/8/2014");
    }

}
