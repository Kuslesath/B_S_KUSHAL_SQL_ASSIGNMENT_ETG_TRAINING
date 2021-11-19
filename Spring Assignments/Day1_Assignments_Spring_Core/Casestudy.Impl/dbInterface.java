package com.sonata.casestudy.impl;

import java.sql.Connection;

public interface dbInterface {

	public Connection getCon();
	public void closeCon();
}
