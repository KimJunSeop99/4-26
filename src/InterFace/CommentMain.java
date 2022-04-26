package InterFace;

public class CommentMain {

	public static void main(String[] args) {
		CommentServiceImpl c = new CommentServiceImpl();
		
		c.registerComment(null);
		c.deleteComment(null);
		c.getCommentList(null);
		
		
	}

}
