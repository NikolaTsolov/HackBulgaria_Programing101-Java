package wednesday;

import java.util.*;

public class ImplementOnOffCollection<T> extends HashSet<T> {

	private static final long serialVersionUID = 1L;


	@Override
	public boolean add(T e) {
		if (super.contains(e)) {
			super.remove(e);
			return false;
		}
		super.add(e);
		return true;
	}


	public static void main(String[] args) {
		ImplementOnOffCollection<Integer> h = new ImplementOnOffCollection<>();
		h.add(1);
		h.add(1);
		h.add(2);
		h.add(3);
		
		for(int el : h){
			System.out.print(el);
		}
	}

}
