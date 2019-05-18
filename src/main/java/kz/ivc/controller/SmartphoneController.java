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
    SmartphoneRepository smartphoneRepository;

    @GetMapping("/list")
    public List<Smartphone> getSmartphones() {
        return smartphoneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Smartphone getSmartphone(@PathVariable String id ) {
        Smartphone smartphone = smartphoneRepository.findOne(id);
        return smartphone;
    }



    @PostMapping("/save")
    public String saveSmartphone(@RequestBody Smartphone smartphone) {
        smartphoneRepository.save(smartphone);
        return "Added smartphone with id: " + smartphone.getId();
    }



    @DeleteMapping("/delete/{id}")
    public String deleteSmartphone(@PathVariable String id) {
        smartphoneRepository.delete(id);
        return "Deleted smartphone with id: " + id;
    }

}
