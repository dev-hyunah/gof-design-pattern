package case1.step1;

public class TestPattern1 {

	public static void main(String[] args) {
		Database database;
		
		database = Database.getInstance("첫 번째 Database");
		System.out.println("This is the " + database.getName() + " !!!");
		
		database = Database.getInstance("두 번째 Database");
		System.out.println("This is the " + database.getName() + " !!!");
	}

}
