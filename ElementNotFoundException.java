package module10project;



/**
 * ElementNotFoundException represents the situation in which a target element 
 * is not present in a collection
 *
 * /**
 * @author Dan Lewis
 * @Class: CSC205
 * @Date Written: 04/26/20
 * @Program Description: Palindrome tester using stacks and queues
 */

public class ElementNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sets up this exception with an appropriate message.
	 */
	public ElementNotFoundException (String collection)
	{
		super ("The target element is not in this " + collection);
	}
}
