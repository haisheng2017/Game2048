package hao.game2048.dao;

import hao.game2048.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * create by hao 2018/6/21
 */
//Repository<T,ID>
public interface UserDao extends CrudRepository<User,Integer> {
}
