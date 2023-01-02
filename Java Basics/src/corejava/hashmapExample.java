package corejava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		hm.put(0, "Ansar");
		hm.put(1, "Hussain");
		hm.put(2, "Sama");
		hm.put(3, "Ilhan");
		System.out.println(hm.get(3));
		hm.remove(3);
		System.out.println(hm.get(3));
		Set sn = hm.entrySet();

		Iterator it = sn.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
	}

}
