package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Resume class object is assigned resumeObj reference
        Resume resumeObj = new Resume();
        ResumeMaker makerObj= new ResumeMaker();
        Scanner keyboard = new Scanner(System.in);
        String name;//to hold the name to display on the resume
        String email;//to hold the email to display on the resume
        String workExpern;//variable to store work experince the user has
        String educationBack;//variable to store the educational achivements a user has
        String skillRating;//variable to store the skil rating  a user has
        String numOfEduAchivmnts;//to hold the number of eductional achivement a user has. later this will be turned in to and Integer value
        String numOfSkill;//to hold the number of number of skill a user has. later this will be turned in to and Integer value
        String numOfOrgWorkdON;//to hold the number of different organization  a user has worked. later this will be turned in to and Integer value

        System.out.println("please Enter your name?");//propmting user for name
        name = keyboard.nextLine();//receiving the name from the user
        boolean nameIsValid = true;//initializing the control varialble to true
        while (nameIsValid) {
            if (makerObj.nameValidator(name)) {//calling the name validator from the Resume class
                resumeObj.setName(name);//if it is valid the loop breaks here other wise it prompt user for another try and keep moving until the user enters the correct format
                nameIsValid = false;
            } else {
                System.out.println("Please Enter your name correctly");//prompting user for the correct format
                name = keyboard.nextLine();

            }
        }
        System.out.println("please Enter your Email Address?");//prompting users for email address
        email = keyboard.nextLine();//receing an email address from user
        /*
        the below while loop validate the email address the user enteres using regular expression. the method is called from another class
        "Resume" .it will keep prompting the user to Enter the correct email address until it receives the correct fomrat
         */
        while (true) {
            if (makerObj.emailValidator(email)) {
                resumeObj.setEmailAddress(email);
                break;
            } else {
                System.out.println("Please Enter your Email correctly");
                email = keyboard.nextLine();

            }
        }
        // prompting user to enter howmany educational achievments they have so that the program loop to receive eduational achievment until it finally reaches this value times
        System.out.println("How many educational achievments do you have? If you have more than ten, please write only 10 ");
        numOfEduAchivmnts = keyboard.nextLine();
       /*
       this validate the number which the user enters and loop until it receves the correct format
        */
        while (true) {
            if (numOfEduAchivmnts.matches("[0-9]") && (Integer.parseInt(numOfEduAchivmnts) <= 10)) {
                break;
            } else {
                System.out.println("please Enter the number correctly");
                numOfEduAchivmnts = keyboard.nextLine();
            }
        }
        /*
        prompting user for the eductional background he/she has and loops through the number of experience they have times.
         */
        int index = 0;
        System.out.printf("please Enter the %s Educational achievements you have starting with the most recent one %n Strar",numOfEduAchivmnts);
        while (!(index == Integer.parseInt(numOfEduAchivmnts))) {

            educationBack = keyboard.nextLine();
            makerObj.eduackDataBase(educationBack);
            index++;
        }
        /*
        prompting user for the number of work experience they have to use it for the loo below
         */
        System.out.println("How many work experience do you have?. If you have more than ten, please write only 10 ");
        numOfOrgWorkdON = keyboard.nextLine();

        while (true) {
            if (numOfOrgWorkdON.matches("[0-9]") && (Integer.parseInt(numOfOrgWorkdON) <= 10)) {
                break;
            } else {
                System.out.println("please Enter the number correctly");
                numOfOrgWorkdON = keyboard.nextLine();
            }
        }

        /*
        prompting user for experience loop until they finish inserting
         */
        int indey = 0;
        System.out.printf("please Enter the %s work experience you have starting with the most recent one %n",numOfOrgWorkdON);
        while (!(indey == Integer.parseInt(numOfOrgWorkdON))) {
            workExpern = keyboard.nextLine();
            makerObj.workExDataBase(workExpern);//adding the value to the arrayList in the Resume class through a methood calling
            indey++;
        }
        /*
        prompting user for the number of skill rating  they have to use it for the loo below
         */
        System.out.println("How many skill rating  do you have?. If you have more than ten, please write only 10 ");
        numOfSkill = keyboard.nextLine();
        /*
        prompting user for skill rating and  loop until they finish inserting
         */
        while (true) {
            if (numOfSkill.matches("[0-9]") && (Integer.parseInt(numOfSkill) <= 10)) {
                break;
            } else {
                System.out.println("please Enter the number correctly");
                numOfSkill = keyboard.nextLine();
            }
        }

        int indez = 0;
        System.out.printf("please Enter %s skill Rating  you have %n",numOfSkill);
        while (!(indez == Integer.parseInt(numOfSkill))) {
            skillRating = keyboard.nextLine();
            makerObj.skillRatingDataBase(skillRating);//adding the value to the arrayList in the Resume class through a method calling
            indez++;
        }
        /*
        displaying the resume to the user feching from the ArrayList from Resume Class
         */
        System.out.println("NAME:");
        System.out.println(resumeObj.getName());
        System.out.println("EMAIL ADDRESS:");
        System.out.println(resumeObj.getEmailAddress());

        System.out.println("EDUCATION:");
        for (String eduIndex : resumeObj.getEduBackGround()){
            System.out.println(eduIndex);
        }


        System.out.println("WORK EXPERIENCE:");
        for (String workIndex : resumeObj.getWorkExperience())
            System.out.println(workIndex);


           System.out.println("WORK SKILLS RATING:");
        for (String skillIndex : resumeObj.getSkillsRating())
            System.out.println(skillIndex);


    }


}

