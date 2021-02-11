/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dell
 */
public class UserDAOImpl implements UserDAO{
    Session S ;
    Transaction Tx ;
    
    public UserDAOImpl()
    {
        S = HibernateUtil.getSessionFactory().openSession();
    }
    public void saveOrUpdateUser(User user) 
    {
		try 
                {
                    Tx= S.beginTransaction();
			S.saveOrUpdate(user);
                     Tx.commit();
                        
		} catch (Exception e) 
                {
			Tx.rollback();
			e.printStackTrace();
		}
    }
    
    public void deleteUser(String userId) {
		try {
                    Tx= S.beginTransaction();
			User user = (User) S.get(User.class, userId);
			S.delete(user);
                        Tx.commit();
		} catch (Exception e) {
			Tx.rollback();
			e.printStackTrace();
		} 
	}
    public List<User> listUser() {
		List<User> courses = null;
		try {
			courses = S.createQuery("from User").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courses;
	}
    public User listUserById(String userId) {
		User user = null;
		try {
			user = (User) S.get(User.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
    
}
