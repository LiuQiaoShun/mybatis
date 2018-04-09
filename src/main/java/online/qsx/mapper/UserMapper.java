package online.qsx.mapper;

import online.qsx.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserByName(String username);

    int saveUser(User user);
}
