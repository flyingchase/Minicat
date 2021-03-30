import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StaticResourceUtil {
    public static String getAbsolutePath(String url) {
        String path = StaticResourceUtil.class.getResource("/").getPath();
        return  path.replaceAll("\\\\","/")+url;
    }
    public static void outputStaticResource(InputStream inputStream, OutputStream outputStream) throws IOException {
        int count =0;
        while (count==0) {
            count= inputStream.available();
        }

        int resourceSize = count;

        outputStream.write();
    }
}
