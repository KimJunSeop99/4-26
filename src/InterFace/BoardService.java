package InterFace;

import java.util.List;

import BBS.AttachDTO;

public interface BoardService {
	public void registerBoard(String params);
	public void registerBoard(String params, String files);
	public void getBoardDetail(Long idx); 
	public void deleteBoard(Long idx);
	public void getBoardList(String params);
	public void getAttachFileList(Long boardIdx);
	public void getAttachDetail(Long idx);
}
