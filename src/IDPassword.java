import java.util.HashMap;

public class IDPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    IDPassword(){

        logininfo.put("Chairman", "123");
        logininfo.put("Cashier", "123");
        logininfo.put("Trainer", "123");
        logininfo.put("1", "1");
    }
    protected HashMap getLogininfo(){
        return logininfo;
    }
}
