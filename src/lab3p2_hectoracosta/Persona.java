package lab3p2_hectoracosta;

import java.util.Date;

public class Persona {
    
    private String name;
    private int id;
    private Date birthday = new Date();

    public Persona() {
    }

    public Persona(String name, int id, Date birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    //getters
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id; 
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String toString(){
        return ("Nombre:"+name+"--Id:"+id+"--Birthday:"+birthday);

    }
    
}
