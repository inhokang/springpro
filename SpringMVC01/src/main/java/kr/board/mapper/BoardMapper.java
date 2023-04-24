package kr.board.mapper;

import java.util.List;

import kr.board.entity.Board;

//@Mapper - Mybatis api가 가지고 있는 api
public interface BoardMapper {
	public List<Board> getLists(); //전체 리스트
}
