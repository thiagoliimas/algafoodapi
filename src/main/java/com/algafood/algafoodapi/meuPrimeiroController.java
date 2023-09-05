package com.algafood.algafoodapi;

import com.algafood.algafoodapi.di.modelo.Cliente;
import com.algafood.algafoodapi.service.AtivacaoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class meuPrimeiroController {

    @Autowired
    private AtivacaoClienteService ativacaoClienteService;

    @GetMapping
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("Joao", "joao@mail.com", "88996664787");

        this.ativacaoClienteService.ativar(joao);
        return "Hello";
    }
}