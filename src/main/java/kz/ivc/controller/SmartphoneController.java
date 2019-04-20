package kz.ivc.controller;

import kz.ivc.repo.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/smartphone")
public class SmartphoneController {

    @Autowired
    SmartphoneRepository smartphoneRepository;


}
