package main.java;

import java.util.Calendar;

// good documentation in this file. 

/**
 * A Duplicate File Finder Class that checks for duplicate files within the source directory.
 *
 * @author Jay Tolla
 */
public class DuplicateFileFinder {

    private File file;

    /**
     * Create static date for testing purposes only
     *
     * This does not seem to be working, so I've swapped out the
     * Calendar object for a String.
     *
     --> DO NOT put code that is just used by tests into production code
     --> Production code should not be changed for tests. 
     * Calendar helloDateCreated = Calendar.getInstance();
     * helloDateCreated.set(2014, 2, 8);
     */



    /**
     * Creates a DuplicateFileFinder instance
     *
     * @param file
     */
    public DuplicateFileFinder(File file) {
        this.file = file;
    }

    /**
     * Checks the source directory for a duplicate file by comparing the
     * file name, file size, file contents and date of creation to static values defined below.
     *
     * Basically, we're only checking for one very specific file.
     */
    public String checkForDuplicate() {
        if (file.getFileName() == "hello.txt" && file.getFileSize() == 1024
                && file.getFileContents() == "Hello!" && file.getDateOfCreation() == "2/8/2014") {
            return "Duplicate found!";
        } else {
            return "No duplicates found.";
        }
    }

}