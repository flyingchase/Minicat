import java.io.IOException;
import java.io.OutputStream;

public class Reponse {
    private OutputStream outputStream;
    public Reponse() {

    }
    public Reponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
    public void output(String content) throws IOException{
        outputStream.write(content.getBytes());
    }

    public void outputHtml(String url ) throws IOException{
        String absoluteResourcePath =
    }
}