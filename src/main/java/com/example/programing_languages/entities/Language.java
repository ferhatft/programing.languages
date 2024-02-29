package com.example.programing_languages.entities;

public class Language {
    private  int id;
    private String Language;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int version;
    private  int projectcount;

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getProjectcount() {
        return projectcount;
    }

    public void setProjectcount(int projectcount) {
        this.projectcount = projectcount;
    }
}
