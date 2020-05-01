/* Attendance review program*/
/*The following program asks the user to enter their attendance. Then it calculates the attendance in percentage and according to specific constranints it displays the
message to the user. Exception handling is done when the user enters invalid attendance. */
 //package com.company;
 import java.io.PrintWriter;
 import java.io.File;                                           // Import the File class
 import java.util.*;
 import java.io.IOException;                                    // Import the IOException class to handle errors

 class AttendanceReview
 {
     static void Result42(double count)
     {
         double x;
         x = (count/84)*100;
         if(x>85)
         {
             Assignment(1);
         }
         else if(x>75 && x<85)
         {
             Assignment(2);
         }
         else if(x>65 && x<75)
         {
             Assignment(3);
         }
         else if(x<65)
         {
             Assignment(4);
         }

     }
     static void Result21(double count)
     {
         double x;
         x = (count/63)*100;
         if(x>85)
         {
             Assignment(1);
         }
         else if(x>75 && x<85)
         {
             Assignment(2);
         }
         else if(x>65 && x<75)
         {
             Assignment(3);
         }
         else if(x<65)
         {
             Assignment(4);
         }

     }
     static void Result(double x)
     {
         if(x>85)
         {
             Assignment(1);
         }
         else if(x>75 && x<85)
         {
             Assignment(2);
         }
         else if(x>65 && x<75)
         {
             Assignment(3);
         }
         else if(x<65)
         {
             Assignment(4);
         }

     }
     static void Assignment(int y)
     {
         try {
             File file  = new File("Review.txt");
             PrintWriter pw = new PrintWriter(file);
             switch(y)
             {
                 case 1:
                     System.out.println("You are soooo lucky!!");
                     System.out.println("You are now eligible to give exams");
                     break;
                 case 2:
                     System.out.println("You have less attendance!!");
                     System.out.println("You have to write one assignment!");
                     break;
                 case 3:
                     System.out.println("You have very less attendance!!");
                     System.out.println("You have to write two assignments! ");
                     break;
                 case 4:
                     System.out.println("Oops!!");
                     System.out.println("You are detained! ");
             }
             pw.close();}catch(IOException e){
             e.printStackTrace();
         }
     }
     public static void main(String[] args)
     {

         Scanner scan = new Scanner(System.in);
         int c=0;

         try {
             File file = new File("Review.txt");
             if (!file.exists())
                 file.createNewFile();
             PrintWriter pw = new PrintWriter(file);

             while (c != 2) {
                 //pw.println("                                   This is your Attendance Review");
                 String name = new String();
                 int rollNumber=0,count=0;
                 int oop=-1,dc =-1,de=-1,dm=-1,dsa=-1,pe=-1,oopLab=-1,deLab=-1,dsaLab=-1,dmTut=-1,dcTut=-1;
                 double oopavg, dcavg, deavg, dsaavg, dmavg,peavg;
                 double oopper,dcper,deper,dsaper,dmper,peper;
                 System.out.println("Enter your First Name\n");
                 name = scan.next();
                 while (count != name.length()) {
                     for (int i = 0; i < name.length(); i++) {
                         if ((name.charAt(i) >= 65 && name.charAt(i) <= 90) || (name.charAt(i) >= 97 && name.charAt(i) <= 122)) {
                             count++;
                         }
                     }
                     if (count != name.length()) {
                         count = 0;
                         System.out.println("Its a wrong input");
                         System.out.println("Enter your First Name in characters");
                         name = scan.next();
                     } else {
                         break;
                     }
                 }
                 pw.println("                                   This is "+name+"'s Attendance Review");
                 pw.println("Name : "+name);

                 while (!(rollNumber > 0 && rollNumber <= 240)) {
                     try {
                         System.out.println("Enter your Roll number in digits\n");
                         String s = scan.nextLine();
                         rollNumber = scan.nextInt();
                         if (!(rollNumber > 0 && rollNumber <= 240)) {
                             System.out.println("Enter the roll Number within the bounds of 240");
                             rollNumber = 0;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter your roll number in digits");
                     }
                 }
                 pw.println("Roll number : " +rollNumber);

                 //Ask the user to enter their attendance in 5 subjects.


                 //OOP
                 while (!(oop >= 0 && oop <= 42)) {
                     try {
                         System.out.println("Enter number OOP lectures you attended out of the 42 lectures");
                         oop = scan.nextInt();
                         if (!(oop >= 0 && oop <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             oop = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 while (!(oopLab >= 0 && oopLab <= 42)) {
                     try {
                         System.out.println("Enter number OOP labs you attended out of the 42 labs");
                         String s = scan.nextLine();
                         oopLab = scan.nextInt();
                         if (!(oopLab >= 0 && oopLab <= 42)) {
                             System.out.println("Enter the number of labs attended within the bounds of 42");
                             oopLab = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 oopavg = (oop + oopLab);
                 oopper = (oopavg / 84) * 100;
                 System.out.println("Your OOP Attendance review : ");
                 Result42(oopavg);
                 pw.println("OOP Attendance : " + oopper + "%");
                 System.out.println();

                 //DSA
                 while (!(dsa >= 0 && dsa <= 42)) {
                     try {
                         System.out.println("Enter number Data Structures and Algorithms lectures you attended out of the 42 lectures ");
                         dsa = scan.nextInt();
                         if (!(dsa >= 0 && dsa <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             dsa = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 while (!(dsaLab >= 0 && dsaLab <= 21)) {
                     try {
                         System.out.println("Enter number dsa labs you attended out of the 21 labs");
                         dsaLab = scan.nextInt();
                         if (!(dsaLab >= 0 && dsaLab <= 21)) {
                             System.out.println("Enter the number of labs attended within the bounds of 21");
                             dsaLab = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 dsaavg = (dsa + dsaLab);
                 dsaper = (dsaavg / 63) * 100;
                 System.out.println("Your DSA Attendance review : ");
                 Result21(dsaavg);
                 pw.println("DSA Attendance : " + dsaper + "%");
                 System.out.println();

                //DE
                 while (!(de >= 0 && de <= 42)) {
                     try {
                         System.out.println("Enter number Digital Electronics lectures you attended out of the 42 lectures ");
                         de = scan.nextInt();
                         if (!(de >= 0 && de <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             de = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 while (!(deLab >= 0 && deLab <= 21)) {
                     try {
                         System.out.println("Enter number DE labs you attended out of the 21 labs");
                         deLab = scan.nextInt();
                         if (!(deLab >= 0 && deLab <= 21)) {
                             System.out.println("Enter the number of labs attended within the bounds of 21");
                             deLab = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 deavg = (de + deLab);
                 deper = (deavg / 63) * 100;
                 System.out.println("Your DE Attendance review : ");
                 Result21(deavg);
                 pw.println("DE Attendance : " + deper + "%");
                 System.out.println();

                 //DC
                 while (!(dc >= 0 && dc <= 42)) {
                     try {
                         System.out.println("Enter number Data Communication lectures you attended out of the 42 lectures ");
                         dc = scan.nextInt();
                         if (!(dc >= 0 && dc <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             dc = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 while (!(dcTut >= 0 && dcTut <= 21)) {
                     try {
                         System.out.println("Enter number DC tutuorials you attended out of the 21 tuts");
                         dcTut = scan.nextInt();
                         if (!(dcTut >= 0 && dcTut <= 21)) {
                             System.out.println("Enter the number of tuts attended within the bounds of 21");
                             dcTut = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 dcavg = (dc + dcTut);
                 dcper = (dcavg / 63) * 100;
                 System.out.println("Your DC Attendance review : ");
                 Result21(dcavg);
                 pw.println("DC Attendance : " + dcper + "%");
                 System.out.println();

                 //DM
                 while (!(dm >= 0 && dm <= 42)) {
                     try {
                         System.out.println("Enter number Discrete mathematics lectures you attended out of the 42 lectures ");
                         dm = scan.nextInt();
                         if (!(dm >= 0 && dm <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             dm = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 while (!(dmTut >= 0 && dmTut <= 21)) {
                     try {
                         System.out.println("Enter number DM tutuorials you attended out of the 21 tuts");
                         dmTut = scan.nextInt();
                         if (!(dmTut >= 0 && dmTut <= 21)) {
                             System.out.println("Enter the number of tuts attended within the bounds of 21");
                             dmTut = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 dmavg = (dm + dmTut);
                 dmper = (dmavg / 63) * 100;
                 System.out.println("Your DM Attendance review : ");
                 Result21(dmavg);
                 pw.println("DM Attendance : " + dmper + "%");
                 System.out.println();

                 //PE
                 while (!(pe >= 0 && pe <= 42)) {
                     try {
                         System.out.println("Enter number Economics lectures you attended out of the 42 lectures ");
                         pe = scan.nextInt();
                         if (!(pe >= 0 && pe <= 42)) {
                             System.out.println("Enter the number of lectures attended within the bounds of 42");
                             pe = -1;
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Enter the value in digits");
                     }
                 }
                 System.out.println("Your PE Attendance review : ");
                 peavg = (pe / (double) 42) * 100;
                 Result(peavg);
                 pw.println("PE Attendance : " + peavg + "%");
                 System.out.println();

                 System.out.println("                                   This is your Attendance Review");
                 System.out.println("OOP Attendance : " + oopper + " %");
                 System.out.println("DC Attendance : " + dcper + " %");
                 System.out.println("DM Attendance : " + dmper + " %");
                 System.out.println("DE Attendance : " + deper + " %");
                 System.out.println("PE Attendance : " + peavg + " %");
                 System.out.println("DSA Attendance : " + dsaper + " %");



                 System.out.println("Do you want to add another recocrd? (1 for yes and 2 for no)");
                 String s=scan.nextLine();
                 c=scan.nextInt();

             }
             scan.close();
             pw.close();
         }catch(IOException e) {
             e.printStackTrace();
         }
     }
 }