package com.exapmle.InetAddress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;import java.net.InetAddress;


public class FindIPAddress

{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("System IP Address : " + (address.getHostAddress()).trim());
        // to get public IP address in java

    }
}