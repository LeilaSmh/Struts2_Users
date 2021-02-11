/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.entity.User;
import java.util.List;

/**
 *
 * @author Dell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UserDAOImpl dao = new UserDAOImpl();
          dao.saveOrUpdateUser(new User("toto","toto"));
       List<User> L= dao.listUser();
       for (User U : L)
            System.out.println(U.getLogin()+"   " + U.getPassword());

    }
    
}
