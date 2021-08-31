import java.util.*;
public class ATM {
	
	private ArrayList <HashMap<String, Integer>> list;
	
	public ATM (String ID) {
		HashMap <String, Integer> bank = new HashMap<String, Integer> ();
		bank.put(ID, 0);
		list.add(bank);
	}
	
	public void deposit (String ID, int amount){
		for (int i = 0; i < list.size(); i++) {
			HashMap <String, Integer> temp =  list.get(i);
			if (temp.containsKey(ID)) {
				temp.replace(ID, temp.get(ID), temp.get(ID)+amount);
			}
		}
		ATM newAccount = new ATM (ID);
		newAccount.deposit(ID, amount);
	}
}
