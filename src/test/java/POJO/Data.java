package POJO;

import com.google.gson.annotations.SerializedName;

public class Data {

    //{
    //    "name": "Apple MacBook Pro 16",
    //    "data": {
    //        "year": 2019,
    //        "price": 1849.99,
    //        "CPU model": "Intel Core i9",
    //        "Hard disk size": "1 TB"
    //    }
    //}

    private int year;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    @SerializedName("CPU model")
    private String CPU_mod;

    @SerializedName("Hard disk size")
    private String hardDiskSize;



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCPU_mod() {
        return CPU_mod;
    }

    public void setCPU_mod(String CPU_mod) {
        this.CPU_mod = CPU_mod;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
}
