package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theresultMapOfUser = theForum.getUserList().stream().filter(forumUser -> forumUser.getSex()=='M').filter(forumUser -> forumUser.dateOfBirthday.getYear()>1998).filter(forumUser -> forumUser.posts>0).collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

//        System.out.println(theresultMapOfUser.size());
        theresultMapOfUser.entrySet().stream().map(integerForumUserEntry -> integerForumUserEntry.getKey()+ ": "+integerForumUserEntry.getValue()).forEach(System.out::println);

    }
}
