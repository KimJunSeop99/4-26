package BBS;

public class DTOTest {

	public static void main(String[] args) {
		CommonDTO c1 = new CommonDTO();
		CommentDTO c2 = new CommentDTO();
		
		c1.setPaginationInfo("페이징 정보");
		c1.setDeleteYn(true); // 삭제여부 true,false;
		c1.setInsertTime("등록일");
		c1.setUpdateTime("수정일");
		c1.setDeleteTime("삭제일");
		
		c2.setIdx(1); // 글번호
		c2.setBoardIdx(1); // 게시판ID
		c2.setContent("게시판 내용");
		c2.setWriter("글쓴이");
		// CommonDTO의 메소드 info
		c1.info();
		System.out.println("-------------------");
		// CommentDTO의 메소드 info
		c2.info();
		System.out.println("--------------------");
		AttachDTO a1 = new AttachDTO();
		a1.setBoardIdx(1);
		a1.setIdx(1);
		a1.setOriginalName("원본파일명");
		a1.setSaveName("저장파일명");
		a1.setSize(100);
		
		//현재 저장된 클래스 정보를 출력
		a1.info();
		
		
		
	}

}
