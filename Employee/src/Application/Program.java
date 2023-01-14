package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
		List<Employee> list = new  ArrayList<>();
		
		System.out.println("Numero de funcinarios da empresa");
        int N = input.nextInt();
        
        
        for(int i=1 ;i<=N ;i++) {
        	System.out.println("Dados do funcionario " + i);
        	System.out.print("Tercerizado? (y\n)");
        	char type = input.next().charAt(0);
        	System.out.print("Name: ");
        	input.nextLine();
        	String name = input.nextLine();
        	System.out.println("Hours: ");
        	int hour = input.nextInt();
        	System.out.println("Value per  hour: ");
        	double valuePerhour = input.nextDouble();
        	
        	if(type == 'y') {
        		System.out.println("Addition charge: ");
        		double aditionalCharge = input.nextDouble();
        		list.add(new OutsourceEmployee(name, hour, valuePerhour, aditionalCharge));
        	}
        	else {
        		list.add(new Employee(name, hour, valuePerhour));
        	}
        	
        }
        
        System.out.println();
        System.out.println("Pagamentos");
        
        for(Employee emp : list) {
        	
        	System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.Payment()));
        }
        
        input.close();
	}

}
