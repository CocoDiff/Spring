package kr.co.shinchen.main.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.shinchen.main.model.BoardVo;
import kr.co.shinchen.main.model.Criteria;
import kr.co.shinchen.main.model.PagingVo;
import kr.co.shinchen.main.service.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	@Resource(name="mainMapper")
	public MainMapper mapper;

	@Override
	public void insertList(BoardVo vo) {
		mapper.insertList(vo);
	}

	@Override
	public BoardVo getView(int col_num) {
		return mapper.getView(col_num);
	}

	@Override
	public void delete(int col_num) {
		mapper.delete(col_num);
	}

	@Override
	public void updateList(BoardVo vo) {
		mapper.updateList(vo);
	}
	
	public int getTotal() {
		return mapper.getTotal();
	}

	@Override
	public List<BoardVo> selectList(BoardVo vo, PagingVo paging) {
		HashMap<String, Object> obj = new HashMap<String, Object>();
		obj.put("offset", paging.getOffset());
		return mapper.selectList(obj);
	}

	@Override
	public List<BoardVo> searchList(Criteria cri) {
		return mapper.searchList(cri);
	}
	
	
}
