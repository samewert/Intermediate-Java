package PA10;

public class InvalidTriangleException extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public InvalidTriangleException() {
        // TODO Auto-generated constructor stub
    }
    
    public InvalidTriangleException(String message) {
        super(message);
    }
    
    public InvalidTriangleException(Throwable cause) {
        super(cause);
    }
    
    public InvalidTriangleException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public InvalidTriangleException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
