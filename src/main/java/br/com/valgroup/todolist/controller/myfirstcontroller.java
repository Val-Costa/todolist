package br.com.valgroup.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8888/primeiraRota ---------
public class myfirstcontroller {

    /** METODOS de acesso do HTTP:
     * GET - buscar uma informação
     * POST - adicionar um dado/informação
     * PUT - alterar dados/informação
     * DELETE - remover um dado
     * PATCH - alterar somente uma parte da informação ou dado
     * 
     */
    //Metodo (funcionalidade) de uma classe:
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
