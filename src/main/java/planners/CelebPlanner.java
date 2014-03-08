/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planners;

/**
 *
 * @author zaakir
 */
public class CelebPlanner implements Planner{
    
    private String name;
    private String surname;
    private String type;
    private String num;

    public CelebPlanner() {
    }

    public CelebPlanner (Builder build){
        name = build.name;
        surname = build.surname;
        type = build.type;
        num = build.num;
    }

    
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEventType() {
        return type;
    }

    public String getContactNum() {
        return num;
    }

    
    public static class Builder {
        private String name;
    private String surname;
    private String type;
    private String num;
        
        public Builder (){
            this.type = "Celebrity";
        }
        
        public Builder name (String name){
            this.name=name;
            return this;
        }
        
         public Builder surname (String surname){
            this.surname=surname;
            return this;
        }
         
          public Builder num (String num){
            this.num=num;
            return this;
        }
          
           
            public CelebPlanner build(){
            return new CelebPlanner(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CelebPlanner other = (CelebPlanner) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        return true;
    }
    
}
