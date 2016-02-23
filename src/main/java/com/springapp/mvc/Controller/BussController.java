package com.springapp.mvc.Controller;

import com.springapp.mvc.domain.Buss;
import com.springapp.mvc.repository.BussRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by vlad on 16.02.16.
 */
public class BussController {
    private BussRepository bussRepository;

    @Autowired
    public BussController(BussRepository bussRepository) {
        this.bussRepository = bussRepository;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getBuss(Model model){
        List<Buss> bussList = this.bussRepository.listAll();
        model.addAttribute("Busses", bussList);
        return "idex";
    }
}
                                        