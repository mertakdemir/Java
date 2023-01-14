package day28exceptionscollections;


//When you "extend" to "RunTimeException Class", your "Custom Exception" will be "RunTimeException"

public class IllegalNameException extends RuntimeException{


    public IllegalNameException(String message){

        super(message);

    }
}
