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



}
