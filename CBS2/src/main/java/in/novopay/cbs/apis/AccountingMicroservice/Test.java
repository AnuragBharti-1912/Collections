package in.novopay.cbs.apis.AccountingMicroservice;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class Test {
	public static void main(String[] args) throws Throwable {
//		Connection conn;
//			Statement stmt = null;
//			ResultSet rs;
//			String dbNpActor = "jdbc:mysql://192.168.150.2:3306/" + "authentication" + "?verifyServerCertificate=false&useSSL=true";
//			String jdbcDriver = "com.mysql.jdbc.Driver";
//			try {
//				Class.forName(jdbcDriver);
//				conn = DriverManager.getConnection(dbNpActor,"akhanna",
//						"akhanna123$");
//				stmt = conn.createStatement();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//			String query = "SELECT `p12_key` FROM `key_store` WHERE `purpose`='MPIN-ENCRYPTION-KEY'";
//			
//			try {
//				rs = stmt.executeQuery(query);
//				rs.next();
//				Blob blob = rs.getBlob("p12_key");
//				
//				int blobLength = (int) blob.length();  
//				byte[] blobAsBytes = blob.getBytes(1, blobLength);
//				//release the blob and free up memory. (since JDBC 4.0)
//				blob.free();
//				
//				String data = "UDlLUytxdHBkb2FoMXI5YzJZWkhLaUpiMmlERGhFeUZDd1RjQkNQNXBsNUdLK0ZxZUdmOC9qd3JRcTN6ZGdNK0dlMWdpdHI2d0RudDVucENwMUtWUUJSMmpmTm90ZjdyNjh4eUlKT1J1aUQzZU9lVWp5WFhPeC9HQndFVHBOYTYxU2c3T296S1FHa1hVclRaSjRzU1V1aGs2Y0NOcWZiS2dNNzdiSGZoTWthTlRycFRibmI4YnJKNm5abnJiMmQyM2xIQ3dYQ3c5MTNLSzhyK2FKTi9RdDFVeXorQUxTbnA3bTdpVEZxYTUvWFFpdjRYUjMwNXR6MFVkM2ZYTnJ5QTZHVmxNbEpQM09EcVU5QlhvTnVTM0NOT3BMSkNjdlZ3OFhvWGNPeXpaODhjMUZnU1FIMnFzd1lSTFI5VEVZS2FpRHMzZkw3cERRYXhFSWUwejV1ck1RPT0=";
//				
//				
//				byte[]uncryptedData = CryptoUtil.decryptUsingPrivateKey(blobAsBytes,data.getBytes());
//				System.out.println(Arrays.toString(uncryptedData));
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		

		// generate symmetric key
		try{
				
				String mpinEncryptionKeyFromTheApi = "${mpinKey}";
				byte[] encryptedMpinKey = new byte[0];
				String encryptedMpinKeyString;
				System.out.println();
				String systemSha256Hash = System.currentTimeMillis()+"_"+DigestUtils.sha256Hex("${mpin}");
				try {
					byte[] encryptedMPINKey = new byte[0];
					byte[] publicKeyByte = Base64.decodeBase64(mpinEncryptionKeyFromTheApi);
					byte[] key = publicKeyByte;
					byte[] data = systemSha256Hash.getBytes();

					PublicKey publicKey = null;

					try {
						publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(key));
					} catch (Exception var4) {
						System.out.println("Error while forming public key from byte array" + data);
					}

					byte[] cipherText = null;

					try {
						Cipher e = Cipher.getInstance("RSA/ECB/PKCS1Padding");
						e.init(1, publicKey);
						cipherText = e.doFinal(data);
					} catch (Exception var4) {
						System.out.println("Error while encrypting data using public key" + data);
					}

					encryptedMPINKey = Base64.encodeBase64(cipherText);
					encryptedMpinKeyString = Base64.encodeBase64String(encryptedMPINKey);
					System.out.println("encrypted Mpin Key String "+encryptedMpinKeyString);
//					vars.put("encryptedMpinKeyString",encryptedMpinKeyString);
//					props.put("mpinEncryptionKeyFromTheApi"+${counter},mpinEncryptionKeyFromTheApi);
//					props.put("encryptedMpinKeyString"+${counter},encryptedMpinKeyString);
				} catch (Exception e) {
				}
				
		}catch (Throwable ex) {
//		   log.info("Error in Beanshell", ex);
		   throw ex;
		}
				
	}
}
