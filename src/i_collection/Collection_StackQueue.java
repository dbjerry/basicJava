package i_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection_StackQueue {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("==========Stack==========");
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		
		Queue<String> q = new LinkedList<String>();
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("\n==========Queue==========");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
		
	}
}
