package People;

public class Person {
    
    private String name;
    private String hairColor;
    private String eyeColor;
    private String height;
    private String weight;
    
    public Person (String name, String hairColor, String eyeColor, String height, String weight) {
        
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }
    
    public void setName (String name) {
    
        this.name = name;
    }   
    
    public void setHairColor (String haircolor) {
    
        this.hairColor = haircolor;
    }
    
    public void setEyeColor (String eyecolor) {
    
        this.eyeColor = eyecolor;
    }
    
    public void setHeight (String height) {
    
        this.height = height;
    }
    
    public void setWeight (String weight) {
    
        this.weight = weight;
    }
    
    public String getName () {
        
        return this.name;
    }
    
    public String getHairColor () {
        
        return this.hairColor;
    }
    
    public String getEyeColor () {
        
        return this.eyeColor;
    }
    
    public String getHeight () {
        
        return this.weight;
    }
    
    public String getWeight () {
        
        return this.weight;
    }
}
