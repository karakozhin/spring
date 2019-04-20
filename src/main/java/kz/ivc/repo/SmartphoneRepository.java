package kz.ivc.repo;

import kz.ivc.mongo.Smartphone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends MongoRepository<Smartphone, String> {
}
