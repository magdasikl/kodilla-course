package com.kodilla.testing.forum.statistics;

import java.util.List;

class Stat implements Statistics{

    private List<String> listOfUsers;

    private int numberOfPosts;

    private int numberOfComments;

    private int avgPostUser;

    private int avgComUser;

    private  int avgComPost;


    public Stat(List<String> listOfUsers, int numberOfPosts, int numberOfComments) {
        this.listOfUsers = listOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
    }

    @Override
    public List<String> usersnames() {
        return listOfUsers;
    }

    @Override
    public int postsCount() {
        return numberOfPosts;
    }

    @Override
    public int commentsCount() {
        return numberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics){
        int post = statistics.postsCount();
        List<String> user = statistics.usersnames();
        int qUsres = user.size();
        avgPostUser = post/qUsres;


        int comment = statistics.commentsCount();
        avgComUser = comment/qUsres;


        avgComPost = comment/post;


    }

    public void showStatisctics(){
        System.out.println("Srednia liczba postów na użytkownika wynosi: "+ avgPostUser);
        System.out.println("Srednia liczba komentarzy na użytkownika wynosi: "+ avgComUser);
        System.out.println("Srednia liczba komentarzy na post wynosi: " + avgComPost);
    }

}
