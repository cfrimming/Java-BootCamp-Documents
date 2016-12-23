
public interface Displayable {
/** add output takes a string and adds it to an array
 * 
 * @param s the string to be added
 */
	public abstract void AddOutput(String s);
	
	/**display takes the array and prints it out without new lines
	 * 
	 */
	public abstract void Display();
	
	/** clear takes the array and clears it out
	 * 
	 */
	public abstract void Clear();
	
	public abstract void Println();
}
