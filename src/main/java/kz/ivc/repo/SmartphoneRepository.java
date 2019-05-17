package kz.ivc.repo;

import kz.ivc.mongo.Smartphone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SmartphoneRepository extends MongoRepository<Smartphone, String> {
//    Optional<Smartphone> findById(String id);
//    Optional<Smartphone> deleteById(String id);
}
