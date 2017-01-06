package uchidb;

import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

/**
 * @author aelmore
 */
public class HW0Runner {

	//TODO you likely will need to add member variable
    private static class MyCollections implements Containers<Integer, String> {
	private static Map<String, Integer> myMap = null;

	public Set<Integer> initSet(Integer[] tArray) {
	    return new HashSet<Integer>(Arrays.asList(tArray));
	}

	public List<Integer> initList(Integer[] tArray) {
	    return Arrays.asList(tArray);
	}

	public Map<String, Integer> initEmptyMap() {
	    return new HashMap<String, Integer>();
	}

	public void storeMap(Map<String, Integer> mapToStoreInClass) {
	    myMap = mapToStoreInClass;
	}

	// TODO: unsure what should do. simplify.
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
	    if (overwriteExistingKey) {
		myMap.remove(key);
		myMap.put(key, value);
		return true;
	    } else {
		if (myMap.get(key) == null) {
		    myMap.put(key, value);
		}
		return false;
	    }
	}

	public Integer getValueFromMap(String key) {
	    return myMap.get(key);
	}

	public Integer getValueFromMap(String key, Integer defaultValue) {
	    if (myMap.get(key) != null) {
		return myMap.get(key);
	    } else {
		return defaultValue;
	    }
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
	    getContainers();
	}
}
