package main.java.com.apidemo.exception;

public class PageNotFoundException extends RuntimeException {

    public PageNotFoundException(final int pageNumber) {
        super("Could not find page " + pageNumber);
    }
}