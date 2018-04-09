package online.qsx.service;

import online.qsx.mapper.RoleMapper;
import online.qsx.mapper.UserMapper;
import online.qsx.model.Role;
import online.qsx.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    public User getUserByName(String username){
        User user=userMapper.getUserByName(username);

        System.out.println(user);
        return user;
    }


    public Boolean saveUser(User user){
       String roleName= user.getRoles().get(0).getName();
        Role role=roleMapper.getRoleByName(roleName);
        if(role == null){
            roleMapper.saveRoleByName(roleName);
            role=roleMapper.getRoleByName(roleName);
        }
        //此处我们希望拿到新增的角色表新记录的id
        int roleId=role.getId();

        //新增用户
        userMapper.saveUser(user);

        //得到用户id
        int userId=userMapper.getUserByName(user.getUsername()).getId();
        //再往中间表里面加Id
//        roleId=userId;
        System.out.println(user);
        return true;
    }
}
