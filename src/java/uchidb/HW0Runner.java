package uchidb;

import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author aelmore
 */
public class HW0Runner {

	//TODO you likely will need to add member variable
    private static class MyCollections implements Containers<Integer, String> {
	public Set<Integer> initSet(Integer[] tArray) {
	    return new HashSet<Integer>(Arrays.asList(tArray));
	}
	public List<Integer> initList(Integer[] tArray) {
	    return Arrays.asList(tArray);
	}

    }

    private static MyCollections collections = new MyCollections();

	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

        // The Integer and String are the generics defining the object: it's not
        // just a container, but a container of Integer and String.
	public static Containers<Integer, String> getContainers() {
	    return collections;
	}


	public static void main(String[] args){

	}
}
