package com.mainacad;

import com.mainacad.model.*;
import com.mainacad.service.CartService;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    private static final String PROJECT_DIR_PATH = System.getProperty("user.dir");


    public static void main(String[] args) {

        UserGenerationService userGenerationService = new UserGenerationService();

        Date birthDay = UserGenerationService.getDate(1987, 11, 22);

            User user = new User("masian4ik", "123456", "Maxim", "Novikov", birthDay, Gender.MALE);

            Item item = new Item("Beer", "Heiniken", (double) 10);

            Order order = new Order(item, 15);

            Cart cart = new Cart(user, order, new Date().getTime());

            System.out.println(CartService.getTotalSum(cart) );











        }


    }



