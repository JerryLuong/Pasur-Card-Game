package pasur;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlayerObserver implements Observer {
    private String outputFile = "pasur.log";
    private PrintWriter outputStream;

    /**
     *
     * @param publisher publisher of the event who wants to publish an event
     * @param value Value the publisher wants to publish in the output text file
     */
    public void onPropertyEvent(Publisher publisher, String value){
        if(publisher instanceof Player) {
            try {
                outputStream = new PrintWriter(new FileOutputStream(outputFile,true));
            } catch (FileNotFoundException e) {
                System.out.println("Unable to Open File: Check File Path.");
                System.exit(0);
            }

            outputStream.println(value);
            outputStream.close();
        }
    }
}
