package cn.argentoaskia.beans;

import java.sql.Timestamp;

public class FilmTextActor extends FilmTextBean{
    private Integer actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FilmTextActor{");
        sb.append(super.toString());
        sb.append(", actorId=").append(actorId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }

    public Integer getActorId() {
        return actorId;
    }

    public FilmTextActor setActorId(Integer actorId) {
        this.actorId = actorId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public FilmTextActor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public FilmTextActor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public FilmTextActor setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
}
