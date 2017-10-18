package seedu.address.logic.commands;

import seedu.address.commons.core.EventsCenter;
import seedu.address.commons.events.model.AuthorizationEvent;
import seedu.address.logic.commands.exceptions.CommandException;

import static java.util.Objects.requireNonNull;

/**
 * Adds a person to the address book.
 */
public class SyncCommand extends UndoableCommand {

    public static final String COMMAND_WORD = "sync";
    public static final String COMMAND_ALIAS = "sy";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Syncs the current addressbook with Google Contacts ";

    public static final String MESSAGE_SUCCESS = "Synchronised!";
    public static final String MESSAGE_FAILURE = "Something has gone wrong...";


    @Override
    public CommandResult executeUndoableCommand() throws CommandException {

        try {
            AuthorizationEvent event = new AuthorizationEvent();
            EventsCenter.getInstance().post(event);
            return new CommandResult(String.format(MESSAGE_SUCCESS));
        } catch (Exception e) {
            throw new CommandException(MESSAGE_FAILURE);
        }

    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || other instanceof SyncCommand; // instanceof handles null
    }
}
