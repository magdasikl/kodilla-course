package com.kodilla.testing.forum.statistics;

import java.util.List;

class CreateStatistics implements Statistics{

    private List<String> listOfUsers;

    private int numberOfUsers;

    private int numberOfPosts;

    private int numberOfComments;

    private int avgPostUser;

    private int avgComUser;

    private  int avgComPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }


    public int getAvgPostUser() {
        return avgPostUser;
    }

    public int getAvgComUser() {
        return avgComUser;
    }

    public int getAvgComPost() {
        return avgComPost;
    }

    public List<String> usersnames() {
        return listOfUsers;
    }

    public int postsCount() {
        return numberOfPosts;
    }

    public int commentsCount() {
        return numberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics){
        //liczbę postów,
        numberOfPosts = statistics.postsCount();
        //lista użytkowników
        listOfUsers = statistics.usersnames();
        //liczbę użytkowników,
        numberOfUsers = listOfUsers.size();
        //średnią liczbę postów na użytkownika,
        avgPostUser = numberOfPosts/numberOfUsers;
        //liczbę komentarzy
        numberOfComments = statistics.commentsCount();
        //średnią liczbę komentarzy na użytkownika
        avgComUser = numberOfComments/numberOfUsers;
        //średnią liczbę komentarzy na post
        avgComPost = numberOfComments/numberOfPosts;
    }

    public String showStatisctics(){
       String tekst = "Srednia liczba postów na użytkownika wynosi: "+ avgPostUser +" Srednia liczba komentarzy na użytkownika wynosi: "+ avgComUser+ " Srednia liczba komentarzy na post wynosi: " + avgComPost;
        return tekst;
    }

}
