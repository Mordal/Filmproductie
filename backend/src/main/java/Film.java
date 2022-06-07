public class Film {
    private Integer id;
    private String name;
    private Integer yearOfRelease;
    private String director;
    private Float rating;

    public Film(Integer id, String name, Integer yearOfRelease, String director, Float rating){
        this.id = id;
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.rating = rating;
    }

}
