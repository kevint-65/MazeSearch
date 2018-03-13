
import java.util.ArrayList;

/**
 * This class is a helper class to the node class used to write the graph class.
 */
public class Node {
 
	int visitedOrder;
	public Node p;
	ArrayList<Node> adjacent;

	public int color, label, distance;
	public int discTime, finTime;
	public int horizontalPosition, verticalPosition;
	public boolean inLine, Lcol, Rcol, Trow, Brow;
	public boolean leftExist, rightExist, topExist, bottomExist;
	public boolean wasVisited;
	Graph graph;

	// constructor for the node class
	public Node(Graph graph, int i, int j, int label) {

		leftExist = true;
		rightExist = true;
		topExist = true;
		bottomExist = true;
		inLine = false;
		Lcol = false;
		Rcol = false;
		Trow = false;
		Brow = false;
		color = Graph.WHITE;
		adjacent = new ArrayList<>();
		visitedOrder = 0;
		this.graph = graph;
		this.label = label;
		wasVisited = false;
		horizontalPosition = i;
		verticalPosition = j;

		if (i == 0) {
			Lcol = true;
		}
		if (i == graph.length - 1) {
			Rcol = true;
		}
		if (j == 0) {
			Trow = true;
		}
		if (j == graph.length - 1) {
			Brow = true;
		}

	}
}
