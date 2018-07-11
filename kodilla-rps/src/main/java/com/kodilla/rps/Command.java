package com.kodilla.rps;

public enum Command {
    Exit("Koniec gry"),
    NewGame("Nowa gra"),
    Move("Wykonano ruch"),
    Error("Błędny klawisz");

    private final String communicate;

    Command(String communicate) {
        this.communicate = communicate;
    }

    public String getCommunicate() {
        return communicate;
    }
}
