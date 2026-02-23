package kr.co.study.board.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter 
@NoArgsConstructor
@AllArgsConstructor 
@Builder
public class ResBoardDTO {
	private Long id = 1;
	private String category = "공지";
	private String title = "제목입니다.";
	private String content = "내용!!!";
	private String writerName;
	private LocalDateTime createdAt;
	private int viewCount;
	private List<ResBoardFileDTO> files;
}








