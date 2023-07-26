
public class Exercise2 {
	
	//Clase Node
	public static class Node{
		
		public int value;
		public Node left, right;
		
		public Node(int value) {
			this.value = value;
			left = null;
			right= null;
		}
	}
	
	//Clase Count
	public static class Count{
		public int count = 0 ;
	}
	
	//Clase BinaryTree
	public static class BinaryTree{
		
		public Node root;
		public Count ct = new Count() ;
		boolean left;
		boolean right;
		
		public boolean countSingleRec(Node node, Count c) {
			boolean answer = false;
			
			if (node == null) {
				answer = true;
			}
			
			this.left = countSingleRec(node.left, c);
			boolean right = countSingleRec(node.right, c);
			
			if (!left || !right) {
				answer = false;
			}
			
			if (node.right != null && node.value != node.right.value) {
				answer = false;
			}
			
			if (node.left != null && node.value != node.left.value) {
				answer = false;
			}
			
			if (!answer) {
				c.count++;
				answer = true;
			}
			return answer;	
		}
		
		public int countSingle(Node node) {
			countSingleRec(node, ct);
			return ct.count;
		}
		
		public int countSingle() {
			return countSingle(root);
		}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(0);
		tree.root.left = new Node(1);
		tree.root.right = new Node(0);
		tree.root.right.left = new Node(1);
		tree.root.right.right = new Node(0);
		tree.root.right.left.right = new Node(1);
		tree.root.right.left.left = new Node(1);
		
		System.out.println("The number of universal value trees is: "+ tree.countSingle());
		
		
	}

}
