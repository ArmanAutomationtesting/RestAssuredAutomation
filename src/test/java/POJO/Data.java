package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Double price;

//    @SerializedName("CPU model")
    @JsonProperty("CPUModel")
    private String CPUModel;

//    @SerializedName("Hard disk size")
    @JsonProperty("hardDiskSize")
    private String hardDiskSize;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
}
