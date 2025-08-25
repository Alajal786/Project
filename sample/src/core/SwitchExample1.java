package core;

public class SwitchExample1 {

	public static void main(String[] args) {
		String week = "tue";
		String mesg ;
		mesg = switch(week) {
		case "mon" ->{yield "working day";}
		case "sat" ->{yield "weekend";}
		default -> throw new RuntimeException("not a valid week");
		
		};
		System.out.println(mesg);

	}

}
