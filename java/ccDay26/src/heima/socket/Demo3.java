package heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String str = sc.nextLine();
			if("exit".equals(str)) {
				break;
			}
			
			DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length,
					InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);
		}
		socket.close();
	}

}
