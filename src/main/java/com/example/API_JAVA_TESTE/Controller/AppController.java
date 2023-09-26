package com.example.API_JAVA_TESTE.Controller;

import com.example.API_JAVA_TESTE.Entities.Address;
import com.example.API_JAVA_TESTE.Entities.Products;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/teste2")
public class AppController {
    @GetMapping
    public List<Products> getAll(){
        Address endereco = new Address("atteu mascavo",22,"maranhao");
        Products cadastro = new Products(0001L,"carol",10,endereco);

        List<Products> list= Arrays.asList(cadastro,cadastro,cadastro);
        return list;
    }

}
