import java.io.IOException;
import java.io.InputStream;

public class Request {
/*
*请求方法
* */
    private String method;
    private String url;
    private InputStream inputStream;
    public Request(){

    }
    public Request(InputStream inputStream) throws IOException{
        this.inputStream = inputStream;
        int count=0;
        while (count==0) {
            count = inputStream.available();
        }
        byte[] bytes = new byte[count];
        inputStream.read(bytes);
        String requeststring = new String(bytes);
        String[] requeststringArray = requeststring.split("\\n");
        String firstline = requeststringArray[0];
        String[] firstlineArray = firstline.split(" ");
        this.method = firstlineArray[0];
        this.url= firstlineArray[1];
    }
}
