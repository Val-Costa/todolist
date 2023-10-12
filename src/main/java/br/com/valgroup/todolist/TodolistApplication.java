
//pacote onde nossa classe está salva
package br.com.valgroup.todolist;

//Importações: pacotes e classe
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ -> determina uma anotation, nessa deifne a anotation interface
@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
