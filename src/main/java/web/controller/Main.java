package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImp;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Для тестов, создание таблицы.

        UserService userService = new UserServiceImp();
        userService.createUserTable();
        userService.createUser("Tony","Stark",45);
        userService.createUser("Peter'","Parker",19);
        userService.createUser("Steve","Rodgers",95);
        userService.createUser("Steven","Strange",35);
        userService.createUser("Scott","Lang",30);


    }
}
