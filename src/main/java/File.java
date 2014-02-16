package main.java;

/**
 * A simple File Class
 *
 * @author Jay Tolla
 */
public class File {

    private String fileName;
    private Integer fileSize;
    private String fileContents;
    private String dateOfCreation;

    /**
     * Creates a File instance
     *
     * @param fileName
     * @param fileSize
     * @param fileContents
     * @param dateOfCreation
     */
    public File(String fileName, Integer fileSize, String fileContents, String dateOfCreation) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileContents = fileContents;
        this.dateOfCreation = dateOfCreation;
    }

    /**
     * Returns the file name
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Returns the file size
     *
     * @return
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Returns the file size
     *
     * @return
     */
    public String getFileContents() {
        return fileContents;
    }

    /**
     * Returns the file contents
     *
     * @return
     */
    public String getDateOfCreation() {
        return dateOfCreation;
    }

}