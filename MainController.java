package kr.co.shinchen.main.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.ModelAndView;

import kr.co.shinchen.main.model.BoardVo;
import kr.co.shinchen.main.model.Criteria;
import kr.co.shinchen.main.model.PagingVo;
import kr.co.shinchen.main.service.MainService;

@Controller
public class MainController {
	
	@Resource(name="mainService")
	public MainService service;
	
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public String mainPage() {
		return "/main";
	}
	
	//리스트 및 검색
	@RequestMapping(value="/board.do", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView boardList(BoardVo vo, Criteria cri, @RequestParam HashMap<String, Object> params) {	
		ModelAndView model = new ModelAndView("jsonView");
		
  		int nowPage = Integer.parseInt(params.get("nowPage").toString());
		int total = service.getTotal();
		model.addObject("total", total);
		
		PagingVo paging = new PagingVo(nowPage, total);
		model.addObject("paging", paging);
		
		List<BoardVo> boardList = service.selectList(vo, paging);
 		model.addObject("list", boardList);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
 		
 		Map<String, Object> result = new HashMap<String, Object>();
 		
 		List<BoardVo> searchList = service.searchList(cri);
		result.put("searchList", searchList);
		
		model.addObject("searchList", searchList);
		return model;
	}
	
	@RequestMapping(value="/viewPost.do", method=RequestMethod.GET)
	public ModelAndView viewPost(int col_num) {
		ModelAndView model = new ModelAndView("viewPost");
		model.addObject("viewPost", service.getView(col_num));
		return model;
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String insertPage() {
		return "/insert";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insertBoard(BoardVo vo) {
		service.insertList(vo);
		return "redirect:/main.do";
	}
	
	//수정 기능은 모달로 구현
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String updateBoard(BoardVo vo) {
		service.updateList(vo);
		return "redicrect:/main.do";
	}
	
	@RequestMapping(value="delete.do", method=RequestMethod.POST)
	public String delete(int col_num) {
		service.delete(col_num);
		return "redirect:/main.do";
	}
	
	@RequestMapping(value="/jido.do")
	public String jido() {
		return "/jido";
	}
}
