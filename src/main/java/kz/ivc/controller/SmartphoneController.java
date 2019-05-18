package kz.ivc.controller;

import kz.ivc.mongo.Smartphone;
import kz.ivc.repo.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/smartphone")
public class SmartphoneController {

    @Autowired
    SmartphoneRepository repository;

    @GetMapping("/list")
    public List<Smartphone> getSmart(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Smartphone getSmartphone(@PathVariable String id){
        return repository.findOne(id);
    }

    @PostMapping("/save")
    public String saveSmartphone(@RequestBody Smartphone smartphone){
        repository.save(smartphone);
        return "Smartphone with id: " + smartphone.getId() + " added";
    }

    @PutMapping("/{id}")
    public String updateSmartphone(@PathVariable String id, @RequestBody Smartphone newSmartphone){
        Optional<Smartphone> smartphoneOptional = Optional.ofNullable(repository.findOne(id));
        if(smartphoneOptional.isPresent()){
            Smartphone currentSmartphone = smartphoneOptional.get();
            currentSmartphone.setNameOfSmartphone(newSmartphone.getNameOfSmartphone());
            repository.save(currentSmartphone);
            return "Smartphone with id: " + currentSmartphone.getId() + " updated";
        }
        return id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSmartphone(@PathVariable String id){
        repository.delete(id);
        return "Smartphone with id: " + id + " deleted";
    }

}
