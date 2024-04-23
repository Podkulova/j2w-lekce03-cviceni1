package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;

@Controller
public class CustomerController {

    Person person = new Person("Eliška",
            "Krásnohorská",
            LocalDate.of(1947,11,18),
            "https://thispersondoesnotexist.com/");
    Address address = new Address("Okrajová 517", "Neználkova", "754 22" );

    @GetMapping("/")
    public ModelAndView showCard() {
        ModelAndView modelAndView = new ModelAndView("card");
        modelAndView.addObject("person", person);
        modelAndView.addObject("address", address);
        return modelAndView;
    }

}
