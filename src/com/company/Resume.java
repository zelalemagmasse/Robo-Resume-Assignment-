package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resume {
    private String name;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<String> getEduBackGround() {
        return eduBackGround;
    }

    public void setEduBackGround(ArrayList<String> eduBackGround) {
        this.eduBackGround = eduBackGround;
    }

    public ArrayList<String> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<String> workExperience) {
        this.workExperience = workExperience;
    }

    public ArrayList<String> getSkillsRating() {
        return skillsRating;
    }

    public void setSkillsRating(ArrayList<String> skillsRating) {
        this.skillsRating = skillsRating;
    }

    ArrayList<String> eduBackGround=new ArrayList<>();
    ArrayList<String> workExperience=new ArrayList<>();
    ArrayList<String> skillsRating=new ArrayList<>();;

    public boolean nameValidator(String name){
        return  (name.matches("^[ A-Za-z]+$"));

    }

    public boolean emailValidator(String email)
    {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public void eduackDataBase(String educaion){
        eduBackGround.add(educaion);

    }
    public void workExDataBase(String workExp){
        workExperience.add(workExp);

    }

    public void skillRatingDataBase(String skilRating){
        workExperience.add(skilRating);

    }



}
