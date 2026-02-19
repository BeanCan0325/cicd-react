package kr.co.study.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.co.study.board.dto.ResBoardFileDTO;
import kr.co.study.board.entity.Board;

/**
 * 게시판 첨부파일을 저장/조회/삭제 담당하는 서비스
 * 게시판 도메인(Board)에서만 사용하는 전용 파일 서비스
 */
public interface BoardFileService {
	/**
	 * 게시글 첨부 파일 저장
	 *  - files가 비어있으면 종료 (사용자가 파일을 업로드 하지 않았다면)
	 *  - 파일명(UUID) 생성 후 로컬에 저장
	 *  	> /src/reousrces/static/uploads/board
	 *  - board_file 테이블에 저장
	 *  
	 *  @param board 게시글 엔티티
	 *  @param files 업로드 파일 목록
	 */
	void saveFiles(Board board, List<MultipartFile> files);
	
	/**
	 * 파일 정보 조회
	 *  - board_id 기준으로 파일 조회
	 */
	List<ResBoardFileDTO> getFiles(Long boardId);
	
}












