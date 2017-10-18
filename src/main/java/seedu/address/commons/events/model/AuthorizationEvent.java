package seedu.address.commons.events.model;

import seedu.address.commons.events.BaseEvent;


public class AuthorizationEvent extends BaseEvent{

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
