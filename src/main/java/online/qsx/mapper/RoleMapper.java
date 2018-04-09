package online.qsx.mapper;

import online.qsx.model.Role;
import online.qsx.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    Role getRoleByName(String username);


    void saveRoleByName(String username);
}
