package pl.roka.it.postprocessor;
@LoggingCreation
public class WriterIml implements Writer{
    private String message;


    public void init() {
        message = message.concat(" world");
    }

    @Override
    public void write() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
