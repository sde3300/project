package com.spring.web.board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.board.service.BoardService;
import com.spring.web.vo.boardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list(@ModelAttribute("searchVO") boardVO searchVO, Model model) {
		
		
		List<boardVO> boardList = boardService.getList(searchVO);
		
		model.addAttribute("boardList",boardList);
		
		return "/board/list";
	}
	
	@RequestMapping(value = "/board/create", method = RequestMethod.GET)
		public String create(@ModelAttribute("searchVO")boardVO searchVO, Model model) {
		
		return "/board/create";
	}
	
	@RequestMapping(value = "/board/create_action", method = RequestMethod.POST)
	public String create_action(@ModelAttribute("searchVO") boardVO searchVO, RedirectAttributes redirect) {
		
		try {
			
			SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
			Date time = new Date();
			String time1 = format1.format(time);
			searchVO.setBoard_regdate(time1);
			
			boardService.insertBoard(searchVO);
			
			redirect.addFlashAttribute("redirect", searchVO.getBoard_idx());
			redirect.addFlashAttribute("msg", "등록이 완료되었습니다.");
			
		} catch (Exception e) {
			
			redirect.addFlashAttribute("msg", "오류가 발생되었습니다.");
			
		}
		
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/read", method = RequestMethod.GET)
	public String read(@ModelAttribute("searchVO") boardVO searchVO, @RequestParam("board_idx") int board_idx, Model model) {
		
		boardVO boardContents = boardService.getBoardContents(board_idx);
		model.addAttribute("boardContents", boardContents);
		
		return "/board/read";
	}
	
//	UPDATE
	@RequestMapping(value = "/board/update", method = RequestMethod.GET)
	public String update(@ModelAttribute("serchVO") boardVO searchVO, @RequestParam("board_idx") int board_idx, Model model) {
		return "/board/update";
	}

}
