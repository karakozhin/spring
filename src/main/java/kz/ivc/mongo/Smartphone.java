package kz.ivc.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "smartphone")
public class Smartphone {

    @Id
    private int id;
    private String nameOfSmartphone;
}
