/**
 * 
 */
package exo1;

/**
 * @author Khaled SAAD
 *
 */
public interface Stack {
	public boolean empty() ;
	public void push(Value v) ;
	public Value pop() throws EmptyStackException;
	public Value peek() throws EmptyStackException;
}
