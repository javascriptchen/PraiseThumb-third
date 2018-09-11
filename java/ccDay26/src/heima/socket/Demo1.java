package heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		String str = "what";
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
		socket.send(packet);
		socket.close();
	}

}
