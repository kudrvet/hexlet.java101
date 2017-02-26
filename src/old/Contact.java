package old;

/**
 * Created by kudrv on 15.02.2017.
 */
public class Contact {
    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    Contact (ContactBuilder contactBuilder)
    {
        this.name=contactBuilder.getName();
        this.surname=contactBuilder.getSurname();

    }
}
