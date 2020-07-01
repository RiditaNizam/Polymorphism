
public class Client {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		Plant plant2 = tree; // Fine because a tree is a plant
		plant2.grow(); // Points at tree, so it uses its grow method
		tree.shedLeaves();
		doGrow(tree);
	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}

}