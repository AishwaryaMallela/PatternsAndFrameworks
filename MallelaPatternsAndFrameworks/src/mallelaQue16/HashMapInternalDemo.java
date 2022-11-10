/**
 * 
 */
package mallelaQue16;

/**
 * @author S546832
 *
 */
public class HashMapInternalDemo {

	/**
	 * @param args
	 */
	String s;
	HashMapInternalDemo(String s)
	  {
	    this.s = s;
	  }
	  
	  @Override
	  public int hashCode() 
	  {
	     return (int)s.charAt(0);
	  }

	  @Override
	  public boolean equals(Object o)
	  {
	    return s.equals((String)o);
	  }

}
