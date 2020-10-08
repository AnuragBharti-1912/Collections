package in.novopay.cbs.apis.AccountingMicroservice;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;

import in.novopay.cbs.utils.CryptoUtil;
import in.novopay.cbs.utils.HashUtil;

public class traila {
	
	public static void main(String[] args) {
		
		traila a=new traila();
		String publickey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs+CLAhBZbP0MWBY5ka6EKCId2FAIV2ygFkNPhGfxXuqGNdQYRDwbSSYRRYwozRBnN4ooJ0XeGMofD9VLQWsCNvGmJxE2oC4wgDaYDWwjKfehFvwIs6RenJJa7RRcYwFsWAIHzvLHCxGugxAZbjLhMvP+1E0DAiSGN/L/UTdCkxfr4XzlTMi0kcirHLgiAdIIy7F7zRjtw6pcVkzRbwHOhT6rus4MpThYhMIoY6CYpwsF+ryqlqExl1bp0xydtf2CGFjKvlIxxU0yTMx1/ce3ewmVpFKkNgfQOPOe18RGB45W6GjtCZAO5rSslg465T1bahrEABbEfSxBQDgARfLsVQIDAQAB";
		String password="Novopay@123";
		
		a.getPasswordWithSHA(publickey, password);
		
	}
	public String getPasswordWithSHA(String publickey, String password) {

		byte[] publicBytes = Base64.decodeBase64(publickey);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicBytes);
		KeyFactory keyFactory;
		try {
			keyFactory = KeyFactory.getInstance("RSA");

			PublicKey pubKey = keyFactory.generatePublic(keySpec);
			byte[] byteArray = HashUtil.generateSha512Hash(password);
			String withDate = new Date().getTime() + "_" + CryptoUtil.convertByteToHex(byteArray);
			System.out.println("withDate " + withDate);
			byte[] encryptedData = CryptoUtil.encryptUsingPublicKey(pubKey, withDate.getBytes());

			System.out.println(
					"base64 encryptedData, use it as auth_value to login :" + HashUtil.toBase64(encryptedData));
			return HashUtil.toBase64(encryptedData);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	}


