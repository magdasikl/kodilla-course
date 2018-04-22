package com.kodilla.stream.forumuser;

import javax.validation.constraints.Max;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    public static List<ForumUser> getUserList() {

        final List<ForumUser> theList = new ArrayList<>();

        theList.add(new ForumUser(001, "Magda", 'F', 1987, 7, 12, 123));
        theList.add(new ForumUser(002, "Jaś", 'M', 2000, 8, 23, 345));
        theList.add(new ForumUser(003, "Sara", 'F', 1999, 1, 24, 198));
        theList.add(new ForumUser(004, "Adam", 'M', 1998, 11, 15, 1234));

//        public List<ForumUser> getList() {
            return new ArrayList<ForumUser>(theList);
//        }
    }
}
