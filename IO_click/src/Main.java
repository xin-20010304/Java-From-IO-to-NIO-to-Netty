import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //创建客户端的Socket对象
        Socket s=new Socket("10.160.89.70", 50000);

        //获取输出流，写数据
        OutputStream os=s.getOutputStream();
        os.write("hello,物联网19级".getBytes());

        //释放资源
        s.close();
    }
}
