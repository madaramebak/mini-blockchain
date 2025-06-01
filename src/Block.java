import java.util.*;

public class Block{

    public String hash;
    public String previousHash;
    public String data;
    private long time;



    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.hash = this.calculateHash();
        this.time = new Date().getTime();
    }


    // links the previous hash
    public String calculateHash() {
	String calculatedhash = StringUtil.applySha256(previousHash + Long.toString(time) + data );
	return calculatedhash;
}
}