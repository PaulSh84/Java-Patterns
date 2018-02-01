package CommandPattern;

import CommandPattern.Interface.Command;

public class CommandInvoker implements Command {

    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
