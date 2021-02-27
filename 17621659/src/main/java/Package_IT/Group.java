package Package_IT;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "de.vogella.xml.jaxb.model")
public class Group {

    // XmLElementWrapper генерира обвиващ елемент около XML елементите, родителския елемент
    @XmlElementWrapper(name = "usersList")
    // XmlElement задава името на вътрешните елементи
    @XmlElement(name = "user2")
    private ArrayList<User> users2;
    

    public void setUsers(ArrayList<User> users) {
        this.users2 = users;
    }

    public ArrayList<User> getUsers() {
        return users2;
    }

    
}