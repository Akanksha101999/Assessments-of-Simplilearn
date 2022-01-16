package git11Questions;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Collection {

	public static void main(String[] args) {
			//ArrayList
			ArrayList<String> list =new ArrayList<>();
			list.add("Akriti");
			list.add("Jagriti");
			list.add("Sukriti");
			list.add(null);
			list.add("Sukriti");
			System.out.println("ArrayList Elements:" + list);
			
			//LinkedList
			LinkedList<String> nlist =new LinkedList<>();
			nlist.add("Akriti");
			nlist.add("Jagriti");
			nlist.add("Sukriti");
			nlist.add(null);
			nlist.add("Akriti");
			System.out.println("LinkedList Elements:" + nlist);
			//Vector
			Vector<String> vlist =new Vector<>();
			vlist.add("Akriti");
			vlist.add("Jagriti");
			vlist.add("Sukriti");
			vlist.add(null);
			vlist.add("Akriti");
			System.out.println("Vector Elements:" + vlist);
			
			//Set
			//HashSet
			HashSet<String> hlist =new HashSet<>();
			hlist.add("Akriti");
			hlist.add("Jagriti");
			hlist.add("Sukriti");
			hlist.add(null);
			hlist.add("Akriti");
			System.out.println("HashSet Elements:" + hlist);
			//LinkedHashSet
			LinkedHashSet<String> clist =new LinkedHashSet<>();
			clist.add("Akriti");
			clist.add("Jagriti");
			clist.add("Sukriti");
			clist.add(null);
			clist.add("Akriti");
			System.out.println("LinkedHashSet Elements:" + clist);
			
			//TreeSet
			TreeSet<String> tlist =new TreeSet<>();
			tlist.add("Akriti");
			tlist.add("Jagriti");
			tlist.add("Sukriti");
			//tlist.add(null); not allowed in treeset
			tlist.add("Akriti");
			System.out.println("TreeSet Elements:" + tlist);
			
			//Queue
			Deque<String> name=new ArrayDeque<>();
			name.add("Kavita");
			name.add("Sunil");
			name.add("Nisha");
			name.add("Monica");
			System.out.println(name);
			
			
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Kavita");
		pq.add("Sunil");
		pq.add("Nisha");
		pq.add("Monica");
		pq.add("Sunil");
		pq.add("Sunil");
		//name.add(null); //throw exception
		System.out.println(pq);
		
		
	}



	}


