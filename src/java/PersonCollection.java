public class PersonCollection {
    
    private String name;
    private String hairColor;
    private String eyeColor;
    private int height;
    private int weight;
    
    public PersonCollection (String name, String hairColor, String eyeColor, int height, int weight) {
        
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
    
    public void setHeight (int height) {
    
        this.height = height;
    }
    
    public void setWeight (int weight) {
    
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
    
    public int getHeight () {
        
        return this.weight;
    }
    
    public int getWeight () {
        
        return this.weight;
    }
}
