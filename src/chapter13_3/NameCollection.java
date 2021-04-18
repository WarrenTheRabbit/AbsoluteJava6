
package chapter13_3;

public class NameCollection {
    
    String[] names;
    
    public NameCollection(String[] names) {
        this.names = names;
    }
    
    public Enumeration getEnumeration() {
        Enumeration enumerator = new Enumeration() {
            
            int index = 0;
            
            @Override
            public boolean hasNext() {
               return index < names.length;
            }

            @Override
            public Object getNext() {
              
                  return names[index++];
    
            }
          
        };
       return enumerator;
    }
}
