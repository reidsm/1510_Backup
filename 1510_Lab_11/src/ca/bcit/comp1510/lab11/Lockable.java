package ca.bcit.comp1510.lab11;

public interface Lockable {

	public void setKey(int key);
	
	public boolean lock(int key);
	
	public boolean locked();
	
	public boolean unlock(int key);
	
}