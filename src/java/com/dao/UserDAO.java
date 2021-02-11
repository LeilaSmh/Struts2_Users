/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entity.User;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface UserDAO {
  
    public void saveOrUpdateUser(User user) ;
    public void deleteUser(String userId); 
    public List<User> listUser(); 
    public User listUserById(String userId) ;
    
}
