package kr.co.shinchen.main.service;

import java.util.List;

import kr.co.shinchen.main.model.BoardVo;
import kr.co.shinchen.main.model.Criteria;
import kr.co.shinchen.main.model.PagingVo;

public interface MainService {

	public BoardVo getView(int col_num);

	public void insertList(BoardVo vo);

	public void delete(int col_num);
	
	public void updateList(BoardVo vo);
	
	public int getTotal();

	public List<BoardVo> selectList(BoardVo vo, PagingVo paging);

	public List<BoardVo> searchList(Criteria cri);

}
