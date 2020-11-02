package jp.co.emozon.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.emozon.entity.Player;

@Mapper
public interface PlayerDao {
	List<Player> findAll();

	Player findOne(Long id);

	void save(Player player);

	void update(Player player);

	void delete(Long id);
}