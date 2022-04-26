package InterFace;

public class BoardMain {

	public static void main(String[] args) {
		BoardServiceimpl b = new BoardServiceimpl();
		
		b.registerBoard("");
		b.registerBoard("", "");
		
	}

}
