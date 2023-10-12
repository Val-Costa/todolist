package br.com.valgroup.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
 @RestController
 @RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integer (int)
     * Double (double) 0.000
     * Float (float) 0.000
     * char (A C)
     * Date (data)
     * void ()
     */
    /**
     * Body da requisição
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel UserModel) {
        System.out.println(UserModel.name);
    }
}
