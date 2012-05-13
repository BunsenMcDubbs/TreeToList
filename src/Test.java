
public class Test {

	public static void main(String[] args) {
		Tree t = new Tree(new TreeNode(12));
		for(int i = 0; i < 20; i++){
			t.add((int)(Math.random()*100));
		}
		System.out.println("Preorder: " + t.preorderToString());
		System.out.println("Ordered: " + t.toString());
		System.out.println("Postorder: " + t.postorderToString());
		System.out.println(t.toString());
		t.convert();
		System.out.println(t);
	}

}
