import java.util.*;

public class Block{

    public String hash;
    public String previousHash;
    public String data;
    private long time;



    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        // this.hash = havent created the method yet
        this.time = new Date().getTime();
    }
}