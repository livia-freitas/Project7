import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Hash{
    
/**
Constructs a new Hash object that contains the given
hash (as an array of bytes)
 */    
public Hash(byte[] data){
    this.data = data;

}
public static byte[] calculateHash(String msg) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("sha-256");
    md.update(msg.getBytes());
     byte[] hash = md.digest();
    return hash;
}

/**
Returns the hash contained in this object.
 */
public byte[] getData{
    return this.data;
}

/**
Returns the string representation of the has as
a String of hexadecimal digits, 2 digits per byte.
 */
String toString(){
    String value = this.data.toString();
    return value;
}

/**
Returns true if the hash starts with three zeroes.
 */
boolean isValid(){Checks
    String hashValue = this.toString();
    if(hashValue.startswith("000")){
        return true;
    } 
    return false;
}

/**
Returns true if the argument is structurally equal to this hash.
 */
boolean equals(Object other){
    if(other instanceof Hash){ // if other is a Hash, check equality of contents
        Hash o = (Hash) other;
        boolean result = o.Arrays.equals(other);
        return result;
    }
    return false; // if other is not a Hash, they are not equal
}
}
// calculateHash(String)