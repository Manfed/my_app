package pg.eti.inz.settings;

/**
 * Created by Manio on 2016-07-30.
 */
public class Option {

    private String name;
    private String value;

    public Option(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
