package controller;
import java.util.ArrayList;


import model.Account;
import model.Group;
import model.Post;



public class object_controller {
	
	private ArrayList<Account> users;
	private ArrayList<Group> groups;
	
	public object_controller(){
		this.users = new ArrayList<Account>();
		this.groups = new ArrayList<Group>();
		this.users.add(new Account("admin", "password", 1234, "Admin McAdmin", "admin@admin.admin", "555-555-5555", false ));
		this.groups.add(new Group("Admin Test Group", "Admin", 0));
		this.groups.get(0).addAccount(this.users.get(0));
	}
	
	public boolean credentials(String username, String password){
		for(int x = 0; x < users.size(); x++){
			if(users.get(x).getUsername().equals(username) && users.get(x).getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}	
	public void signup(String user, String pass, int id, String name, String email, String number){
		this.users.add(new Account(user, pass, id, name, email, number, false));
	}
	
	
	
	
	public ArrayList<Account> getAccounts(){
		return this.users;
	}
	
	public ArrayList<Group> getGroups(){
		return this.groups;
	}
	
	//commit
}