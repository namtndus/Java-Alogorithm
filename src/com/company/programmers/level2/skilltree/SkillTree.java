package com.company.programmers.level2.skilltree;

public class SkillTree {

    static String skill = "CBD";
    static String[] skill_trees = {"BACDE","CBADF","AECB","BDA"};

    public static void main(String[] args) {
        int answer = 0;
        for(String skillTree : skill_trees){
            String tempSkill = skillTree;
            for(int i = 0; i < skillTree.length(); i++){
                String s = skillTree.substring(i, i+1);
                if(!skill.contains(s)){
                    tempSkill = tempSkill.replace(s,"");
                }
            }

            if(skill.indexOf(tempSkill) == 0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
