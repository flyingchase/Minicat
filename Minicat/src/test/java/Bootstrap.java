import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Struct;

public class Bootstrap {

  /**
   * 设定启动和监听端口
   */
  private int port = 8080;

  /**
   * 启动函数
   *
   * @throws IOException
   */
  public void start() throws IOException {
      System.out.println("Minicat starting...");
      String responseData = "Hello Minicat.";
      ServerSocket socket = new ServerSocket(port);
      while (true) {
          Socket accept = socket.accept();
          OutputStream outputStream = accept.getOutputStream();
          String responseText = HttpProtocolUtil.getHttpHeader200(responseData.length()) + responseData;
          outputStream.write(responseText.getBytes());
          accept.close();
      }
  }

  /**
   * 启动入口
   *
   * @param args
   */
  public static void main(String[] args) throws IOException {
      Bootstrap bootstrap = new Bootstrap();
      bootstrap.start();
  }

}