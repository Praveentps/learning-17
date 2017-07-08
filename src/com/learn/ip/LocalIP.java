package com.learn.ip;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class LocalIP {

	public static void main(String[] args) {
		InetAddress ip;
		try {
			ip = InetAddress.getLocalHost();
			System.out.println(Inet4Address.getLocalHost().getHostAddress());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			String host=ip.getHostName();
			System.out.println(ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}

}
