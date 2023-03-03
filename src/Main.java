import Praktika.AgeException;
import Praktika.BadRequestException;
import Praktika.Instagram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /* if (Math.sqrt(a)%1!=0){
         throw  new RuntimeException();
     }
        System.out.println(Math.sqrt(a));*/
      /*      try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Number can't be divided to zero  ");
            } catch (InputMismatchException e) {
                System.out.println("Wrong input !!!");
            } finally {
                System.out.println("~~~Finally blok~~~");
            }*/
/*  try {
      System.out.println("Atynyzdy jazyznyz ");
      String name = scanner.nextLine();


      System.out.println( "Familyanyzdy jazynyz ");
      String lastName = scanner.nextLine();


      System.out.println("Jashynyzdy jazynyz ");
      int age =Integer.parseInt(scanner.nextLine());
      if (age<18) {
          System.out.println("Sizge bolboit ");
      }else {
          throw new
      }


      System.out.println("Parol jazynyz ");
      int password = scanner.nextInt();
      if (password<7) {
          System.out.println("Parol kerek ");
      }

  }catch ()*/

      /*  Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Atynyzdy jazynyz ");
            String fisrtName = scanner.nextLine();
            System.out.println("Familya jazynyz ");
            String lastName = scanner.nextLine();
            System.out.println("Jashynnyzdy jazynyz ");
            int age = scanner.nextInt();
            if (age <= 0) {
                throw new AgeException("Age can't be null or negative ");
            }
            System.out.println("email jazynyz ");
            String email = new Scanner(System.in).nextLine();
            if (!email.contains("@")) {
                throw new BadRequestException("Email tuura emes");
            }
            System.out.println("Password");
            String password = new Scanner(System.in).nextLine();
            if (password.length() > 7) {
                throw new BadRequestException("Parol tuura emes");
            }
            Instagram instagram = new Instagram(fisrtName,lastName,age,email,password);
            System.out.println(instagram);
        }  catch (BadRequestException e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Error");
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }*/
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Atynyzdy jazynyz ");
            String firstName = scanner.nextLine();
            System.out.println("Familya jazynyz ");
            String lastName = scanner.nextLine();
            System.out.println("Jashynyzdy jazynyz ");
            int age = new Scanner(System.in).nextInt();
            if (age<=0) {
                throw new AgeException("Bolboit ");
            }
                System.out.println("email jazynyz ");
                String email = new Scanner(System.in).nextLine();
                if (!email.contains("@") ) {
                    throw new BadRequestException("Error");
                }
                    System.out.println("Write password ");
                    String password = new Scanner(System.in).nextLine();
                    if (password.length() > 7){
                        throw new BadRequestException("Ne pravilno ");
                    }
                Instagram instagram = new Instagram(firstName,lastName,age,email,password);
            System.out.println(instagram);
            }catch (BadRequestException e){
            System.out.println(e.getMessage());
        }catch (AgeException ageException){
            System.out.println(ageException.getMessage());
        }
        }
    }


