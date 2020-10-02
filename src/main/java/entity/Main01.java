package entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {


        try (Connection connetion = DbUtil.getConnection()) {

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

       User user = new User("Adam","a@.com","123sddssd45");

        UserDao userDao = new UserDao();
        userDao.create(user);

//        User user = new User();
//        UserDao userDao = new UserDao();


//        userDao.create(user);
//        user=userDao.read(4);
//        user.setPassword("kdscjhds");
//        user.setUserName("julian");
//        user.setEmail("j@gmail.com");
//        userDao.update(user);



        List<User> list = new ArrayList<>();
        list = userDao.findAll();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId() + " ");
            System.out.print(list.get(i).getEmail() + " ");
            System.out.print(list.get(i).getUserName() + " ");
            System.out.print(list.get(i).getPassword());
            System.out.println("");
        }






    }




    }






//        System.out.println(userDao.read(1));






