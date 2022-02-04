package lab3p2_hectoracosta;

import java.util.Date;


public class Transportista extends Persona {

    private int expYears;
    private String nickName;

    public Transportista() {
    }
    
    public Transportista(String name, int id, Date birthday, int expYears, String nickName) {
        super(name, id, birthday);
        this.expYears = expYears;
        this.nickName = nickName;
    }
    
    public int getExpYears() {
        return expYears;
    }
    
    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    
}
