package com.techwedge;




import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Encryption {
	/**
	 * @param plaintext
	 * @return
	 * @throws Exception
	 * 
	 * encypt the password
	 * 
	 */
	public  synchronized String encrypt(String plaintext)
			throws Exception {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256"); // step 2
		} catch (NoSuchAlgorithmException e) {
			throw new Exception(e.getMessage());
		}

		try {
			md.update(plaintext.getBytes("UTF-8")); // step 3
		} catch (UnsupportedEncodingException e) {
			throw new Exception(e.getMessage());
		}

		byte raw[] = md.digest(); // step 4
		String hash = (new BASE64Encoder()).encode(raw); // step 5
		return hash; // step 6

	
	
		
	}
}