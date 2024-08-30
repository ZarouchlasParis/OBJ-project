package Assignment_001;

public class Error_post implements  Observe{
    @Override
    public void error(String message){
        System.out.println("POST: " + message);
    }
}
