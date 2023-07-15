package cn.argentoaskia.beans;

public class FilmInfoBean {
    private Integer id;
    private String title;
    private String description;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FilmInfoBean{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public FilmInfoBean setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public FilmInfoBean setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public FilmInfoBean setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public FilmInfoBean setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public FilmInfoBean setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
