package framgia.co.edu.ftrr.util;

import framgia.co.edu.ftrr.dto.request.UserDTO;
import framgia.co.edu.ftrr.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserUtils {

    private static final Logger logger = LoggerFactory.getLogger(UserUtils.class);

    public static UserDTO userToUserDTO(User user) {
        try {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user, userDTO);
            return userDTO;
        } catch (Exception e) {
            logger.error("Error in userToUserDTO: " + e.getMessage());
            return null;
        }
    }

    public static List<UserDTO> listUserToListUserDTO(List<User> users) {
        try {
            return users.stream().map(user -> userToUserDTO(user)).collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error in listUserToListUserDTO: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public static User userDTOToUser(UserDTO userDTO) {
        try {
            User user = new User();
            BeanUtils.copyProperties(userDTO, user);
            return user;
        } catch (Exception e) {
            logger.error("Error in userDTOToUser: " + e.getMessage());
            return null;
        }
    }

    public static List<User> listUserDTOToListUser(List<UserDTO> userDTOs) {
        try {
            return userDTOs.stream().map(userDTO -> userDTOToUser(userDTO)).collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error in listUserDTOToListUser: " + e.getMessage());
            return Collections.emptyList();
        }
    }

}
