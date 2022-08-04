package com.sgtesting.AutoIt;

public class ExecuteAutoItScriptDemo {

	public static void main(String[] args) {
		executeFile();

	}
	private static void executeFile()
	{
		try
		{
			String fileName="E:\\HTML\\AutoIt\\FirsttAutoItTextScript.exe";
			Runtime.getRuntime().exec(fileName);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
