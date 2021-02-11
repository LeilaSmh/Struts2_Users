/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.actions;

import com.dao.UserDAOImpl;
import com.entity.User;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Dell
 */
public class USERAction extends ActionSupport {
    private String login;
    private String password;
	private List<User> userList = new ArrayList<User>();
	private UserDAOImpl userDAO = new UserDAOImpl();
	/**
	 * To save or update user.
	 * @return String
	 */
	public String saveOrUpdate()
	{	User user= new User(login, password);
		userDAO.saveOrUpdateUser(user);
		return SUCCESS;	}	
	/**
	 * To list all users.
	 * @return String
	 */
	public String list()
	{	userList = userDAO.listUser();
		return SUCCESS;}
	/**
	 * To delete a user.
	 * @return String
	 */
	public String delete(){
HttpServletRequest request ;
  request= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		userDAO.deleteUser(request.getParameter("login"));
		return SUCCESS;	}	
	/**
	 * To list a single user by Id.
	 * @return String
	 */
	public String edit()
	{
HttpServletRequest request;
request= (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	User	user = userDAO.listUserById(request.getParameter("login"));
	if(user!=null)
            return SUCCESS;
        return ERROR ;
	}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDAOImpl getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }
	
public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
    
}
