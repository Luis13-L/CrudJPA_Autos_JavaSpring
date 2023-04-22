package com.intecapp.tareaautos.controller;

import com.intecapp.tareaautos.modelo.Auto;
import com.intecapp.tareaautos.serviceInterface.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AutoController {

    @Autowired
    private IAutoService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("autos", service.listar());
        return "index";
    }
    @GetMapping("/listar/{id}")
    public String listarId(@PathVariable int id, Model model) {
        model.addAttribute("auto", service.listarId(id));
        return "forms";
    }

    @GetMapping("/new")
    public String nuevo(Model model) {
        model.addAttribute("auto", new Auto());
        return "forms";
    }

    @PostMapping("/save")
    public String save(Auto a, Model model) {
        int id = service.save(a);
        if (id == 0) {
            return "forms";
        }
        return "redirect:/listar";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable int id, Model model) {
        service.delete(id);
        return "redirect:/listar";
    }


}

