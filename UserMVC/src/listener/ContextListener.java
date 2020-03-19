package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import domain.User;

@WebListener
public class ContextListener implements ServletContextListener {

    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	List<User> users = new ArrayList<User>();
		users.add(new User("admin", "admin", "Maksim", "Novitovic"));
		users.add(new User("mile", "mile", "Mile", "Mile"));
		users.add(new User("pera", "pera", "Pera", "Pera"));
		sce.getServletContext().setAttribute("users", users);
		
		List<User> loggedUsers = new ArrayList<User>();
		sce.getServletContext().setAttribute("loggedUsers", loggedUsers);
    }
	
}
