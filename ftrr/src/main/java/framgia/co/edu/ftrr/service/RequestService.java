package framgia.co.edu.ftrr.service;

import framgia.co.edu.ftrr.dto.request.RequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequestService {

    List<RequestDTO> insertListRequest(List<RequestDTO> requestDTOs);

}