package com.concretepage.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER3")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  private int id;
  private String name;   
  public User(){	  
  }
  public User(int id,String name){
	  this.id=id;
	  this.name=name;
  }
  public int getId() {
		return id; 
  }
  public void setId(int id) { 
		this.id = id;
  }
  public String getName() {
		return name;
  }
  public void setName(String name) {
		this.name = name;
  } 
} 