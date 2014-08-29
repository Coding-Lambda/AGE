package org.akaarts.AGE;

public class Command {
	
	public String func;
	public String[] args;
	
	public Command(String command){
		command = command.replaceAll("(\\A )|( \\z)", "");
		String[] elem = command.split("[ ]");
		Console.info(elem.length+"");
		func = elem[0].toLowerCase();
		args = new String[elem.length-1];
		for(int ct = 1;ct<elem.length;ct++){
			args[ct-1] = elem[ct].toLowerCase();
		}
	}
	
	public String toString(){
		return "Function: "+func+" / Arguments: "+args.length;
	}
}
