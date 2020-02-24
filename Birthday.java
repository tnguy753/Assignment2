import java.util.Random;

import javax.swing.JOptionPane;
public class Birthday {
	public static void main(String[] args) {
		String name, ageStr, option, ans;
		double cost, totalCost = 0;
		int age;
		boolean check = true;
		Toy a = new Toy();
	
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children ");
		while (check)
		{
			name = JOptionPane.showInputDialog("Enter the name of the child");
			ageStr = JOptionPane.showInputDialog("How old is the child");
			age = Integer.parseInt(ageStr);
			a.setAge(age);
	
			option = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			a.setToy(option);
			
			a.setCost(a.getToy());
	
			if (a.ageOK())
			{
				JOptionPane.showMessageDialog(null, "Good choice");
			}
			else {
				JOptionPane.showMessageDialog(null, "The toy is not appropriate for your age.");
				ans= JOptionPane.showInputDialog("Do you want to continue?");
				if (ans.equalsIgnoreCase("no"))
				{
					ans = JOptionPane.showInputDialog("Do you want to try another toy? (Yes or No)");
					if (ans.equalsIgnoreCase("yes"))
						check = true;
					else {
						check = false;
					continue;}
				}
			}
			ans = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			a.addCard(ans);
			ans = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			a.addBalloon(ans);
			cost = a.getCost();
			
		
			
			JOptionPane.showMessageDialog(null, "The gift for " + name + " at " + age + " years old is " + option + " for " + cost );
			totalCost+=cost;
	
	
			ans = JOptionPane.showInputDialog("Do you want to try another toy? (Yes or No)");
			if (ans.equalsIgnoreCase("yes"))
				check = true;
			else
				check = false;
		}
			JOptionPane.showMessageDialog(null, "The total cost for your order is "+ totalCost);
			
			Random R = new Random();
		      int order = R.nextInt(100000);
			      JOptionPane.showMessageDialog(null, " Order number is " + order + "\n Programmer: Thao Nguyen");
			 }


			
	}