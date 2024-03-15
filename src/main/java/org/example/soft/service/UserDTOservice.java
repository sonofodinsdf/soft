package org.example.soft.service;

import org.example.soft.Entity.UserDTO;
import org.example.soft.common.Result;
import com.github.yulichang.base.MPJBaseService;

import java.util.List;


public interface UserDTOservice extends MPJBaseService<UserDTO> {
    public Long Register(UserDTO user);
    public List<UserDTO> SelectallUser();
    public UserDTO SelectById(Long id);
    public Result<Object> DeletedById(Long id);
    public Result<Object> UpdateById(UserDTO userDTO);
}
