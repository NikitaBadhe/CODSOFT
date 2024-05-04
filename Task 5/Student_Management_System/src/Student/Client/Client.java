package Student.Client;

import java.util.Scanner;

import Student.Student;
import StudentManagement.StudentManagement;

public class Client {
	public static void main(String[] args) {
		System.out.println("************************** Student Management System **************************");
		Scanner sc = new Scanner(System.in);
		char option;

		while (true) {

			System.out.println(
					" Enter 1 to Insert new Record \n Enter 2 to Update Student \n Enter 3 to Delete Student \n Enter 4 to see perticular student data \n Enter 5 see all students \n Enter 6 to exit");
			System.out.println("Enter your Choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {

				Student stud = new Student();

				System.out.println("Enter Id :");
				int id = sc.nextInt();
				System.out.println("Enter Name : ");
				String name = sc.next();
				System.out.println("Enter Contact : ");
				String contact = sc.next();
				System.out.println("Enter Address : ");
				String address = sc.next();
				stud.setId(id);
				stud.setName(name);
				stud.setContact(contact);
				stud.setAddress(address);
				StudentManagement.insert(stud);
				System.out.println("Record Inserted Successfully");
				break;

			}

			case 2: {
				Student stud = new Student();

				System.out.println("Enter Id of Student for update :");
				int id = sc.nextInt();
				System.out.println("Enter Updated Name : ");
				String name = sc.next();
				System.out.println("Enter Updated Contact : ");
				String contact = sc.next();
				System.out.println("Enter Updated Address : ");
				String address = sc.next();
				stud.setId(id);
				stud.setName(name);
				stud.setContact(contact);
				stud.setAddress(address);
				StudentManagement.update(stud);
				System.out.println("Record updated Successfully");
				break;
			}

			case 3: {

				Student stud = new Student();

				System.out.println("Enter Id of Student for delete :");
				int id = sc.nextInt();
				stud.setId(id);
				StudentManagement.delete(stud);
				System.out.println("Record deleted successfully");
				break;
			}

			case 4: {
				
				System.out.println("Enter Id of Student for retrive data :");
				int id = sc.nextInt();
				System.out.println("Record of Student with Id : "+id);
				StudentManagement.showData(id);
				break;
			}

			case 5: {
				System.out.println("All Records in Student Management System");
				StudentManagement.showAllData();
				break;

			}
			
			case 6:{
				break;
			}

			default:
				System.out.println("Invalid choice");
			
			}

			System.out.println("Do you want to continoue? Y/N");
			option = sc.next().charAt(0);
			if (option == 'y' || option == 'Y') {

			} else if (option == 'n' || option == 'N') {
				break;
			}
		}
	}
}
