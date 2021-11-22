package com.sonata.springMvc;
import java.util.*;
public interface userDao {

	public int save(Object object);
	public List<User> getData();
	public int update(Object object);
	public int delete(Object object);
	
}
