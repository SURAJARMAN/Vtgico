package com.Vtiger.GenricLibraries;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber()
	{
		Random ran = new Random();
		int random = ran.nextInt(1000);
		return random;
	}
	
	
	/**
	 * This method is used to get System date
	 * @return
	 */
	public String getSystemDate() throws Throwable
	{
		Date date=new Date();
		String SystemDate =date.toString();
		return SystemDate;
	}
	/**
	 * This method is used to get system date and time in format
	 * @return
	 */
	
	public String getSystemDateandTimeInFormat() 
	
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date systemdate = new Date(0);
		String getDateAndTime = dateformat.format(systemdate);
		System.out.println(getDateAndTime);
		return getDateAndTime.replaceAll(":","-");
	}
}
