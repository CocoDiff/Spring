package kr.co.shinchen.main.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import kr.co.shinchen.main.model.BoardVo;
import kr.co.shinchen.main.model.Criteria;
import kr.co.shinchen.main.model.PagingVo;

@Mapper("mainMapper")
public interface MainMapper {

	public List<BoardVo> selectList(HashMap<String, Object> obj);

	public BoardVo getView(int col_num);
	
	public void insertList(BoardVo vo);

	public void updateList(BoardVo vo);
	
	public void delete(int col_num);
	
	public int getTotal();

	public List<BoardVo> searchList(Criteria cri);
	
	
}
