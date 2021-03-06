package framgia.co.edu.ftrr.service;

import framgia.co.edu.ftrr.config.CustomPrincipal;
import framgia.co.edu.ftrr.dto.request.UserDTO;
import framgia.co.edu.ftrr.dto.response.InterviewerSearchResponse;
import framgia.co.edu.ftrr.dto.response.UserWsmResponse;
import framgia.co.edu.ftrr.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface UserService {
    CustomPrincipal loadCustomPrincipal(String username);

    UserDTO findByEmail(String email);

    Boolean existsTrainer(String name, String language);

    User loadCurrentLoginUser();

    CustomPrincipal loadOrUpdateUser(UserWsmResponse userWsmResponse);

    Page<UserDTO> searchInterviewers(InterviewerSearchResponse interviewerSearchResponse, Pageable pageable);
}
