package paintorderservice;

import java.util.ArrayList;

public class Artist {

    public enum Status {
        ACTIVE,
        INACTIVE
    }

    private String fullName;  //полное имя
    private String phoneNumber;  //контактный телефон
    private String email;  //электронная почта
    private Status status;  //статус
    private String workExperience;  //опыт работы
    private String achievements;  //достижения
    private ArrayList<String> styles;  //стили
    private ArrayList<String> genres;  //жанры
    private ArrayList<String> technicians;  //техники
    private ArrayList<String> materials;  //материалы

    public Artist(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public ArrayList<String> getStyles() {
        return styles;
    }

    public void setStyles(ArrayList<String> styles) {
        this.styles = new ArrayList<String>();
        this.styles.add("Реализм");
        this.styles.add("Кубизм");
    }


    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public ArrayList<String> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(ArrayList<String> technicians) {
        this.technicians = technicians;
    }

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }
}

