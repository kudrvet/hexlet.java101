package old;

/**
 * Created by kudrv on 15.02.2017.
 */
public class ContactBuilder {
    private  String name;
    private  String surname;

    public ContactBuilder name(final String name) {
        this.name=name;
        return this;
    }

    public ContactBuilder surname(final String surname) {
        this.surname=surname;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Contact build () {
        return new Contact(this);

    }


}
