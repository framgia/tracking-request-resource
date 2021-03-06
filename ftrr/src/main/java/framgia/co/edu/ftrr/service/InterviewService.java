package framgia.co.edu.ftrr.service;

import framgia.co.edu.ftrr.dto.request.InterviewDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public interface InterviewService {
    List<InterviewDTO> saveInterviews(Map<Integer, InterviewDTO> map);
    List<InterviewDTO> importFromExcel(MultipartFile multipartFile);
}
