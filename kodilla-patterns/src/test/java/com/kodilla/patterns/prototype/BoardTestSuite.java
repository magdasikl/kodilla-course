package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
//        Given
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTaks().add(new Task("To Do Task numer " + n)));


        TasksList listInProgress = new TasksList("In Progress task");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTaks().add(new Task("In Progress Task number " + n)));

        TasksList listDone = new TasksList("Done task");
        IntStream.iterate(1,n -> n +1)
                .limit(10)
                .forEach(n -> listDone.getTaks().add(new Task("Done Task number " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Projekt numer 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Projekt number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//        When
        board.getLists().remove(listToDo);

//        Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);
        Assert.assertEquals(2,board.getLists().size());
        Assert.assertEquals(2, cloneBoard.getLists().size());
        Assert.assertEquals(3, deepCloneBoard.getLists().size());
        Assert.assertEquals(cloneBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepCloneBoard.getLists(), board.getLists());

    }

}
