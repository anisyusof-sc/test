package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import logic.KeywordStructure;
import entity.*;

public class Start {
	
//	FOR TESTING OF VALIDATING KEYWORD
//	public static void main(String[] ags) {
//		
//		Scanner sc = new Scanner(System.in);
//		KeywordStructure ks = new KeywordStructure();
//		
//		while(true) {
//			String keywords = sc.nextLine();
//			
//			Scanner scn = new Scanner(keywords);
//			
//			List<String> stringList = new ArrayList<String>();
//			
//			while(scn.hasNext()) {
//				stringList.add(scn.next());
//			}
//			
//			System.out.println("keyword : " + ks.checkKeyword(stringList));
//		}
//	}

//	FOR TESTING OF COMPARATOR
//	public static void main(String[] args) throws ParseException {
//		
//		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
//		
//		List<Task> taskList = new ArrayList<Task>();
//		
//		NormalTask NormalS = new NormalTask("NormalS", 0, sdf.parse("23-02-2015"), sdf.parse("24-02-2015"));
//		NormalTask NormalA = new NormalTask("NormalA", 0, sdf.parse("24-02-2015"), null);
//	
//		DeadlineTask DeadlineF = new DeadlineTask("DeadlineF", 0, sdf.parse("27-02-2015"));
//		DeadlineTask DeadlineC = new DeadlineTask("DeadlineC", 0, sdf.parse("28-02-2015"));
//	
//		RecurrenceTask RecurZ = new RecurrenceTask("RecurZ", 0, sdf.parse("28-02-2015"), null);
//		RecurrenceTask RecurL = new RecurrenceTask("RecurL", 0, sdf.parse("01-03-2015"), sdf.parse("01-03-2015"));
//		
//		FloatingTask FloatX = new FloatingTask("FloatX", 0);
//		FloatingTask FloatH = new FloatingTask("FloatH", 0);
//		
//		taskList.add(DeadlineC);
//		taskList.add(NormalA);
//		taskList.add(FloatX);
//		taskList.add(RecurZ);
//		taskList.add(FloatH);
//		taskList.add(NormalS);
//		taskList.add(RecurL);
//		taskList.add(DeadlineF);
//		
//		Collections.sort(taskList, Task.taskComparator);
//		
//		for(int i = 1; i-1 < taskList.size(); i++) {
//			//System.out.println(i + ". " + taskList.get(i-1));
//			System.out.println(i + ". " + taskList.get(i-1).getTaskName());
//		}
//		
//		System.out.println(RecurZ.equals(RecurL));
//	}
	
//	FOR VALIDATING KEYWORDS
//	public static void main(String[] args) {
//		
//		Validator v = new Validator();
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			String keyword = sc.nextLine();
//			System.out.println(v.validateKeyword(keyword));
//		}
//	}
	
// 	FOR FULL COMMAND
//	public static void main(String[] args) {
// 		
//		Validator v = new Validator();
// 		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			String fullCommand = sc.nextLine();
//			
//			Task task = null;
//			Object obj = v.parseCommand(fullCommand);
//			
//			if(obj instanceof Task) {
//				task = (Task) obj;
//				System.out.println(task.toString());
//			}
//		}
//	}

}
