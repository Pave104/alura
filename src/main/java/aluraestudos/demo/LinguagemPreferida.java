package aluraestudos.demo;

public class LinguagemPreferida {


    private String name;
    private String image;
    private int rating;

    public LinguagemPreferida(String name,String image,int rating) {
           this.name=name;
           this.image=image;
           this.rating=rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }




}
