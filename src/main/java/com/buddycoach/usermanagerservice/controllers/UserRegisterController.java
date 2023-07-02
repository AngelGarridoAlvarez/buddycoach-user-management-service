package com.buddycoach.usermanagerservice.controllers;

import com.buddycoach.usermanagerservice.dto.UserRegisterDTO;
import com.buddycoach.usermanagerservice.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class UserRegisterController {

    private UserService userService;

    public UserRegisterController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("usuario")
    public UserRegisterDTO returnNewUserRegisterDTO() {
        return new UserRegisterDTO();
    }
    @GetMapping
    public String showRegisterForm(){
        return "registro";
    }

    @PostMapping
    public String registrarCuentaUsuario(@ModelAttribute("usuario") UserRegisterDTO registerDTO) {
     userService.save(registerDTO);
        return "redirect:/registro?exito";
    }
}
