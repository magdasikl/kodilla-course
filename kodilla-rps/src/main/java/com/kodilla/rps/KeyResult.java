package com.kodilla.rps;

public class KeyResult {

    Command command;
    GameMove move;

    public KeyResult(Command command) {
        this(command, null);
        assert command != Command.Move;
    }

    public KeyResult(Command command, GameMove move) {
        this.command = command;
        this.move = move;
    }
}
