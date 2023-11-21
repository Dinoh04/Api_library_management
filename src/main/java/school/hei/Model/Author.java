package school.hei.Model;

public class Author {
    private int authorId;
    private String name;
    private String sex;

    public Author(int idauthor, String name, String sex) {
        this.authorId = idauthor;
        this.name = name;
        this.sex = sex;
    }

    public int getIdauthor() {
        return authorId;
    }

    public void setIdauthor(int idauthor) {
        this.authorId = idauthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
