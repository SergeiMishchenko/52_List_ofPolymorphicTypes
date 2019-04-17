/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private Object[] list;
    private int filledElements; 
    
    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
         list = new Object[INITIAL_CAPACITY];
         filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
           return filledElements;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
       String descrip = "[";
       for (int i = 0; i < filledElements; i++) {
           descrip += list[i] + ",";
        }
        return descrip + "]";
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int type   // same meaning as in typeOfElements
                        , Integer integerValue
                        , double doubleValue
                        , String stringValue
						, Boolean booleanValue
                        ) {
       if (filledElements == list.length)
            expand();
       if (type == 0)
          list[filledElements++] = integerValue;
       else if (type == 1)
          list[filledElements++] = doubleValue;
       else if (type == 2)
          list[filledElements++] = stringValue;
       else
          list[filledElements++] = booleanValue;
        return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
        System.out.println( "expand... (for debugging)");
          
	    Object[] listCopy = list; 
        list = new Object[2 * filledElements]; 
        for(int i = 0; i < listCopy.length; i++) 
			list[i] = listCopy[i];       
      }
	  
	  public Object get(int index){
          return list [index];
      }
}