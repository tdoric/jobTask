package task.dao;

public final class Statements {
	
	public static class Person{
		public static String INSERT = "INSERT INTO PERSON (NAME,SURNAME,ZIPCODE,CITY,TELNUMBER) "
				+ " VALUES(?,?,?,?,?)";
	}

}
