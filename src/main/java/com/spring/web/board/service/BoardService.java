package com.spring.web.board.service;

import java.util.List;

import com.spring.web.vo.boardVO;

public interface BoardService {

	List<boardVO> getList(boardVO searchVO);

	void insertBoard(boardVO searchVO);

	boardVO getBoardContents(int board_idx);
	
//	update
	void updateBoard(boardVO searchVO);
	
//	delete
	void getBoardDelete(int board_idx);
}
