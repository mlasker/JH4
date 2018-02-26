package People;

import java.util.ArrayList;

public class PersonCollection {
    
    private ArrayList<Person> persArr = new ArrayList<Person>();
    
    
    public void PersonCollection(){
        
    }
    
    public void addPerson(Person p){
        
        this.persArr.add(p);
    }
    
    public void removePerson(int i){
        
        this.persArr.remove(i);
    }
    
    public int getSize() {
        
        int x = persArr.size();
        return x;
    }
    
    public Person getPerson(int i) {
        
        return this.persArr.get(i);
    }
    
    public void editPerson(Person p, int i){
        
        this.persArr.set(i, p);
    }
    
    public void clear(){
        
        this.persArr.clear();
    }    
}
