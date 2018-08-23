package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    Integer IdUser;
    String nameUser;
    char sex;
    LocalDate dateOfBirthday;
    int posts;

    public ForumUser(int idUser, String nameUser, char sex, int dateOfYear,int dateOfMonth, int dateOfDay, int posts) {
        IdUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirthday = LocalDate.of(dateOfYear, dateOfMonth, dateOfDay);
        this.posts = posts;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IdUser=" + IdUser +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirthday=" + dateOfBirthday +
                ", posts=" + posts +
                '}';
    }
}
