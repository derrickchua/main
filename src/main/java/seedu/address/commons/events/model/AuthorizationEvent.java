package seedu.address.commons.events.model;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.person.ReadOnlyPerson;

import java.util.List;


public class AuthorizationEvent extends BaseEvent{

    List<ReadOnlyPerson> personList;

    public AuthorizationEvent (List<ReadOnlyPerson> personList) {
        this.personList = personList;
    }

    public List<ReadOnlyPerson> getPersonList(){
        return this.personList;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
