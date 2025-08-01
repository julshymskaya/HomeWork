package HomeWork10.TaskOneAndOptional;

import java.util.Objects;

public class UserOptional implements Cloneable {
    private int id;
    private String name;
    private int phoneNumber;
    private User user;

    public UserOptional(int id, String name, int phoneNumber, User user) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOptional that = (UserOptional) o;
        return id == that.id && phoneNumber == that.phoneNumber && Objects.equals(name, that.name) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNumber, user);
    }

    @Override
    public String toString() {
        return "UserOptional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public UserOptional deepClone() throws CloneNotSupportedException {
        UserOptional userOptional = (UserOptional) super.clone();
        userOptional.user = (User) user.clone();
        return userOptional;
    }
}
