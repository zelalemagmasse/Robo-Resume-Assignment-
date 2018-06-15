package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Resume resumeObj = new Resume();
        Scanner keyboard = new Scanner(System.in);
        String name;
        String email;
        String workExpern;
        String educationBack;
        String skillRating;
        String numOfEduAchivmnts;
        String numOfSkill;
        String numOfOrgWorkdON;

        System.out.println("please Enter your name?");
        name = keyboard.nextLine();
        boolean nameIsValid = true;
        while (nameIsValid) {
            if (resumeObj.nameValidator(name)) {
                resumeObj.setName(name);
                nameIsValid = false;
            } else {
                System.out.println("Please Enter your name correctly");
                name = keyboard.nextLine();

            }
        }
        System.out.println("please Enter your Email Address?");
        email = keyboard.nextLine();
        while (true) {
            if (resumeObj.emailValidator(email)) {
                resumeObj.setEmailAddress(email);
                break;
            } else {
                System.out.println("Please Enter your Email correctly");
                email = keyboard.nextLine();

            }
        }

        System.out.println("How many educational achievments do you have? If you have more than ten, please write only 10 ");
        numOfEduAchivmnts = keyboard.nextLine();

        while (true) {
            if (numOfEduAchivmnts.matches("[0-9]") && (Integer.parseInt(numOfEduAchivmnts) <= 10)) {
                break;
            } else {
                System.out.println("please Enter the number correctly");
                numOfEduAchivmnts = keyboard.nextLine();
            }
        }

        int index = 0;
        System.out.printf("please Enter the %s Educational achievements you have starting with the most recent one %n",numOfEduAchivmnts);
        while (!(index == Integer.parseInt(numOfEduAchivmnts))) {

            educationBack = keyboard.nextLine();
            resumeObj.eduackDataBase(educationBack);
            index++;
        }
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

        int indey = 0;
        System.out.printf("please Enter the %s work experience you have starting with the most recent one %n",numOfOrgWorkdON);
        while (!(indey == Integer.parseInt(numOfOrgWorkdON))) {
            workExpern = keyboard.nextLine();
            resumeObj.workExDataBase(workExpern);
            indey++;
        }
        System.out.println("How many skill rating  do you have?. If you have more than ten, please write only 10 ");
        numOfSkill = keyboard.nextLine();

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
            resumeObj.skillRatingDataBase(skillRating);
            indez++;
        }
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

