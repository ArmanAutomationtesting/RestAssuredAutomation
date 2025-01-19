package PayloadManager;

import POJO.Data;
import POJO.Payloaf1;
import com.google.gson.Gson;

public class PayloadManager {

    //{
    //    //    "name": "Apple MacBook Pro 16",
    //    //    "data": {
    //    //        "year": 2019,
    //    //        "price": 1849.99,
    //    //        "CPU model": "Intel Core i9",
    //    //        "Hard disk size": "1 TB"
    //    //    }

    public  String get_Payload(){
        Payloaf1 payloaf1 = new Payloaf1();
        payloaf1.setName("HP solid");
        Data data = new Data();
        data.setCPU_mod("Intel core i7");
        data.setHardDiskSize("500 GB");
        data.setYear(2025);
        data.setPrice(360.37);
        payloaf1.setData(data);
        Gson gson = new Gson();
        String json_payload = gson.toJson(payloaf1);
        System.out.println(json_payload);
        return json_payload;
    }
}
