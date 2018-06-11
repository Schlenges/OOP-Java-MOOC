
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object){

        if (object == null || getClass() != object.getClass()) { // or !(object instanceof Bird)
            return false;
        }

        Bird other = (Bird) object;

        return (this.latinName == other.latinName && this.ringingYear == other.ringingYear);
    }

    public int hashCode() {
        return this.latinName.hashCode() + this.ringingYear;
    }
    
}


