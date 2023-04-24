package PA3;

import java.util.Scanner;

public final class Browser {
	
	private Stack fwdStack, bwdStack;
	private String currentWebsite;
	private Scanner scan;
	
	public Browser() {
		fwdStack = new Stack();
		bwdStack = new Stack();
		currentWebsite = "";
		scan = new Scanner(System.in);
	}
	
	public final void run(){
		boolean browserOpen = true;
		while(browserOpen) {
			System.out.println("Current Website: " + currentWebsite);
			System.out.print("Enter choice (N for new website, B to go back, F to go forward, X to quit): ");
			char c = scan.next().charAt(0);
			if(c == 'n') {
				this.newWebsite();
			}
			else if(c == 'b') {
				this.back();
			}
			else if(c == 'f'){
				this.forward();
			}
			else if(c == 'x'){
				browserOpen = false;
				System.out.println("\nBrowser closed. Goodbye!");
			}
			else {               //added error message if user enters the wrong input
				System.out.println("Invalid input. Expected n,b,f,x");
			}
			System.out.println();
		}
		scan.close();
	}
	
	private final void newWebsite() {
		System.out.print("Enter website link: ");
		String websiteLink = scan.next();
		if(!websiteLink.equals(this.currentWebsite)) { //felt weird typing an if-statement that if true does nothing
			bwdStack.push(this.currentWebsite);        //so I flipped the condition and got rid of the else-statement
			this.currentWebsite = websiteLink;        
			fwdStack.clear();
		}
	}
	
	private final void back() {
		if(bwdStack.size() == 0) {
			System.out.println("Back button is disabled");
		}
		else {
			fwdStack.push(this.currentWebsite);
			this.currentWebsite = bwdStack.pop();
		}
	}
	
	private final void forward() {
		if(fwdStack.size() == 0) {
			System.out.println("Forward button is disabled");
		}
		else {
			bwdStack.push(this.currentWebsite);
			this.currentWebsite = fwdStack.pop();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
