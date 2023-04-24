package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller
public class BoardController {

	// /boardList.do
	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		
		Board vo = new Board();
		vo.setIdx(1);
		vo.setTitle("게시판실습");
		vo.setContent("게시판실습");
		vo.setWriter("강태윤");
		vo.setIndate("2023-04-25");
		vo.setCount(0);
		
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		//객체바인딩 Model를 이용한 객체바인딩
		model.addAttribute("list", list);
		return "boardList"; // /WEB-INF/views/boardList.jsp -> forward(viewResolver)
	}
}
