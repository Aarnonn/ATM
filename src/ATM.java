import java.util.*;
//Aaron's Code
public class ATM {
	
	private HashMap<String, Double> list;
	
	public ATM() {
		list = new HashMap<String, Double>();
	}
	
	public void deposit(String id, double amt) {
		Double originalAmt = 0.0;
		if (list.get(id) != null) {
			originalAmt = list.get(id);
		}
		list.put(id, amt+originalAmt);
	}
	
	public void withdraw(String id, double amt) {
		double accBalance = list.get(id);
		if (amt>accBalance) {
			System.out.println("Error! Not enough money in account!");
			return;
		}
		list.put(id, accBalance-amt);
	}
	
	public String checkBalance(String id) {
		if (list.get(id) != null) {
			String output = ("Account " + id + " has a remaining balance of " + list.get(id));
			return output;
		}
		return "Error! Account does not exist.";
	}

	public String toString() {
		String output = "";
		for (Map.Entry<String, Double> entry : list.entrySet()) {
			output += entry.getKey() + " " + entry.getValue() + "; ";
		}
		return output;
	}
	
}