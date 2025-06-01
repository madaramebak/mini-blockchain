import java.security.MessageDigest;

public class StringUtil {

    /*
    Here i chose to apply the SHA-256 algo, but the idea here is to take our input(the data) and convert it into a byte array using UTF-8 encoding
    so that it can then be encoded using the SHA-256 algo, and in the end it will return a 64-character hexadecimal string representing a hash
    */
	public static String applySha256(String input){		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
			
			byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
			StringBuilder hexString = new StringBuilder(); 
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
                //Accounting for leading zeros
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}	
}