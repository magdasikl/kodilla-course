package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate now = LocalDate.now();
        LocalDate todayMinus20Years = now.minusYears(20);
        Map<Integer, ForumUser> theresultMapOfUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.dateOfBirthday.isAfter(todayMinus20Years))
                .filter(forumUser -> forumUser.posts>0)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

//        System.out.println(theresultMapOfUser.size());
        theresultMapOfUser.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey()+ ": "+integerForumUserEntry.getValue())
                .forEach(System.out::println);

    }
}
