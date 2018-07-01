package hao.game2048.dao;

import hao.game2048.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * create by hao 2018/6/21
 */
//Repository<T,ID>
public interface UserDao extends CrudRepository<User,Integer> {
    //CrudRepo
    // save: 新的插入|已有的修改


    //自定义sql
    Optional<User> findByName(String name);
}
