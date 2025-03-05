package POJO;

public class Payload1Response {

    //"id": "ff808181932badb601951df9a88f5fbe",
    //    "name": "HP solid",
    //    "createdAt": "2025-02-19T11:30:55.759+00:00",
    //    "data": {
    //        "year": 2025,
    //        "price": 360.37,
    //        "CPU model": "Intel core i7",
    //        "Hard disk size": "500 GB"

    private String id;
    private String createdAt;
    private Data data;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
