package class2.day2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Model {
    @Id
    int id;
    String name;
    
    public Model(){}

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }
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
    
}
