package InterFace;

public class BoardServiceimpl implements BoardService {

	@Override
	public void registerBoard(String params) {
		System.out.println("게시판 등록");
	}

	@Override
	public void registerBoard(String params, String files) {
		System.out.println("게시판 등록");
	}

	@Override
	public void getBoardDetail(Long idx) {
		System.out.println("게시판 상세설명 가져오기");
	}

	@Override
	public void deleteBoard(Long idx) {
		System.out.println("게시판 목록 삭제");
	}

	@Override
	public void getBoardList(String params) {
		System.out.println("게시판 목록 가져오기");
	}

	@Override
	public void getAttachFileList(Long boardIdx) {
		System.out.println("게시판 첨부파일 목록 가져오기");
	}

	@Override
	public void getAttachDetail(Long idx) {
		System.out.println("게시판 첨부파일 상세목록 가져오기");
	}

}
