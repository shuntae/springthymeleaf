package jp.co.emozon.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.emozon.dao.PlayerDao;
import jp.co.emozon.entity.Player;

@Service
public class PlayerLogic {
	@Autowired
	private PlayerDao playerDao;

	public List<Player> findAll() {
		return playerDao.findAll();
	}

	public Player findOne(Long id) {
		return playerDao.findOne(id);
	}

	public void save(Player player) {
		playerDao.save(player);
	}

	public void update(Player player) {
		playerDao.update(player);
	}

	public void delete(Long id) {
		playerDao.delete(id);
	}
}