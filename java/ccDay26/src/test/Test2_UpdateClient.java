package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test2_UpdateClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		File file = getFile();
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file.getName());
		String result = br.readLine();
		if ("存在".equals(result)) {
			System.out.println("您上传的文件已经存在，请不要重复上传");
			socket.close();
			return;
		}
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		while ((len = fis.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		fis.close();
		socket.close();
	}

	public static File getFile() {
		System.out.println("请输入一个文件路径：");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("您输入的文件路径不存在，请重新录入：");
			} else if (file.isDirectory()) {
				System.out.println("您输入的是一个文件夹路径，请重新输入：");
			} else {
				return file;
			}
		}
	}

}
