package org.itstep.conditionals;

public class WrongCharException extends Exception{
    String message;

    WrongCharException(String message) {
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
