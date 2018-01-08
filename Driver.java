public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		UserInterface ui = new UserInterface();
		String name = ui.promptForName();
		e1.setName(name);
		System.out.println("Employee Name: " + e1.getName());
	}
}
