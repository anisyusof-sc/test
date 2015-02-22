package Validator;

import java.util.Scanner;

import entity.Task;

public class Run {

// 	FOR FULL COMMAND
	public static void main(String[] args) {
 		
		Validator v = new Validator();
 		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String fullCommand = sc.nextLine();
			
			Task task = null;
			Object obj = v.parseCommand(fullCommand);
			
			if(obj instanceof Task) {
				task = (Task) obj;
				System.out.println(task.toString());
			}
		}
	}

}
