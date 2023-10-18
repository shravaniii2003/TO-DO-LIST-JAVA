package java_internship;
import java.util.*;

public class TodoList {
	private ArrayList<String> tasks=new ArrayList<String>();
	
     public void displaylist() {
    	 System.out.println("\n--- Todo List ---");
         if (tasks.isEmpty()) {
             System.out.println("No tasks in the list.");
         } else {
             for (int i = 0; i < tasks.size(); i++) {
                 System.out.println((i + 1) + ". " + tasks.get(i));
             }
         }
     }
     public void addTask(String taskname) {
           	tasks.add(taskname);
           	System.out.println("Task added successfully");
           	
     }
     public void remove(int taskindex) {
    	  if (taskindex >= 0 && taskindex < tasks.size()) {
              String removedTask = tasks.remove(taskindex);
              System.out.println("Task '" + removedTask + "' removed successfully!");
          } else {
              System.out.println("Invalid task index. No task removed.");
          }
    	 
     }
     
     public void completeTask(int taskIndex) {
         if (isValidIndex(taskIndex)) {
             String completedTask = tasks.remove(taskIndex);
             System.out.println("Task '" + completedTask + "' marked as completed!");
         } else {
             System.out.println("Invalid task index.");
         }
     }
     private boolean isValidIndex(int index) {
         return index >= 0 && index < tasks.size();
     }
     
   
   
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TodoList menu=new TodoList();int ch;
       Scanner sc1=new Scanner(System.in);
      do {
    	  System.out.println("~~~~~ TO-DO LIST APP MENU~~~~");
			
    	  System.out.println("Press 1 to ADD A TASK to your list");
    	  System.out.println("Press 2 to DISPLAY your TASKS");
    	  System.out.println("Press 3 to REMOVE A TASK from your list");
    	  System.out.println("Press 4 to MARK a task as COMPLETE");
    	  System.out.println("Press 5 to EXIT todoapp list");
    	   ch =sc1.nextInt();
    	  switch(ch) {
    	  case 2: menu.displaylist();break;
    	  case 1: System.out.println("Enter task name"); String taskname=sc1.next();menu.addTask(taskname);break;
    	  case 3:System.out.print("Enter the index of the task to remove: ");
          int taskIndex = sc1.nextInt();
          sc1.nextLine(); 
          menu.remove(taskIndex);
          break;
    	  case 4: System.out.print("Enter the index of the task to mark as completed: ");
    	    int completedTaskIndex = sc1.nextInt();
    	    sc1.nextLine();
    	    menu.completeTask(completedTaskIndex);
    	    break;
    	  case 5:System.out.println("Exiting the Todo List App. Goodbye!");
          break;
          default: System.out.println("Invalid choice. Please try again.");
    	          
    	  
    	  
    	  
    	  }
      }while(ch!=5); sc1.close();
	}

}
