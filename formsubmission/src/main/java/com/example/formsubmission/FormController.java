package com.example.formsubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class FormController {
    @Autowired
    CustomerRespository repo;

        
    @RequestMapping("/")
    public String form() {
        return "submission";
    }

    @RequestMapping("/details")
    public String details(Customer customer) {
        repo.save(customer);
        return "submission";
    } 

    @RequestMapping("/getdetails")
    public String getDetails() {
        
        return "customerDetails";
    } 

        
  
    @PostMapping("/getdetails")
    public ModelAndView getDetails(@RequestParam int cid) {

            ModelAndView mv = new ModelAndView("customerById");
            Customer customer = repo.findById(cid).orElse(null);
            mv.addObject(customer);
            return mv;


    }

    



}
