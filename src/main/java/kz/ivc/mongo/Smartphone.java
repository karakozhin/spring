package kz.ivc.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "smartphone")
public class Smartphone {

    @Id
    private String id;
    private String nameOfSmartphone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfSmartphone() {
        return nameOfSmartphone;
    }

    public void setNameOfSmartphone(String nameOfSmartphone) {
        this.nameOfSmartphone = nameOfSmartphone;
    }
}
