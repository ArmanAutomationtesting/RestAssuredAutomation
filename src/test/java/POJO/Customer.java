package POJO;

public class Customer {


    //"id": 101,
//    "name": "John Doe",
//    "email": "john.doe@example.com"

    private  int id ;
    private String name ;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
