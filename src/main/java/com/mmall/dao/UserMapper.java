package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

    String selectQuestionByUsername(String username);

    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

    int checkPassword(@Param("password")String password,@Param("userId")Integer userId);

    int checkEmailByUserId(@Param("email")String email,@Param("userId")Integer userId);

    //mybatis在传多个参数的时候需要使用@Param，在写sql的时候需要对应注解中的string
    User selectLogin(@Param("username") String username,@Param("password") String password);


}