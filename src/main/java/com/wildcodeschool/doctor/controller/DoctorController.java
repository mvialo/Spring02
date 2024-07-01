package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Object doctor(@PathVariable int number) {
        if (number == 13){
            return new Doctor(13,"Jodie Whittaker");
        }
        else if ( number >= 1 && number <= 12 ){
            return "Erreur 303";
        }
        else{
            return "Erreur 404 \nImpossible de récupérer l'incarnation "+ number;
        }
        
    }
}
